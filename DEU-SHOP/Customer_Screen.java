import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Customer_Screen extends JFrame {

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
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtPhone;
	private JTextField txtDate;
	private JTextField txtAddress;
	private JTextField txtMail;
	private JTextField txtGender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Screen frame = new Customer_Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Customer_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(138, 21, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 52, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 83, 39, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 149, 157, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(138, 180, 157, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 211, 157, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(138, 242, 157, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 114, 39, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(185, 83, 45, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(240, 83, 55, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(185, 114, 45, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(240, 114, 55, 20);
		contentPane.add(textField_11);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(138, 268, 59, 23);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(199, 268, 109, 23);
		contentPane.add(rdbtnMale);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 287, 89, 23);
		contentPane.add(btnNext);
		
		txtName = new JTextField();
		txtName.setText("Name:");
		txtName.setBounds(10, 21, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setText("Surname:");
		txtSurname.setColumns(10);
		txtSurname.setBounds(10, 52, 86, 20);
		contentPane.add(txtSurname);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone:");
		txtPhone.setColumns(10);
		txtPhone.setBounds(10, 83, 86, 20);
		contentPane.add(txtPhone);
		
		txtDate = new JTextField();
		txtDate.setText("Date:");
		txtDate.setColumns(10);
		txtDate.setBounds(10, 114, 86, 20);
		contentPane.add(txtDate);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address:");
		txtAddress.setColumns(10);
		txtAddress.setBounds(10, 149, 86, 20);
		contentPane.add(txtAddress);
		
		txtMail = new JTextField();
		txtMail.setText("Mail:");
		txtMail.setColumns(10);
		txtMail.setBounds(10, 242, 86, 20);
		contentPane.add(txtMail);
		
		txtGender = new JTextField();
		txtGender.setText("Gender:");
		txtGender.setColumns(10);
		txtGender.setBounds(10, 269, 86, 20);
		contentPane.add(txtGender);
	}
}
