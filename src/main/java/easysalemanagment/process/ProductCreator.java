package easysalemanagment.process;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import easysalemanagment.products.Product;

public class ProductCreator {
	
	private EntityManagerFactory entityManagerFactory;
	
	public ProductCreator(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void createNewProduct() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String name = JOptionPane.showInputDialog("Enter name:");
		String barcode = JOptionPane.showInputDialog("Enter barCode:");
		String price = JOptionPane.showInputDialog("Enter price:");

		Product product = new Product();
		product.setName(name);
		product.setBarCode(barcode);
		product.setPrice(new BigDecimal(price));

		entityManager.getTransaction().begin();
		entityManager.persist(product);
		entityManager.getTransaction().commit();

		
		entityManager.close();

	}
}
