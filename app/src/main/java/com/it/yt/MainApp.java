package com.it.yt;

import android.app.Application;

import com.yt.it.AppConfig;
import com.yt.it.IAppComponent;

public class MainApp extends Application implements IAppComponent {
    private static MainApp application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        //通过反射,将application传递到modul中
        for (String component:AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent){
                    ((IAppComponent) object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
