package com.app.trekking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.septa.storemap.R;

import java.util.ArrayList;

/**
 * Created by taipham on 21/04/2018.
 */

public class YKienKHActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ykienkhachhang);
        getSupportActionBar().setTitle("Ý kiến khách hàng");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<ItemListView> list = GetListData();

        listView = (ListView)findViewById(R.id.listViewYKienKH);
        CustomListAdapter adapter = new CustomListAdapter(this,R.layout.custom_itemlistview,list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                if(i == 0){
                    intent = new Intent(getApplicationContext(), GopYSanPhamActivity.class);
                    startActivity(intent);
                }else if(i == 1){
                    intent = new Intent(getApplicationContext(), KhaoSatKHActivity.class);
                    startActivity(intent);
                }


                //code o day
            }
        });
    }

    private ArrayList <ItemListView> GetListData() {
        ArrayList<ItemListView> list = new ArrayList<>();
        ItemListView gopY = new ItemListView("icon_gopy", "Góp ý về sản phẩm", "Nếu quý khách chưa hài lòng về dịch vụ của StoreMap, xin vui lòng góp ý tại đây." );
        ItemListView khaoSat = new ItemListView("icon_khaosat", "Phiếu khảo sát", "Quý khách vui lòng thực hiện phiếu khảo sát để StoreMap nâng cao chất lượng dịch vụ." );

        list.add(gopY);
        list.add(khaoSat);

        return list;
    }
}