package space.gavinklfong.demo.streamapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import space.gavinklfong.demo.streamapi.models.Order;
import space.gavinklfong.demo.streamapi.models.Product;
import space.gavinklfong.demo.streamapi.repos.CustomerRepo;
import space.gavinklfong.demo.streamapi.repos.OrderRepo;
import space.gavinklfong.demo.streamapi.repos.ProductRepo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

@Component
public class AppCommandRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepo customerRepos;
	
	@Autowired
	private OrderRepo orderRepos;
	
	@Autowired
	private ProductRepo productRepos;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		 //Obtain a list of products belongs to category “Books” with price > 100
			/*
			 * List<Product> filteredProducts = productRepos.findAll().stream().filter(p ->
			 * p.getCategory().equals("Books")) .filter(p ->
			 * p.getPrice()>100).collect(Collectors.toList());
			 * 
			 * for(Product product: filteredProducts) {
			 * System.out.println(product.getCategory());
			 * System.out.println(product.getId()); }
			 */
		 
		 // Obtain a list of order with products belong to category “Baby”
		 //use anyMatch
			/*
			 * List<Order> filteredOrders = orderRepos.findAll().stream().filter(o ->
			 * o.getProducts().stream(). anyMatch(p -> p.getCategory().equals("Baby"))).
			 * collect(Collectors.toList());
			 * 
			 * filteredOrders.forEach(o -> o.getProducts().stream().forEach(p ->
			 * System.out.println(p.getCategory())));
			 */
		
		// Obtain a list of product with category = “Toys” and then apply 10% discount
		/*
		 * List<Double> discountedPrices = productRepos.findAll().stream(). filter(p ->
		 * p.getCategory().equalsIgnoreCase("Toys")). map(p -> p.getPrice()*0.9).
		 * collect(Collectors.toList());
		 * 
		 * discountedPrices.forEach(price -> System.out.println(price));
		 */
		
		
	}

}
