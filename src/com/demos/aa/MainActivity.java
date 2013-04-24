package com.demos.aa;

import android.app.Activity;
import android.widget.TextView;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.main)
public class MainActivity extends Activity {
    @ViewById TextView mMessageView;

    @Override
    protected void onStart() {
        super.onStart();
        mMessageView.setText(String.valueOf(System.currentTimeMillis()));
    }
}
