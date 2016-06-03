package dao;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class DaoGeneric<T, I extends Serializable> {
	// T é o tipo, a classe. E I é o tipo do id, int ou long

	@PersistenceContext
	protected EntityManager entityManager;
	protected final Class<T> clazz;

	protected DaoGeneric() {
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		this.clazz = clazz;
	}

	public void create(T entity) {
		try {
			entityManager.persist(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T update(T entity) {
		T entityUpdated = null;
		try {
			entityUpdated = entityManager.merge(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityUpdated;

	}

	public void destroy(T entity) {
		try {
			entityManager.remove(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T find(I id) {

		T object = null;

		try {
			object = entityManager.find(clazz, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {

		List<T> resultList = null;

		try {
			Query query = entityManager.createQuery("from " + clazz.getName());
			resultList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}

	@SuppressWarnings("unchecked")
	public T findById(int id) {
		List<T> resultList = null;
		try {
			Query query = entityManager.createQuery("from " + clazz.getName() + " where id=:id").setParameter("id", id);
			resultList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) resultList;
	}

	@SuppressWarnings("unchecked")
	public T findByName(String name) {
		List<T> resultList = null;
		try {
			Query query = entityManager.createQuery("from " + clazz.getName() + "  where name=:name")
					.setParameter("name", name);
			resultList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) resultList;
	}
}
