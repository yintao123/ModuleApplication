package yt.com.module_home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.yt.it.service.IHomeService;

public class HomeService implements IHomeService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,HomeActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment newHomeFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        HomeFragment fragment = HomeFragment.newInstance();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,fragment).commit();

        return fragment;
    }
}
