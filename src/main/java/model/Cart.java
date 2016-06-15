package model;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

	private Map<CartItem, Integer> items = new LinkedHashMap<CartItem, Integer>();

	public Collection<CartItem> getItens() {
		return items.keySet();
	}

	public void add(CartItem item) {
		items.put(item, getQuantidade(item) + 1);
	}

	public Integer getQuantidade(CartItem item) {
		if (!items.containsKey(item)) {
			items.put(item, 0);
		}
		return items.get(item);
	}

	public int getQuantidade() {
		return items.size();
	}

	public BigDecimal getTotal(CartItem item) {
		return item.getTotal(getQuantidade(item));
	}

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (CartItem item : items.keySet()) {
			total = total.add(getTotal(item));
		}
		return total;
	}

	public void remove(Long productId) {
		Product product = new Product();
		product.setId(productId);
		items.remove(new CartItem(product));
	}
}
