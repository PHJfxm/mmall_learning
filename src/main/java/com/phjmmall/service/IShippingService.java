package com.phjmmall.service;

import com.github.pagehelper.PageInfo;
import com.phjmmall.common.ServerResponse;
import com.phjmmall.pojo.Shipping;

/**
 * @author: Panhuijuan
 * @create: 2019-08-23 18:35
 **/
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId,Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId,Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
