package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
//import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//implementa��o do predicado
		//list.removeIf(new ProductPredicate());
		
		//refer�ncia com m�todo est�tico
		//list.removeIf(Product::staticProductPredicate);
		
		//referencia com m�todo n�o est�tico
		list.removeIf(Product::nonStaticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
