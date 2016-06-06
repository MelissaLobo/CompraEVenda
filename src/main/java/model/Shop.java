package model;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_shop")
	private int id;
	private String nameShop;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_shop")
	private List<Comments> comments;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_shop")
	private List<Product> product;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user")
	private User user;

	public Shop() {

	}

	public Shop(int id, String nameShop, List<Comments> comments, List<Product> product) {
		super();
		this.id = id;
		this.nameShop = nameShop;
		this.comments = comments;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameShop() {
		return nameShop;
	}

	public void setNameShop(String nameShop) {
		this.nameShop = nameShop;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", nameShop=" + nameShop + ", comments=" + comments + ", product=" + product + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + id;
		result = prime * result + ((nameShop == null) ? 0 : nameShop.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (id != other.id)
			return false;
		if (nameShop == null) {
			if (other.nameShop != null)
				return false;
		} else if (!nameShop.equals(other.nameShop))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
}
