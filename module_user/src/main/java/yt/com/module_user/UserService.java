package yt.com.module_user;

import android.content.Context;
import android.content.Intent;

import com.yt.it.service.IUserService;

public class UserService implements IUserService {
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context,UserActivity.class);
        intent.putExtra("ID",userId);
        context.startActivity(intent);
    }
}
