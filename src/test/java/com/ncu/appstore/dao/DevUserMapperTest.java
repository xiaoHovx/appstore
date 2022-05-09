package com.ncu.appstore.dao;

import com.ncu.appstore.BaseTestClass;
import com.ncu.appstore.pojo.DevUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;


public class DevUserMapperTest extends BaseTestClass {
    @Autowired
    private DevUserMapper mapper;
    @Test
    public void testInsert(){
        DevUser devUser = new DevUser();
        devUser.setDevname("testAdd");
        devUser.setCreationdate(new Date());
        mapper.insert(devUser);
    }
    @Test
    public void testDelete(){
        mapper.deleteByPrimaryKey(3L);
    }
}