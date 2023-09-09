package controller;

import dto.ProductDto;
import services.ProductService;

public class ProductSaveController {
	public static void main(String[] args) {

		ProductDto productDto = new ProductDto();
		productDto.setId(3);
		productDto.setName("Fossil Watch");
		productDto.setPrice(48523.25);

		ProductService productService = new ProductService();
		ProductDto p = productService.saveProduct(productDto);
		if (p != null) {
			System.out.println(p.getId() + " Save Succesfully");

		}
	}

}
