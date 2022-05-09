package com.ncu.appstore.service;

import com.ncu.appstore.pojo.BackendUser;



public interface BackendUserService {
    public BackendUser addBackendUser(BackendUser backendUser);
    public BackendUser findBackendUserByCode(String usercode);
}
