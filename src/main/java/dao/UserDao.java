package dao;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.io.Serializable;

import org.springframework.stereotype.Repository;

import model.User;

@Repository // Mapeia a Classe
public class UserDao extends DaoGeneric<User, Serializable> {

	/*@SuppressWarnings("unchecked")
	public User findByUserName(String username) {
		System.out.println("In findByUserName");
		List<User> users = new ArrayList<User>();

		users = sessionFactory.openSession().createQuery("from Customer where username=?").setParameter(0, username)
				.list();
		for(User c: users){
			System.out.println("findByUserName:" + username + "values : " + c.getUserName() + " " + c.getPassword());
		}
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public User findByUserId(int id){
		List<User> users = new ArrayList<User>();

		users = sessionFactory.getCurrentSession().createQuery("from User where id=?").setParameter(0, id)
				.list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}*/
}
