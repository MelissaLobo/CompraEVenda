package service;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.User;

@Service("service")
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;

	public void createAccount(User user) {
		userDao.create(user);

	}
	
	public boolean entityExists(User user) {
        return userDao.entityExists(user);
    }
}
