package service;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ShopDao;
import model.Shop;

@Service("shopService")
public class ShopService {

	@Autowired
	private ShopDao shopDao;

	@Transactional
	public void createAdress(Shop shop) {
		shopDao.create(shop);
	}
}
