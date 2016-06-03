package dao;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.io.Serializable;

import org.springframework.stereotype.Repository;

import model.Product;

@Repository
public class ProductDao extends DaoGeneric<Product, Serializable> {
	
	private ProductDao productDao;

	 public boolean entityExists(Product product) {
	        for (Product p : productDao.findAll()) {
	            if (p.getProductName().equals(product.getProductName())) {
	                return true;
	            }
	        }
	        return false;
	    }
}
