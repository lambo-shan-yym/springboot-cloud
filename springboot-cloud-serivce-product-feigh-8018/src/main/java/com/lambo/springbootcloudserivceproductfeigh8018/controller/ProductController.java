package com.lambo.springbootcloudserivceproductfeigh8018.controller;

import com.lambo.springbootcloudproductserviceapi.entity.Product;
import com.lambo.springbootcloudserivceproductfeigh8018.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yym
 * @create create by yym 2018/8/19 0019 16:40
 * @desc ${DESCRIPTION}
 **/
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list() {
        return this.productService.findAll();
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode) {
        return this.productService.loadByItemCode(itemCode);
    }
}
