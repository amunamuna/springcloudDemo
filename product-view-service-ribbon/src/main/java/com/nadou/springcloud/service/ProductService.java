package com.nadou.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadou.springcloud.client.ProductClientRibbon;
import com.nadou.springcloud.pojo.Product;


@Service
public class ProductService {
	@Autowired
	ProductClientRibbon productClientRibbon;
	public List<Product> listProducts(){
		return productClientRibbon.listProdcuts();

	}
}
