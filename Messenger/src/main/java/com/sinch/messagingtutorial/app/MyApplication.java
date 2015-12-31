package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "4U8bfqbsG7EANyctdMc76SSQRAqRTEqNu0d6AaRT", "9IRd50Df24V2umdPine3Nk6ZwoDRGiDSybKa4n1v");
    }
}
