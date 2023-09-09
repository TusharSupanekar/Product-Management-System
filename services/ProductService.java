package services;

import dao.ProductDao;
import dto.ProductDto;

public class ProductService {
	ProductDao productDao = new ProductDao();

	public boolean deleteProductById(int id) {
		boolean p = productDao.deleteProductById(id);
		return p;
	}

	public boolean getProduct(int id) {
		boolean p = productDao.getProduct(id);
		return p;
	}

	public boolean updateProduct(int id) {
		boolean p = productDao.updateProduct(id);
		return p;
	}

	public ProductDto saveProduct(ProductDto productDto) {
		ProductDto p = productDao.saveProduct(productDto);
		return p;
	}

}
