package com.yt.it;

import com.yt.it.service.IHomeService;
import com.yt.it.service.IUserService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }
    private ServiceFactory(){

    }

    public IHomeService getiHomeService() {
        return iHomeService;
    }

    public void setiHomeService(IHomeService iHomeService) {
        this.iHomeService = iHomeService;
    }

    public IUserService getiUserService() {
        return iUserService;
    }

    public void setiUserService(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    private IHomeService iHomeService;

    private IUserService iUserService;
}
