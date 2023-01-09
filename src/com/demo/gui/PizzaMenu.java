package com.demo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.demo.decorator.Pizza;
import com.demo.decorator.PizzaCheese;
import com.demo.decorator.PizzaCrust;
import com.demo.decorator.PizzaSauce;
import com.demo.decorator.PizzaSize;
import com.demo.decorator.PizzaToppings;


import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class PizzaMenu {

	private JFrame frame;
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	JPanel panel_5 = new JPanel();
	
	String size, crust, sauce, cheese;
	ArrayList<String> toppings = new ArrayList<String>();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaMenu window = new PizzaMenu();
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
	public PizzaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.getContentPane().setForeground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 455, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(30, 43, 362, 181);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		layeredPane.add(panel, "name_216865145668200");
		panel.setLayout(null);
		
		JLabel lblOrderPizza = new JLabel("Order Pizza");
		lblOrderPizza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOrderPizza.setBounds(153, 5, 94, 14);
		panel.add(lblOrderPizza);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setBackground(new Color(255, 160, 122));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Personal 7\"", "Small 9.5\"", "Medium 11.5\"", "Large 13.5\""}));
		comboBox.setBounds(177, 72, 105, 22);
		panel.add(comboBox);
		
		JLabel lblChooseSize = new JLabel("Choose size");
		lblChooseSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseSize.setBounds(57, 76, 105, 14);
		panel.add(lblChooseSize);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBackground(new Color(255, 160, 122));
		
		btnNext.setBounds(153, 147, 107, 23);
		panel.add(btnNext);
		panel_1.setBackground(Color.WHITE);
		
		layeredPane.add(panel_1, "name_216869046946500");
		panel_1.setLayout(null);
		
		JLabel lblChooseCrust = new JLabel("Choose Crust");
		lblChooseCrust.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseCrust.setBounds(138, 11, 102, 14);
		panel_1.add(lblChooseCrust);
		
		JLabel lblCrust = new JLabel("CRUST");
		lblCrust.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrust.setBounds(57, 62, 72, 14);
		panel_1.add(lblCrust);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setBackground(new Color(255, 160, 122));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Classic Crust", "Italian Style", "Thin & Crispy"}));
		comboBox_1.setBounds(156, 58, 142, 22);
		panel_1.add(comboBox_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBackground(new Color(255, 160, 122));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack.setBounds(67, 124, 89, 23);
		panel_1.add(btnBack);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext_1.setBackground(new Color(255, 160, 122));
		
		btnNext_1.setBounds(194, 124, 89, 23);
		panel_1.add(btnNext_1);
		panel_2.setBackground(new Color(255, 255, 255));
		
		layeredPane.add(panel_2, "name_287345988780600");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Sauce");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(140, 11, 96, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblSauce = new JLabel("SAUCE");
		lblSauce.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSauce.setBounds(32, 72, 63, 14);
		panel_2.add(lblSauce);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setBackground(new Color(255, 160, 122));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Sundried Tomato and Garlic Sauce", "BBQ Sauce", "Domino's Own Tomato Sauce"}));
		comboBox_2.setBounds(98, 68, 243, 22);
		panel_2.add(comboBox_2);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.setBackground(new Color(255, 160, 122));
		btnBack_1.setForeground(new Color(0, 0, 0));
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_1.setBounds(64, 132, 89, 23);
		panel_2.add(btnBack_1);
		
		JButton btnNext_2 = new JButton("Next");
		btnNext_2.setBackground(new Color(255, 160, 122));
		btnNext_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNext_2.setBounds(191, 132, 89, 23);
		panel_2.add(btnNext_2);
		panel_3.setBackground(new Color(255, 255, 255));
		
		layeredPane.add(panel_3, "name_287755100141800");
		panel_3.setLayout(null);
		
		JLabel lblChooseCheese = new JLabel("Choose Cheese");
		lblChooseCheese.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseCheese.setBounds(120, 11, 113, 14);
		panel_3.add(lblChooseCheese);
		
		JLabel lblCheese = new JLabel("CHEESE");
		lblCheese.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCheese.setBounds(54, 64, 69, 14);
		panel_3.add(lblCheese);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_3.setBackground(new Color(255, 160, 122));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Reduced Fat Cheese", "Mozarella Cheese"}));
		comboBox_3.setBounds(143, 60, 153, 22);
		panel_3.add(comboBox_3);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack_2.setBackground(new Color(255, 160, 122));
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_2.setBounds(76, 121, 89, 23);
		panel_3.add(btnBack_2);
		
		JButton btnNext_3 = new JButton("Next");
		btnNext_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext_3.setBackground(new Color(255, 160, 122));
		
		btnNext_3.setBounds(207, 121, 89, 23);
		panel_3.add(btnNext_3);
		panel_4.setBackground(new Color(255, 255, 255));
		

		layeredPane.add(panel_4, "name_287920475446300");
		panel_4.setLayout(null);
		
		JLabel lblChooseToppings = new JLabel("Choose Toppings");
		lblChooseToppings.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChooseToppings.setBounds(139, 5, 130, 14);
		panel_4.add(lblChooseToppings);
		
		JLabel lblToppings = new JLabel("TOPPINGS");
		lblToppings.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToppings.setBounds(10, 37, 84, 14);
		panel_4.add(lblToppings);
		
		JCheckBox chckbxPepperoni = new JCheckBox("Pepperoni");
		chckbxPepperoni.setBackground(new Color(255, 248, 220));
		chckbxPepperoni.setBounds(81, 58, 97, 23);
		panel_4.add(chckbxPepperoni);
		
		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		chckbxMushrooms.setBackground(new Color(255, 248, 220));
		chckbxMushrooms.setBounds(180, 58, 97, 23);
		panel_4.add(chckbxMushrooms);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		chckbxChicken.setBackground(new Color(255, 248, 220));
		chckbxChicken.setBounds(81, 84, 97, 23);
		panel_4.add(chckbxChicken);
		
		JCheckBox chckbxOnion = new JCheckBox("Onions");
		chckbxOnion.setBackground(new Color(255, 248, 220));
		chckbxOnion.setBounds(180, 84, 97, 23);
		panel_4.add(chckbxOnion);
		
		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		chckbxSausage.setBackground(new Color(255, 248, 220));
		chckbxSausage.setBounds(81, 110, 97, 23);
		panel_4.add(chckbxSausage);
		
		JCheckBox chckbxPeppers = new JCheckBox("Peppers");
		chckbxPeppers.setBackground(new Color(255, 248, 220));
		chckbxPeppers.setBounds(180, 110, 97, 23);
		panel_4.add(chckbxPeppers);
		
		JButton btnBack_3 = new JButton("Back");
		btnBack_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack_3.setBackground(new Color(255, 160, 122));
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_3.setBounds(89, 147, 89, 23);
		panel_4.add(btnBack_3);
		
		JButton btnNext_4 = new JButton("Next");
		btnNext_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext_4.setBackground(new Color(255, 160, 122));
		
		btnNext_4.setBounds(180, 147, 89, 23);
		panel_4.add(btnNext_4);
		
		JCheckBox chckbxSmokedBacon = new JCheckBox("Ham");
		chckbxSmokedBacon.setBackground(new Color(255, 248, 220));
		chckbxSmokedBacon.setBounds(81, 33, 97, 23);
		panel_4.add(chckbxSmokedBacon);
		
		JCheckBox chckbxSweetcorn = new JCheckBox("Sweetcorn");
		chckbxSweetcorn.setBackground(new Color(255, 248, 220));
		chckbxSweetcorn.setBounds(180, 33, 97, 23);
		panel_4.add(chckbxSweetcorn);
		panel_5.setBackground(new Color(255, 255, 255));
		
		layeredPane.add(panel_5, "name_288700827764400");
		panel_5.setLayout(null);
		
		JLabel lblFinalOrder = new JLabel("Final Order");
		lblFinalOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFinalOrder.setBounds(153, 5, 92, 14);
		panel_5.add(lblFinalOrder);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSize.setBounds(43, 37, 48, 14);
		panel_5.add(lblSize);
		
		JLabel lblCrust_1 = new JLabel("Crust");
		lblCrust_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrust_1.setBounds(43, 61, 48, 14);
		panel_5.add(lblCrust_1);
		
		JLabel lblSauce_1 = new JLabel("Sauce");
		lblSauce_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSauce_1.setBounds(43, 81, 48, 14);
		panel_5.add(lblSauce_1);
		
		JLabel lblCheese_1 = new JLabel("Cheese");
		lblCheese_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCheese_1.setBounds(43, 106, 48, 14);
		panel_5.add(lblCheese_1);
		
		JLabel lblToppings_1 = new JLabel("Toppings");
		lblToppings_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToppings_1.setBounds(43, 131, 59, 14);
		panel_5.add(lblToppings_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(131, 151, 157, -26);
		panel_5.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(124, 34, 238, 20);
		panel_5.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 58, 238, 20);
		textField_1.setEditable(false);
		panel_5.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 81, 238, 20);
		textField_2.setEditable(false);
		panel_5.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 103, 238, 20);
		textField_3.setEditable(false);
		panel_5.add(textField_3);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(43, 156, 48, 14);
		panel_5.add(lblTotal);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 153, 96, 20);
		textField_4.setEditable(false);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnBack_4 = new JButton("Back");
		btnBack_4.setBackground(new Color(255, 160, 122));
		btnBack_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_4.setBounds(273, 1, 89, 23);
		panel_5.add(btnBack_4);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setBackground(new Color(255, 160, 122));
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnOrder.setBounds(234, 152, 89, 23);
		panel_5.add(btnOrder);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(124, 126, 238, 22);
		panel_5.add(textArea);
		
		JLabel lblAda = new JLabel("");
		lblAda.setForeground(new Color(255, 160, 122));
		lblAda.setBounds(140, 11, 157, 14);
		frame.getContentPane().add(lblAda);
		
		// Pizza size button handler
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				size = comboBox.getSelectedItem().toString();
			}
		});
		//Pizza crust button handler
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
				crust = comboBox_1.getSelectedItem().toString();
			}
		});
		//Pizza sauce button handler	
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
				sauce = comboBox_2.getSelectedItem().toString();
			}
		});
		//Pizza cheese button handler	
		btnNext_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
				cheese = comboBox_3.getSelectedItem().toString();
			}
		});
		//Pizza toppings button handler	
		btnNext_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();
				toppings.clear();
				if(chckbxPepperoni.isSelected()) {
					toppings.add(chckbxPepperoni.getText());
				}
				if(chckbxChicken.isSelected()) {
					toppings.add(chckbxChicken.getText());
				}
				if(chckbxSausage.isSelected()) {
					toppings.add(chckbxSausage.getText());
				}
				if(chckbxSmokedBacon.isSelected()) {	
					toppings.add(chckbxSmokedBacon.getText());
				}
				if(chckbxSweetcorn.isSelected()) {	
					toppings.add(chckbxSweetcorn.getText());
				}
				if(chckbxMushrooms.isSelected()) {	
					toppings.add(chckbxMushrooms.getText());
				}
				if(chckbxOnion.isSelected()) {	
					toppings.add(chckbxOnion.getText());
				}
				if(chckbxPeppers.isSelected()) {	
					toppings.add(chckbxPeppers.getText());
				}
				textField.setText(size);
				textField_1.setText(crust);
				textField_2.setText(sauce);
				textField_3.setText(cheese);
				textArea.setText(toppings.toString());
				calculateBill();
			}
		});	
		
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAda.setText("Ordered Succesfully");
			}
		});
	}
	//Calculating the bill from the Decorator Class
	public void calculateBill() {
		Pizza customPizza = new PizzaToppings(toppings, new PizzaCheese(cheese, new PizzaSauce(sauce, new PizzaCrust(crust, new PizzaSize(size, new Pizza(0))))));
		textField_4.setText(""+customPizza.getCost());
	}

	
	
}
