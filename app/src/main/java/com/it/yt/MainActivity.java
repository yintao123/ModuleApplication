package com.it.yt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yt.it.ServiceFactory;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_home).setOnClickListener(v -> {
            ServiceFactory.getInstance().getiHomeService().launch(MainActivity.this,"");
        });
        findViewById(R.id.bt_user).setOnClickListener(v -> {
            ServiceFactory.getInstance().getiUserService().launch(MainActivity.this,12);
        });
        findViewById(R.id.showUI).setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            ServiceFactory.getInstance().getiHomeService().newHomeFragment(getSupportFragmentManager(),R.id.container,bundle);
        });
    }
}
