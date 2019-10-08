package com.leyou.service.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author moxiaolin
 * @date 2018/9/15
 */
public interface CategoryService {


    List<Category> queryCategoryByPid(Long pid);

    List<Category> queryCategoryByIds(List<Long> ids);

    List<Category> queryAllByCid3(Long id);
}
