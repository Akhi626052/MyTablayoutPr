package com.daizzyinfo.mytablayoutpr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.daizzyinfo.mytablayoutpr.databinding.ActivityMainBinding;
import com.daizzyinfo.mytablayoutpr.fragment.PastFragment;
import com.daizzyinfo.mytablayoutpr.fragment.TodayFragment;
import com.daizzyinfo.mytablayoutpr.fragment.UpcomingFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ViewPagerAdapter adapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

       binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        adapters=new ViewPagerAdapter(getSupportFragmentManager(),3);





        adapters.addfragment(new TodayFragment(),"fragment");
        adapters.addfragment(new UpcomingFragment(),"title");
        adapters.addfragment(new PastFragment(),"title");

        binding.viewPager.setAdapter(adapters);
        binding.tabLayout.setupWithViewPager(binding.viewPager);



    }
}