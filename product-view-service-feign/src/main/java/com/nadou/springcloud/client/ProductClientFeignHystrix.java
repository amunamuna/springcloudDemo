package com.nadou.springcloud.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nadou.springcloud.pojo.Product;

/**
 * Created by amunamuna
 *2019/11/15 14:43
 **/
@Component
public class ProductClientFeignHystrix  implements ProductClientFeign{
  public List<Product> listProdcuts(){
    List<Product> result = new ArrayList<>();
    result.add(new Product(0,"产品数据微服务不可用",0));
    return result;
  }
}
