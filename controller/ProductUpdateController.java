package controller;

import dto.ProductDto;
import services.ProductService;

public class ProductUpdateController {
	public static void main(String[] args) {
		ProductDto productDto = new ProductDto();
		productDto.setName("Titan");
//		productDto.setPrice(15895.25);
		ProductService productService = new ProductService();
		boolean p = productService.updateProduct(2);
		System.out.println(p);
	}

}
