package com.ncu.appstore.service;

import com.ncu.appstore.BaseTestClass;
import com.ncu.appstore.pojo.DataDictionary;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class DataDictionaryServiceTest extends BaseTestClass {
    @Autowired
    private DataDictionaryService dataDictionaryService;

    @Test
    public void testGetDataDictionaryByTypeCode(){
        List<DataDictionary> status = dataDictionaryService.getDataDictionaryByTypeCode("status");
        for (DataDictionary dataDictionary : status) {
            System.out.println(dataDictionary);
        }
    }
}