package com.jxin.service.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zalando.problem.Problem;

/**
 * @author:蔡佳新
 * @date:创建时间 0:17 2018/9/7
 * @note:
 */
public interface OrderService {

    // 订单服务调用会员服务接口信息 feign
    @RequestMapping(value = "/orderToMember",produces = MediaType.APPLICATION_JSON_VALUE)
    Problem orderToMember(String name);
}
