package yt.com.module_home;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.yt.it.IAppComponent;
import com.yt.it.ServiceFactory;
import com.yt.it.service.IHomeService;

public class HomeApp extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }


    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setiHomeService(new HomeService());
    }
}
