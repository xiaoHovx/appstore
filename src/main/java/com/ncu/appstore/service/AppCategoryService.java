package com.ncu.appstore.service;

import com.ncu.appstore.pojo.AppCategory;

import java.util.List;


public interface AppCategoryService {
    /**
     * 通过分类码获取分类信息
     * @param categoryCode
     * @return
     */
    List<AppCategory> getCategoryByCategoryCode(String categoryCode);

    /**
     * 通过分类码和父级ID获取分类信息
     * @param categoryCode
     * @return
     */
    List<AppCategory> getCategoryByCategoryCodeAndParent(String categoryCode, String parent);
}