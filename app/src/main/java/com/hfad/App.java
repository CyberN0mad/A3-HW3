package com.hfad;
import android.app.Application;
import com.hfad.ad3lesson3.data.preferences.PreferenceUtils;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(this);
    }
}
