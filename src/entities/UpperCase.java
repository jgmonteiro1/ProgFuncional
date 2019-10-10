package entities;

import java.util.function.Function;

public class UpperCase implements Function<Product, String>{

	@Override
	public String apply(Product p1) {
		
		return p1.getName().toUpperCase();
	}

}
