package service;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ShopDao;
import dao.UserDao;
import model.Product;
import model.Shop;
import model.User;

@Service("shopService")
public class ShopService {

	@Autowired
	private ShopDao shopDao;
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void createShop(Shop shop,long idUser) {
		shop.setUser(userDao.find(idUser));
		shopDao.create(shop);
	}

	@Transactional
    public void addProduct(User user, Product product){
    	Shop shopgerenciado = shopDao.findShopByUser(user);
    	shopgerenciado.getProduct().add(product);
    	shopDao.create(shopgerenciado);
    }
 
}
