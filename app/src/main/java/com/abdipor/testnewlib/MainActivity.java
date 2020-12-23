package com.abdipor.testnewlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.abdipor.testlib1.LibMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v=new LibMain(this);
        setContentView(v);

    }
}