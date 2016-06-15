package validation;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import model.Product;

public class ProductValidation {

	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "productName", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "price", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "description", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "category", "field.required");

	}
}
