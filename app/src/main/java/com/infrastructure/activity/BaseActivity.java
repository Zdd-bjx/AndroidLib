package com.infrastructure.activity;

import android.os.Bundle;
import android.app.Activity;

public abstract class BaseActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariable();
        initViews(savedInstanceState);
        loadData();
    }

    protected abstract void initVariable();

    protected abstract void initViews(Bundle savedInstanceState);

    protected abstract void loadData();
}
