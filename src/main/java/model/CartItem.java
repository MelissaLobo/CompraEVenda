package model;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.io.Serializable;
import java.math.BigDecimal;

public class CartItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private Product product;

	public CartItem(Product product) {
		this.product = product;

	}

	public BigDecimal getPrice() {
		return product.getPrice();
	}

	public BigDecimal getTotal(int quantidade) {
		return this.getPrice().multiply(new BigDecimal(quantidade));
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		CartItem other = (CartItem) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
}
