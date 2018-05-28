package easysalemanagment.process;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MenuProcess {

	private ProductCreator productCreator;
	private AccountCreator accountCreator;

	private EntityManagerFactory entityManagerFactory;

	public MenuProcess() {
		createEntityManagerFactory();
		productCreator = new ProductCreator(entityManagerFactory);
		accountCreator = new AccountCreator(entityManagerFactory);
	}

	public void createEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory("easyDataBase");
	}

	public void closeEntityManagerFactory() {
		entityManagerFactory.close();
	}

	public void menuProcess(int menu) {

		switch (menu) {
		case 0:
			productCreator.createNewProduct();

			break;
		case 1:
			accountCreator.createNewAccount();
			break;

		}
	}

}
