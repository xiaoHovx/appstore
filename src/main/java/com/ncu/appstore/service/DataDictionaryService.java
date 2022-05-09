package com.ncu.appstore.service;

import com.ncu.appstore.pojo.DataDictionary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface DataDictionaryService {
    /**
     * 通过类型获取数据字典列表
     * @param typeCode
     * @return
     */
    List<DataDictionary> getDataDictionaryByTypeCode(String typeCode);
}