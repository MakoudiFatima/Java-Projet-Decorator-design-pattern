package com.demo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

import strategy.testStrategy;

import java.awt.Font;
import javax.swing.ImageIcon;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 568, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Pizza");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenu nw = new PizzaMenu();
				nw.NewScreen();
				
			}
		});
		btnNewButton.setBounds(33, 180, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ice Cream");
		btnNewButton_1.setBackground(new Color(255, 160, 122));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceMenu ts = new IceMenu();
				ts.NewScreen2();
				
				
			}
		});
		btnNewButton_1.setBounds(228, 180, 98, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("MAKOUDI'S SERVICE ORDERS");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(150, 11, 228, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Drinks");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrinkMenu nw = new DrinkMenu();
				nw.NewScreen3();
				
				
			}
		});
		btnNewButton_2.setBackground(new Color(255, 160, 122));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(427, 181, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/fishier/pizza (2).jpg")));
		lblNewLabel_1.setBounds(10, 72, 147, 97);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Menu.class.getResource("/fishier/cream.jpg")));
		lblNewLabel_2.setBounds(207, 72, 147, 97);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(Menu.class.getResource("/fishier/cafee.jpg")));
		lblNewLabel_2_1.setBounds(395, 72, 147, 98);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton_3 = new JButton("Pay");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					testStrategy nw = new testStrategy();
					nw.NewScreen4();
				
			}
		});
		btnNewButton_3.setBackground(new Color(255, 160, 122));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(228, 322, 98, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon(Menu.class.getResource("/fishier/pay.jpg")));
		lblNewLabel_2_2.setBounds(207, 214, 147, 97);
		frame.getContentPane().add(lblNewLabel_2_2);
	}

}
