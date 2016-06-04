package service;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ProductDao;
import model.Product;

@Service("productService")
@Transactional
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public void createProduct(Product product) {
		productDao.create(product);

	}
	@Transactional
	public boolean entityExists(Product product) {
        return productDao.entityExists(product);
    }

	@Transactional
	public List<Product> listProduct() {
		productDao.findAll();
		return listProduct();
	}
	
	 public Product getById(Long id) {
	        for (Product p : productDao.findAll()) {
	            if (p.getId() == id) {
	                return p;
	            }
	        }
	        return null;
	    }

}
