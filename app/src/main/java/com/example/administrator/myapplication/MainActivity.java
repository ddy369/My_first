package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.administrator.myapplication.mycode.mycodeuntil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mycodeuntil mc = new mycodeuntil();
        TextView tv = (TextView) findViewById(R.id.myTextView);
        tv.setText(mc.get());

        for (int count = 0; count < 10; count++) {
            Log.i("hi baby","count" + count);
        }

    }

}
