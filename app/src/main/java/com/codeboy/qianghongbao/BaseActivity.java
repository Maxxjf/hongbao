package com.codeboy.qianghongbao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * <p>Created 16/12/16 上午1:16.</p>
 * <p><a href="mailto:841100358@qq.com">Email:841100358@qq.com</a></p>
 *
 * @author Max
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        QHBApplication.activityCreateStatistics(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        QHBApplication.activityResumeStatistics(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        QHBApplication.activityPauseStatistics(this);
    }
}
