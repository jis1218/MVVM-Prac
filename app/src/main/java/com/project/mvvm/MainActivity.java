package com.project.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.project.mvvm.databinding.MainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        MainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.main);
        User user = new User("insup", "hanol");
        mainBinding.setUser(user);
    }
}
