package easysalemanagment.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import easysalemanagment.main.Main;

public class JOptionPaneView {
	public static int menu(String[] nameOfButtons, String title) {

		ImageIcon icon = new ImageIcon(Main.class.getResource("/easysalemanagmentlogo.png"));
		UIManager.put("OptionPane.background", new ColorUIResource(Color.decode("#FEDCD2")));
		UIManager.put("Panel.background", new ColorUIResource(Color.decode("#FEDCD2")));
		UIManager.put("OptionPane.messageForeground", Color.decode("#424242"));
		UIManager.put("Button.background", Color.decode("#DF744A"));
		UIManager.put("OptionPane.messageFont", new FontUIResource(Font.MONOSPACED, Font.BOLD, 16));
		UIManager.put("Button.foreground", Color.decode("#E0E0E0"));
		UIManager.put("Button.select", Color.decode("#FCB239"));
		UIManager.put("Button.focus", Color.decode("#DF744A"));
		UIManager.put("Label.background", Color.red);

		int option = JOptionPane.showOptionDialog(null, "EasySale-Managment v1.0", title, JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, icon, nameOfButtons, "default");

		return option;
	}
}
