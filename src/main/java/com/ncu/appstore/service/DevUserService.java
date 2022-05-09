package com.ncu.appstore.service;

import com.ncu.appstore.pojo.DevUser;
import org.springframework.stereotype.Service;


public interface DevUserService {
    public DevUser addDevUser(DevUser devUser);
    public DevUser findDevUserByEmail(String email);
    public DevUser findDevUserByCode(String devcode);
    public int updateDevUser(DevUser devUser);
}