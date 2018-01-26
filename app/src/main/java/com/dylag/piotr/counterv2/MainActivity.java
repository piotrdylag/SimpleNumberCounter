package com.dylag.piotr.counterv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btnadd;
    Button btnmin;
    Button btnres;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button) findViewById(R.id.btadd);
        txv = (TextView) findViewById(R.id.tx);
        btnmin = (Button) findViewById(R.id.btmin);
        btnres = (Button) findViewById(R.id.btres);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter --;
                txv.setText(Integer.toString(mCounter));
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                txv.setText(Integer.toString(mCounter));
            }
        });

    }
}
