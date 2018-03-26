package com.example.macpro.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by shunjiwang on 2018/3/26.
 */
@Route(path = "/main/mine")
public class MineFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mine,null);
        Log.d("shunji","onCreateView");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("shunji","oncreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("shunji","onStart");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("shunji","onStop");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("shunji","onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("shunji","onPause");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("shunji","onDestroy");

    }
}

