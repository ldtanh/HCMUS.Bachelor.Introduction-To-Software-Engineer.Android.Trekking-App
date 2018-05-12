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
 * Created by septa on 4/11/2018.
 */

public class ThongTinActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin);
        getSupportActionBar().setTitle("Thông tin");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<ItemListView> list = GetListData();

        listView = (ListView)findViewById(R.id.listViewThongTin);
        CustomListAdapter adapter = new CustomListAdapter(this,R.layout.custom_itemlistview,list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                if(i == 0){
                    intent = new Intent(getApplicationContext(), ThongTinUngDungActivity.class);
                    startActivity(intent);
                }else if(i == 1){
                    intent = new Intent(getApplicationContext(), ThongTinTeamActivity.class);
                    startActivity(intent);
                }

                //code o day
            }
        });
    }

    private ArrayList <ItemListView> GetListData() {
        ArrayList<ItemListView> list = new ArrayList<>();
        ItemListView gopY = new ItemListView("icon_ttungdung", "Thông tin ứng dụng", "Qúy khách xem thông tin ứng dụng tại đây tại đây." );
        ItemListView khaoSat = new ItemListView("icon_team1", "Thông tin nhà phát triển", "Quý khách xem thông tin nhà phát triển tại đây." );

        list.add(gopY);
        list.add(khaoSat);

        return list;
    }
}
