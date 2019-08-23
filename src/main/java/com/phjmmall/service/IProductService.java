package com.phjmmall.service;

import com.github.pagehelper.PageInfo;
import com.phjmmall.common.ServerResponse;
import com.phjmmall.pojo.Product;
import com.phjmmall.vo.ProductDetailVo;

/**
 * @author: Panhuijuan
 * @create: 2019-08-21 18:44
 **/

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
