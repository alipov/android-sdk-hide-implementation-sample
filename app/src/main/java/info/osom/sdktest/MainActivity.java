package info.osom.sdktest;

import android.app.Activity;
import android.os.Bundle;

import info.osom.sdk.Api;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Api.init();
    }
}