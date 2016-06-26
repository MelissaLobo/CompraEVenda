package dao;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import model.Shop;
import model.User;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
@Repository
public class ShopDao extends DaoGeneric<Shop, Serializable> {
	
	@PersistenceContext
	private EntityManager manager;

	public Shop findShopByUser(User user) {
		return manager.createQuery("from Shop s where s.user.id = :userId", Shop.class)
				.setParameter("userId", user.getId()).getSingleResult();
	}

}
