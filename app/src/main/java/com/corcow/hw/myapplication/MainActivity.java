package com.corcow.hw.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NetworkManager.getInstance().test365(MainActivity.this, "nozzang@no.zzang", "no", "노", new NetworkManager.OnResultListener<String>() {
                    @Override
                    public void onSuccess(String result) {
                        Toast.makeText(MainActivity.this, "success" + result, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFail(int code) {
                        Toast.makeText(MainActivity.this, "fail" + code, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        btn = (Button)findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DynamicGridActivity.class));
            }
        });

    }
}
