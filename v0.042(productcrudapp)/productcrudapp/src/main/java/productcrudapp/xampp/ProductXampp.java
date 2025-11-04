package productcrudapp.xampp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product;

@Component
public class ProductXampp {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	// create Product
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernateTemplate.saveOrUpdate(product);
	}
	// get All product
	public List<Product> getProduct(){
		List<Product> product=this.hibernateTemplate.loadAll(Product.class);
		return product;
	}
	// delete product
	@Transactional
	public void deleteProduct(int pid) {
		Product p= this.hibernateTemplate.load(Product.class,pid);
		this.hibernateTemplate.delete(p);
	}
	// get the single Product
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class,pid);
	}
	
	
}



























