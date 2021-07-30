import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seller_Selection extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblName;
	private JLabel lblSurname;
	private JLabel lblPhone;
	private JLabel lblDate;
	private JLabel lblAdress;
	private JLabel lblMail;
	private JLabel lblGender;
	private JButton btnNext;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Seller_Selection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 11, 157, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 42, 157, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 73, 39, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 139, 157, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(138, 170, 157, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 201, 157, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(138, 232, 157, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 104, 39, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(185, 73, 45, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(240, 73, 55, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(185, 104, 45, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(240, 104, 55, 20);
		contentPane.add(textField_11);
		
		JRadioButton radioButton = new JRadioButton("Female");
		radioButton.setBounds(138, 258, 59, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Male");
		radioButton_1.setBounds(199, 258, 109, 23);
		contentPane.add(radioButton_1);
		
		lblName = new JLabel("Name:");
		lblName.setBounds(10, 14, 45, 14);
		contentPane.add(lblName);
		
		lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(10, 45, 56, 14);
		contentPane.add(lblSurname);
		
		lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(10, 76, 46, 14);
		contentPane.add(lblPhone);
		
		lblDate = new JLabel("Date :");
		lblDate.setBounds(10, 107, 46, 14);
		contentPane.add(lblDate);
		
		lblAdress = new JLabel("Adress :");
		lblAdress.setBounds(10, 142, 46, 14);
		contentPane.add(lblAdress);
		
		lblMail = new JLabel("Mail :");
		lblMail.setBounds(10, 235, 67, 14);
		contentPane.add(lblMail);
		
		lblGender = new JLabel("Gender :");
		lblGender.setBounds(10, 262, 67, 14);
		contentPane.add(lblGender);
		
		btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				Seller_Product X = new Seller_Product();
				X.setVisible(true);
			}
		});
		btnNext.setBounds(330, 258, 89, 23);
		contentPane.add(btnNext);
	}

}
