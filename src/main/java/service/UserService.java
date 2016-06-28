package service;

import java.util.List;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.Role;
import model.User;

@Service("service")
public class UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void createAccount(User user, Role role) {
		List<Role> roles = userDao.findIdRole(role);
		user.setRoles(roles);
		userDao.create(user);
	}
	
	public boolean entityExists(User user) {
        for (User p : userDao.findAll()) {
            if (p.getUserName().equals(user.getUserName())) {
                return true;
            }
        }
        return false;
    }
}
