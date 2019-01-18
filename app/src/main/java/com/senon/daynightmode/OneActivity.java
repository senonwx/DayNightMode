package com.senon.daynightmode;

import android.view.View;
import android.widget.TextView;
import org.greenrobot.eventbus.EventBus;

public class OneActivity extends BaseActivity {

    private TextView tv;

    @Override
    int getLauyoutId() {
        return R.layout.activity_one;
    }

    @Override
    void init() {
        tv = findViewById(R.id.mode_tv);
        tv.setText("模式："+(PreferenceUtil.getBoolean(PreferenceUtil.isNight,false)?"黑夜":"白天"));

    }

    public void onClick(View view) {
        PreferenceUtil.putBoolean(PreferenceUtil.isNight,!PreferenceUtil.getBoolean(PreferenceUtil.isNight,false));
        PreferenceUtil.commit();

        tv.setText("模式："+(PreferenceUtil.getBoolean(PreferenceUtil.isNight,false)?"黑夜":"白天"));

        //通知更改baseactivity的主题
        BaseEvent event = new BaseEvent();
        event.setCode(1);
        EventBus.getDefault().post(event);
    }


    public void onBack(View view) {
        finish();
    }
}
