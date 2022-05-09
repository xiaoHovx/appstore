package com.ncu.appstore.service.impl;

import com.ncu.appstore.dao.BackendUserMapper;
import com.ncu.appstore.pojo.BackendUser;
import com.ncu.appstore.service.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BackendUserServiceImpl implements BackendUserService {
    @Autowired
    BackendUserMapper backendUserMapper;

    public BackendUser addBackendUser(BackendUser backendUser) {
        backendUserMapper.insert(backendUser);
        return backendUser;
    }
    public BackendUser findBackendUserByCode(String usercode){
        BackendUser backendUser = new BackendUser();
        backendUser.setUsercode(usercode);
        return backendUserMapper.selectOne(backendUser);
    }
}
