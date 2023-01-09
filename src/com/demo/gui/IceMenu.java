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


import ice.cream.Cream;
import ice.cream.IceFlavors;
import ice.cream.IceSauce;
import ice.cream.IceSize;
import ice.cream.IceTopping;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class IceMenu {

	private JFrame frame;
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	
	String size, sauce, flavor;
	ArrayList<String> toppings = new ArrayList<String>();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IceMenu window = new IceMenu();
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
	public IceMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
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
		
		JLabel lblOrderPizza = new JLabel("Order Ice Cream");
		lblOrderPizza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOrderPizza.setBounds(120, 11, 129, 14);
		panel.add(lblOrderPizza);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setBackground(new Color(255, 160, 122));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Small cup 8oz\"", "Pint 16oz\"", "Liter 32oz\"", "Bucket 4L 64oz\""}));
		comboBox.setBounds(177, 72, 117, 22);
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
		
		JLabel lblChooseCrust = new JLabel("Choose Flavor");
		lblChooseCrust.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseCrust.setBounds(138, 11, 102, 14);
		panel_1.add(lblChooseCrust);
		
		JLabel lblCrust = new JLabel("FLAVOR");
		lblCrust.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrust.setBounds(57, 62, 72, 14);
		panel_1.add(lblCrust);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setBackground(new Color(255, 160, 122));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Vanilla", "Chocolat", "Lemon", "Strawberry"}));
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
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Caramel Sauce", "Chocolat Sauce", "Strawberry Sauce"}));
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
		

		layeredPane.add(panel_3, "name_287920475446300");
		panel_3.setLayout(null);
		
		JLabel lblChooseToppings = new JLabel("Choose Toppings");
		lblChooseToppings.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChooseToppings.setBounds(139, 5, 130, 14);
		panel_3.add(lblChooseToppings);
		
		JLabel lblToppings = new JLabel("TOPPINGS");
		lblToppings.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToppings.setBounds(10, 37, 84, 14);
		panel_3.add(lblToppings);
		
		JCheckBox chckbxPepperoni = new JCheckBox("Sprinkles");
		chckbxPepperoni.setBackground(new Color(255, 248, 220));
		chckbxPepperoni.setBounds(81, 58, 121, 23);
		panel_3.add(chckbxPepperoni);
		
		JCheckBox chckbxMushrooms = new JCheckBox("Oreos");
		chckbxMushrooms.setBackground(new Color(255, 248, 220));
		chckbxMushrooms.setBounds(204, 58, 119, 23);
		panel_3.add(chckbxMushrooms);
		
		JCheckBox chckbxChicken = new JCheckBox("Melted Marshmallow");
		chckbxChicken.setBackground(new Color(255, 248, 220));
		chckbxChicken.setBounds(81, 84, 121, 23);
		panel_3.add(chckbxChicken);
		
		JCheckBox chckbxOnion = new JCheckBox("Cookie Dough");
		chckbxOnion.setBackground(new Color(255, 248, 220));
		chckbxOnion.setBounds(204, 84, 119, 23);
		panel_3.add(chckbxOnion);
		
		JCheckBox chckbxSausage = new JCheckBox("Cereal");
		chckbxSausage.setBackground(new Color(255, 248, 220));
		chckbxSausage.setBounds(81, 110, 121, 23);
		panel_3.add(chckbxSausage);
		
		JCheckBox chckbxPeppers = new JCheckBox("Fruit");
		chckbxPeppers.setBackground(new Color(255, 248, 220));
		chckbxPeppers.setBounds(204, 110, 119, 23);
		panel_3.add(chckbxPeppers);
		
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
		btnBack_2.setBounds(97, 147, 89, 23);
		panel_3.add(btnBack_2);
		
		JButton btnNext_3 = new JButton("Next");
		btnNext_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext_3.setBackground(new Color(255, 160, 122));
		
		btnNext_3.setBounds(216, 147, 89, 23);
		panel_3.add(btnNext_3);
		
		JCheckBox chckbxSmokedBacon = new JCheckBox("Nuts");
		chckbxSmokedBacon.setBackground(new Color(255, 248, 220));
		chckbxSmokedBacon.setBounds(81, 33, 121, 23);
		panel_3.add(chckbxSmokedBacon);
		
		JCheckBox chckbxSweetcorn = new JCheckBox("Chocolate Bark");
		chckbxSweetcorn.setBackground(new Color(255, 248, 220));
		chckbxSweetcorn.setBounds(204, 33, 119, 23);
		panel_3.add(chckbxSweetcorn);
		panel_4.setBackground(new Color(255, 255, 255));
		
		layeredPane.add(panel_4, "name_288700827764400");
		panel_4.setLayout(null);
		
		JLabel lblFinalOrder = new JLabel("Final Order");
		lblFinalOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFinalOrder.setBounds(153, 5, 92, 14);
		panel_4.add(lblFinalOrder);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSize.setBounds(43, 37, 48, 14);
		panel_4.add(lblSize);
		
		
		JLabel lblSauce_1 = new JLabel("Sauce");
		lblSauce_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSauce_1.setBounds(43, 62, 48, 14);
		panel_4.add(lblSauce_1);
		
		JLabel lblCheese_1 = new JLabel("Flavor");
		lblCheese_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCheese_1.setBounds(43, 87, 48, 14);
		panel_4.add(lblCheese_1);
		
		JLabel lblToppings_1 = new JLabel("Toppings");
		lblToppings_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToppings_1.setBounds(43, 112, 59, 14);
		panel_4.add(lblToppings_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(131, 151, 157, -26);
		panel_4.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(124, 34, 238, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 59, 238, 20);
		textField_2.setEditable(false);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 84, 238, 20);
		textField_3.setEditable(false);
		panel_4.add(textField_3);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(43, 156, 48, 14);
		panel_4.add(lblTotal);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 153, 96, 20);
		textField_4.setEditable(false);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnBack_4 = new JButton("Back");
		btnBack_4.setBackground(new Color(255, 160, 122));
		btnBack_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_4.setBounds(273, 1, 89, 23);
		panel_4.add(btnBack_4);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setBackground(new Color(255, 160, 122));
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnOrder.setBounds(234, 152, 89, 23);
		panel_4.add(btnOrder);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(124, 107, 238, 22);
		panel_4.add(textArea);
		
		JLabel lblAda = new JLabel("");
		lblAda.setForeground(new Color(255, 160, 122));
		lblAda.setBounds(140, 11, 157, 14);
		frame.getContentPane().add(lblAda);
		
		// Ice Cream size button handler
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				size = comboBox.getSelectedItem().toString();
			}
		});
		//Ice Cream flavor button handler
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
				flavor = comboBox_1.getSelectedItem().toString();
			}
		});
		//Ice Cream sauce button handler	
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
				sauce = comboBox_2.getSelectedItem().toString();
			}
		});
		
		//Pizza toppings button handler	
		btnNext_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
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
				textField_2.setText(sauce);
				textField_3.setText(flavor);
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
		Cream customCream = new IceTopping(toppings, new IceFlavors(flavor, new IceSauce(sauce,new IceSize(size, new Cream(0)))));
		textField_4.setText(""+customCream.getCost());
	}

	
	
}
