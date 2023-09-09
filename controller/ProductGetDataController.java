package controller;

import services.ProductService;

public class ProductGetDataController {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		boolean p = productService.getProduct(1);
		System.out.println(p);

	}

}
