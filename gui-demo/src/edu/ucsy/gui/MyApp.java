package edu.ucsy.gui;

import java.awt.*;
import javax.swing.*;

public class MyApp extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// declarations
	JTextField bookNameInput = new JTextField();
	JTextField authorInput = new JTextField();
	
	String [] languages = {"English", "Chinese", "Japanese"};
	JComboBox<String> languageComboBox = new JComboBox<String>(languages);
	
	JButton searchBtn = new JButton("Search");
	JButton clearBtn = new JButton("Clear");
	JButton exitBtn = new JButton("Exit");
	
	public MyApp() {
		setTitle("Digital Library");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// logic
		Container container = getContentPane();
		container.setLayout(new GridLayout(4, 1));
		
		JPanel panel1 = new JPanel(new GridLayout(1, 2));
		JPanel panel2 = new JPanel(new GridLayout(1, 2));
		JPanel panel3 = new JPanel(new GridLayout(1, 2));
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 2));
		
		// panel1
		panel1.add(new JLabel("Book Name :"));
		panel1.add(bookNameInput);
		
		// panel2
		panel2.add(new JLabel("Author :"));
		panel2.add(authorInput);
		
		// panel3
		panel3.add(new JLabel("Language :"));
		panel3.add(languageComboBox);
		
		panel4.add(searchBtn);
		panel4.add(clearBtn);
		panel4.add(exitBtn);
		
		container.add(panel1);
		container.add(panel2);
		container.add(panel3);
		container.add(panel4);
		
		clearBtn.addActionListener(e -> {
			bookNameInput.setText("");
			authorInput.setText("");
			languageComboBox.setSelectedIndex(0);
		});
		
		exitBtn.addActionListener(e -> {
			System.exit(0);
		});
		
		searchBtn.addActionListener(e -> {
			String bookName = bookNameInput.getText();
			String author = authorInput.getText();
			String language = languageComboBox.getSelectedItem().toString();
		
			String message = """
					Do you want to search:
					Name: %s
					Roll No: %s
					Interest: %s
					""";
			JOptionPane.showMessageDialog(
					null, 
					message.formatted(bookName, author, language));
		});
	}
	
	public static void main(String[] args) {
		new MyApp().setVisible(true);
	}
}
