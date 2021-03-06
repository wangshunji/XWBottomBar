package com.example.macpro.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import org.bottombar.bean.BottomBarEntity;
import org.bottombar.widget.BottomBarItem;
import org.bottombar.widget.CircleStyle;
import org.bottombar.widget.EncapsulationBottomBar;


import java.util.ArrayList;
import java.util.List;

@Route(path = "/main/main")
public class MainActivity extends AppCompatActivity {

    EncapsulationBottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1
        bottomBar = findViewById(R.id.bottom_bar);

        // 2
        bottomBar.setTabDatas(initDatas());

        bottomBar.setLineColor(Color.RED);
        bottomBar.overwriteListener(2, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "重写点击事件", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });


        bottomBar.setNoticeNum(1, "1");
        bottomBar.setNoticeStyle(1, CircleStyle.REDSOLID);
    }

    private List<BottomBarEntity> initDatas() {

        List<BottomBarEntity> list = new ArrayList<>();

         // 获取Fragment
        Fragment blank = (Fragment) ARouter.getInstance().build("/main/blank").navigation();
        Fragment mine = (Fragment) ARouter.getInstance().build("/main/mine").navigation();

        list.add(new BottomBarEntity(blank.getClass(),
                new BottomBarItem(this, R.mipmap.msg_normal, R.mipmap.msg_press,
                        R.color.bottom_bar_selector, "消息", "100", CircleStyle.WHITESOLID)
        ));

        Bundle bundle = new Bundle();
        bundle.putString("url", "http:");

        list.add(new BottomBarEntity(mine.getClass(),
                new BottomBarItem(this, R.mipmap.communication_normal, R.mipmap.communication_press,
                        Color.RED, Color.BLUE, "通讯", 100, CircleStyle.WHITESOLID)
        ));
        list.add(new BottomBarEntity(blank.getClass(),
                new BottomBarItem(this, R.mipmap.communication_normal, R.mipmap.communication_press,
                        Color.RED, Color.BLUE, "通讯", "", CircleStyle.REDSOLID, true)
        ));
        return list;
    }

    private void classLoader() {
//        ClassLoader.
    }
}
