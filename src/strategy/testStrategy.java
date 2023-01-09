package strategy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class testStrategy {

	private JFrame frame;
	private JTextField textName;
	private JTextField textCode;
	private JTextField textNumber;

	/**
	 * Launch the application.
	 */
	public static void NewScreen4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testStrategy window = new testStrategy();
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
	public testStrategy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.getContentPane().setForeground(new Color(255, 248, 220));
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textReceip = new JTextArea();
		textReceip.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textReceip.setBounds(432, 165, 328, 244);
		frame.getContentPane().add(textReceip);
		
		textName = new JTextField();
		textName.setBounds(237, 201, 140, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textCode = new JTextField();
		textCode.setBounds(237, 268, 140, 20);
		frame.getContentPane().add(textCode);
		textCode.setColumns(10);
		
		textNumber = new JTextField();
		textNumber.setBounds(237, 336, 140, 20);
		frame.getContentPane().add(textNumber);
		textNumber.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name of client :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(88, 203, 114, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type of Payment:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(88, 271, 140, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Amount:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(88, 339, 82, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(255, 160, 122));
		btnAdd.addActionListener(new ActionListener() {
		
			    
			public void actionPerformed(ActionEvent e) {
				
				textReceip.append("\t\t orders \n\n"+ "Name of client :\t"+ textName.getText() + "\n\n"+"Type of Payment :\t"+ textCode.getText() + "\n\n"+"Amount :\t"+textNumber.getText() + "\n\n");
				
			}
		});
		btnAdd.setBounds(100, 467, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnPrint = new JButton("Print\r\n");
		btnPrint.setBackground(new Color(255, 160, 122));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					textReceip.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setBounds(244, 467, 89, 23);
		frame.getContentPane().add(btnPrint);
		
		JButton btnClear = new JButton("clear");
		btnClear.setBackground(new Color(255, 160, 122));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText(null);
				textCode.setText(null);
				textNumber.setText(null);
				textReceip.setText(null);
			}
		});
		btnClear.setBounds(434, 467, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("exit");
		btnExit.setBackground(new Color(255, 160, 122));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit","Print System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(582, 467, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_3 = new JLabel("Payment of orders");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(314, 47, 166, 37);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
