package com.lambo.springbootcloudserivceproductfeigh8018.service;/**
 * @author yym
 * @create create by yym 2018/8/19 0019 16:39
 * @desc
 **/

import com.lambo.springbootcloudproductserviceapi.entity.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author yym
 * @create 2018-08-19 16:39
 * @desc
 **/
@FeignClient("PRODUCT-SERVICE")
public interface ProductService {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/products/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);

}

