package easysalemanagment.process;

import javax.swing.JOptionPane;

public class MenuProcess {
	CreateNewProduct createNewProduct = new CreateNewProduct();

	public void menuProcess(int menu) {
		switch (menu) {
		case 0:
		createNewProduct.createNewProduct();

			break;

		}
	}

}
