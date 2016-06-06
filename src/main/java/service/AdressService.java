package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.AdressDao;
import model.Adress;
@Service("adressService")
public class AdressService {

	@Autowired
	private AdressDao adressDao;
	
	@Transactional
	public void createAdress(Adress adress) {
		adressDao.create(adress);
	}
}
