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
 * Created by taipham on 28/04/2018.
 */

public class TraCuuActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracuu);
        getSupportActionBar().setTitle("Tra cứu cửa hàng");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<ItemListView1> list = GetListData();

        listView = (ListView)findViewById(R.id.listViewTraCuu);
        CustomListAdapter1 adapter = new CustomListAdapter1(this,R.layout.custom_itemlistview1,list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mess = "";
                switch (i) {
                    case 0:
                        mess = "";
                        break;
                    case 1:
                        mess = "FamilyMart";
                        break;
                    case 2:
                        mess = "Bs'mart";
                        break;
                    case 3:
                        mess = "Circle K";
                        break;
                    case 4:
                        mess = "MiniStop";
                        break;
                    case 5:
                        mess = "Shop & Go";
                        break;
                    case 6:
                        mess = "Vinmart+";
                        break;
                    case 7:
                        mess = "SatraFoods+";
                        break;
                    case 8:
                        mess = "CoopFood";
                        break;
                    case 9:
                        mess = "HaproFood";
                        break;
                    case 10:
                        mess = "FoodcoMart";
                        break;
                }

                Intent intent = new Intent(TraCuuActivity.this,MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("MESS", mess);
                intent.putExtra("BUNDLE",bundle);
                startActivity(intent);
//                if(i == 0){
//                    intent = new Intent(getApplicationContext(), .class);
//                    startActivity(intent);
//                }else if(i == 1){
//                    intent = new Intent(getApplicationContext(), ThongTinTeamActivity.class);
//                    startActivity(intent);
//                }

                //code o day
            }
        });
    }

    private ArrayList <ItemListView1> GetListData() {
        ArrayList<ItemListView1> list = new ArrayList<>();
        ItemListView1 cuaHang = null;
        cuaHang = new ItemListView1("icon_checkall", "Chọn tất cả cửa hàng");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_familymart", "FamilyMart VietNam");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_bsmart", "Bs'mart VietNam");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_circlek", "Circle K");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_ministop", "MiniStop VietNam");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_shopgo", "Shop&Go VietNam");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_vinmart", "Vinmart +");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_satrafood", "SatraFoods +");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_coopfood", "CoopFood");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_hapro", "HaproFood");
        list.add(cuaHang);
        cuaHang = new ItemListView1("icon_focomart", "FoodcoMart");
        list.add(cuaHang);
        return list;
    }
}
