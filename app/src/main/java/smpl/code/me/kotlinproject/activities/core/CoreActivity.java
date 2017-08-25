package smpl.code.me.kotlinproject.activities.core;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import smpl.code.me.kotlinproject.fragments.controller.FragmentController;

/**
 * Created by phil-apposing on 25/08/2017.
 */

public abstract class CoreActivity extends AppCompatActivity {

    public FragmentController fragmentController;

    public abstract int viewLayout();
    public abstract void setupView();
    public abstract int fragmentLayout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(viewLayout());
        fragmentController = new FragmentController(this, null, fragmentLayout(), getSupportFragmentManager());
        setupView();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
