package com.app.trekking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.septa.storemap.R;

/**
 * Created by taipham on 28/04/2018.
 */

public class KhaoSatKHActivity extends AppCompatActivity {
    Button btnGuiKhaoSat;
    RadioGroup rdoGroup1, rdoGroup2, rdoGroup3;
    RadioButton rdoBtn5, rdoBtn6, rdoBtn7, rdoBtn8, rdoBtn1, rdoBtn2, rdoBtn3, rdoBtn4, rdoBtn9, rdoBtn10, rdoBtn11, rdoBtn12;
    EditText edtIpKhaoSat, edtAdrMail, edtPassMail;
    String nd = "", strAdrMail = "", strPassMail = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaosatkh);
        getSupportActionBar().setTitle("Khảo sát ý kiến khách hàng");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AnhXa();

        btnGuiKhaoSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                strAdrMail  = edtAdrMail.getText().toString();
                strPassMail = edtPassMail.getText().toString();

                if(rdoBtn5.isChecked()){
                    nd = nd + "Rất tốt";
                } else if (rdoBtn6.isChecked()){
                    nd = nd + "Tốt ";
                } else if (rdoBtn7.isChecked()){
                    nd= nd + "Trung bình";
                }else if (rdoBtn8.isChecked()){
                    nd = nd + "Kém";
                }

                nd = nd + "\n";

                if(rdoBtn1.isChecked()){
                    nd = nd + "Rất tốt";
                }else if (rdoBtn2.isChecked()){
                    nd = nd + "Tốt";
                }else if (rdoBtn3.isChecked()){
                    nd = nd + "Trung bình";
                }else if (rdoBtn4.isChecked()){
                    nd = nd + "Kém";
                }

                nd =  nd + "\n";

                if(rdoBtn9.isChecked()){
                    nd = nd + "Rất tốt";
                }else if (rdoBtn10.isChecked()){
                    nd = nd + "Tốt";
                }else if (rdoBtn11.isChecked()){
                    nd = nd + "Trung bình";
                }else if (rdoBtn12.isChecked()){
                    nd = nd + "Kém";
                }

                nd = nd + "\n";

                nd = nd +  edtIpKhaoSat.getText().toString();


                String[] TO = new String[]{"septantai@gmail.com"};
                //String[] CC = {"xyz@gmail.com"};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");

                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                //emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Khảo sát ý kiến khách hàng");
                emailIntent.putExtra(Intent.EXTRA_TEXT, nd);

                try {
                    startActivity(Intent.createChooser(emailIntent, "Chọn app gửi góp ý..."));
                    finish();
                    Log.i("Gửi xong.", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(KhaoSatKHActivity.this,
                            "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void AnhXa(){
        btnGuiKhaoSat = (Button) findViewById(R.id.btnGuiKhaoSat);
        rdoGroup1 = (RadioGroup) findViewById(R.id.rdoGroup1);
        rdoGroup2 = (RadioGroup) findViewById(R.id.rdoGroup2);
        rdoGroup3 = (RadioGroup) findViewById(R.id.rdoGroup3);
        rdoBtn1 = (RadioButton) findViewById(R.id.rdoBtn1);
        rdoBtn2 = (RadioButton) findViewById(R.id.rdoBtn2);
        rdoBtn3 = (RadioButton) findViewById(R.id.rdoBtn3);
        rdoBtn4 = (RadioButton) findViewById(R.id.rdoBtn4);
        rdoBtn5 = (RadioButton) findViewById(R.id.rdoBtn5);
        rdoBtn6 = (RadioButton) findViewById(R.id.rdoBtn6);
        rdoBtn7 = (RadioButton) findViewById(R.id.rdoBtn7);
        rdoBtn8 = (RadioButton) findViewById(R.id.rdoBtn8);
        rdoBtn9 = (RadioButton) findViewById(R.id.rdoBtn9);
        rdoBtn10 = (RadioButton) findViewById(R.id.rdoBtn10);
        rdoBtn11 = (RadioButton) findViewById(R.id.rdoBtn11);
        rdoBtn12 = (RadioButton) findViewById(R.id.rdoBtn12);
        edtIpKhaoSat = (EditText) findViewById(R.id.editIpKhaoSat);
        edtAdrMail = (EditText) findViewById(R.id.edtAdrMail);
        edtPassMail = (EditText) findViewById(R.id.edtPassMail);

    }
}
