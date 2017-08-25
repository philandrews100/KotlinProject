package smpl.code.me.kotlinproject.activities.core;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by phil-apposing on 25/08/2017.
 */

public abstract class CoreActivity extends AppCompatActivity {

    public abstract int viewLayout();
    public abstract void setupView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(viewLayout());
        setupView();
    }
}
