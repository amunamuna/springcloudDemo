package com.nadou.springcloud.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nadou.springcloud.pojo.Product;

@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;


	public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}
