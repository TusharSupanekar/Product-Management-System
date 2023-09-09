package controller;

import services.ProductService;

public class ProductDeleteController {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		boolean p = productService.deleteProductById(2);
		System.out.println(p);
	}

}
