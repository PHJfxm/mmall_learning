package com.phjmmall.service;

import com.phjmmall.common.ServerResponse;
import com.phjmmall.pojo.Category;

import java.util.List;

/**
 * @program: phjmmall
 * @description:
 * @author: Panhuijuan
 * @create: 2019-08-21 13:56
 **/
public interface ICategoryService {
    public ServerResponse addCategory(String categoryName, Integer parentId);

    public ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    public ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    public ServerResponse selectCategoryAndChildrenById(Integer categoryId);


}
