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
import android.widget.Toast;

import com.example.septa.storemap.R;

/**
 * Created by septa on 4/11/2018.
 */

public class GopYSanPhamActivity extends AppCompatActivity {
    EditText edtChuDe, edtNoiDung;
    Button btnGuiGopY;
    String nd = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gopysanpham);
        getSupportActionBar().setTitle("Góp ý sản phẩm");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        btnGuiGopY = (Button) findViewById(R.id.btnGuiGopY);
        edtChuDe = (EditText) findViewById(R.id.edtChuDe);
        edtNoiDung = (EditText) findViewById(R.id.edtNoiDung);


        btnGuiGopY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nd = nd + edtChuDe.getText().toString();
                nd = nd  + '\n' + edtNoiDung.getText().toString();


                String[] TO = new String[]{"septantai@gmail.com"};
                //String[] CC = {"xyz@gmail.com"};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");

                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                //emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Góp ý sản phẩm");
                emailIntent.putExtra(Intent.EXTRA_TEXT, nd);

                try {
                    startActivity(Intent.createChooser(emailIntent, "Chọn app gửi góp ý..."));
                    finish();
                    Log.i("Gửi xong.", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(GopYSanPhamActivity.this,
                            "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
