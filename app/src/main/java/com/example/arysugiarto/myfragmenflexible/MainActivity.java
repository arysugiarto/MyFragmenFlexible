package com.example.arysugiarto.myfragmenflexible;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmenTransaction = mFragmentManager.beginTransaction();
        HomeFragment mHomeFragment = new HomeFragment();
        mFragmenTransaction.add(R.id.frame_container, mHomeFragment, HomeFragment.class.getSimpleName());

        Log.d("MyFlexibleFragment","Fragment Name :"+HomeFragment.class.getSimpleName());
        mFragmenTransaction.commit();
    }
}
