package com.ncu.appstore.service;

import com.ncu.appstore.dto.BaseResult;
import com.ncu.appstore.pojo.AppVersion;

import java.util.List;


public interface AppVersionService {
    List<AppVersion> selectByAppId(String appId);

    AppVersion getAppVersionById(Long id);

    BaseResult save(AppVersion appVersion);

    int deleteByAppId(Long appId);
}