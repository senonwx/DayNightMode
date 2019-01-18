package com.senon.daynightmode;

import android.content.Intent;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends BaseActivity {

    private TextView tv;

    @Override
    int getLauyoutId() {
        return R.layout.activity_main;
    }

    @Override
    void init() {
        tv = findViewById(R.id.mode_tv);
        tv.setText("模式："+(ModeConstant.isNight?"黑夜":"白天"));
    }

    public void onClick(View view) {
        ModeConstant.isNight = !ModeConstant.isNight;
        tv.setText("模式："+(ModeConstant.isNight?"黑夜":"白天"));

        //通知更改baseactivity的主题
        BaseEvent event = new BaseEvent();
        event.setCode(1);
        EventBus.getDefault().post(event);
    }

    public void onIntent(View view) {
        startActivity(new Intent(this,OneActivity.class));
    }

}
