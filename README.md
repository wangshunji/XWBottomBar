# XWBottomBar
### 使用步骤：

 本框架目前是从EncapsulationBottomBar克隆过来做了一点点小改动，可以加载阿里的ARouter的页面，需要的朋友可以直接去：https://github.com/PikachuStore/EncapsulationBottomBar  用原作者的
 谢谢

第一步： 在project的build.gradle中加入
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

第二步： 在moudle的build.gradle中加入
```
dependencies {
	   implementation 'com.github.wangshunji:XWBottombar:v1.0.0'
}
```

第三步： xml:
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.macpro.myapplication.MainActivity">

    <org.bottombar.widget.EncapsulationBottomBar
        android:id="@+id/bottom_bar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</RelativeLayout>
```

第四步： 在Activity中添加如下代码：
```

    // 设置数据即可
    bottomBar.setTabDatas(initDatas());

    private List<BottomBarEntity> initDatas() {

        List<BottomBarEntity> list = new ArrayList<>();


        list.add(new BottomBarEntity(BlankFragment.class,
                new BottomBarItem(this,R.mipmap.msg_normal,R.mipmap.msg_press,
                        R.color.bottom_bar_selector,"消息","100",CircleStyle.WHITESOLID)
        ));

        Bundle bundle = new Bundle();
        bundle.putString("url","http:");

        list.add(new BottomBarEntity(BlankFragment.class,
                new BottomBarItem(this,R.mipmap.communication_normal,R.mipmap.communication_press,
                       Color.RED,Color.BLUE,"通讯",100,CircleStyle.WHITESOLID),bundle
        ));

        ... // 有很多重载方法

        return list;

    }
```

```
// 动态更新底部按钮index位置的数字提示
bottomBar.setNoticeNum(index,int or string);
// 重写index位置的底部按钮点击事件
bottomBar.overwriteListener(index,listener);
... 
```
> 效果

![这里写图片描述](https://raw.githubusercontent.com/PikachuStore/EncapsulationBottomBar/master/Screenshot_2018-01-07-11-55-51.png)


