package easysalemanagment.process;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;

import easysalemanagment.users.Role;
import easysalemanagment.users.User;

public class AccountCreator {
	private EntityManagerFactory entityManagerFactory;

	public AccountCreator(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;

	}

	public void createNewAccount() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String login = JOptionPane.showInputDialog("Enter login:");
		String password = JOptionPane.showInputDialog("Enter password:");
		User user = new User();

		user.setLogin(login);
		user.setPassword(password);
		Role[] roleOfUser = new Role[2];
		roleOfUser[0] = Role.ADMINISTRATOR;
		roleOfUser[1] = Role.SHOP;
		Object questionAboutRole = JOptionPane.showInputDialog(null, "Enter Role:", "Roles",
				JOptionPane.QUESTION_MESSAGE, null, roleOfUser, null);

		if (questionAboutRole == Role.ADMINISTRATOR) {
			user.setRole(Role.ADMINISTRATOR);

		} else if (questionAboutRole == Role.SHOP) {
			user.setRole(Role.SHOP);
		}

		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();

		entityManager.close();

	}

}
