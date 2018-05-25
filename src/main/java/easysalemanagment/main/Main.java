package easysalemanagment.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import easysalemanagment.process.MenuProcess;
import easysalemanagment.view.JOptionPaneView;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();

	}

	public Main() {
		MenuProcess menuProcess = new MenuProcess();

		int menu;
		do {
			menu = JOptionPaneView.menu(new String[] { "create new products", "create new account",
					"receipts managment", "cash reports", "exit" }, "EasySale-Managment");
			menuProcess.menuProcess(menu);
		} while (menu != 4);
		
		menuProcess.closeEntityManagerFactory();

	}

}
