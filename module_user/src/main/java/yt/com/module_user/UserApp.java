package yt.com.module_user;

import android.app.Application;

import com.yt.it.IAppComponent;
import com.yt.it.ServiceFactory;

public class UserApp extends Application implements IAppComponent {

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
        ServiceFactory.getInstance().setiUserService(new UserService());
    }
}
