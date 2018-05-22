package easysalemanagment.process;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CreateNewProduct {

	public void createNewProduct() {
		String name = JOptionPane.showInputDialog("Enter name:");
		String barcode = JOptionPane.showInputDialog("Enter barCode:");
		String price = JOptionPane.showInputDialog("Enter price:");
		String askAboutNameOfFile = JOptionPane.showInputDialog("Enter name of file:");

		BufferedWriter writer = null;
		try {
			// create a temporary file
			String file = "C:\\Users\\Micha³\\Desktop\\aktualizacje\\"+ askAboutNameOfFile+".txt";
			File logFile = new File(file);
			

			// This will output the full path where the file will be written
			// to...
			System.out.println(logFile.getCanonicalPath());

			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write(name+barcode+price);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close the writer regardless of what happens...
				writer.close();
			} catch (Exception e) {
			}
		}
	}
}
