package fr.fms.hmi;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Camille - 2023
 * @since 1.0
 * Création de la GUI
 */

@SuppressWarnings("serial")
public class View extends JFrame {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		View launch = new View();
	}

	JPanel panel = new JPanel(null);
	JLabel title;
	JButton button;

	Font fauth = new Font(Font.SANS_SERIF, Font.BOLD, 28);
	Font font = new Font(Font.SANS_SERIF, Font.BOLD, 18);
	Font fb = new Font(Font.SANS_SERIF, Font.BOLD, 14);

	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;

	public View() {
		super("MoMo Hardware Shop");

		title = new JLabel("MoMo Hardware Shop");
		title.setBounds(350, 10, 400, 70);
		title.setFont(fauth);
		title.setBackground(Color.black);
		title.setForeground(Color.green);
		panel.add(title);

		button = new JButton("Load the table of products");
		button.setBounds(350, 80, 290, 40);
		button.setFont(fb);
		button.setBackground(Color.black);
		button.setForeground(Color.green);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				//					conn = SingletonConnection.getConnection();
				//					try {
				//						ps = conn.prepareStatement("SELECT IdUser FROM T_Users WHERE login = ? AND password = ?");
				//						User obj = null;
				//						ps.setString(1, ((User) obj).getLogin());
				//						ps.setString(2, ((User) obj).getPassword());
				//						rs = ps.executeQuery();
				//						if (rs.next()) {
				//							JOptionPane.showMessageDialog(null, "Connection successfully...");
				//						} else {
				//							JOptionPane.showMessageDialog(null, "Connection refused...");
				//						}
				//					
				//				
				System.out.println("Test");
			}
		});

		String data[][]={ {"101","Amit","670000", "ddd", "ddd"},    
				{"102","Jai","780000", "ddd", "ddd"},    
				{"101","Sachin","700000", "ddd", "ddd"}}; 
		String data[][]=new ;
		String column[]={"ID","NAME","BRAND","PRICE", "CATEGORY ID"};  
		
		
		JTable table = new JTable(data,column);    
		table.setBounds(30,150,600,400);
		table.setFont(fb);
		table.setBackground(Color.white);
		table.setForeground(Color.black);
		JScrollPane scroll = new JScrollPane(table);
		panel.add(table);

		this.setVisible(true);
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel.setBackground(Color.black);
	}
}