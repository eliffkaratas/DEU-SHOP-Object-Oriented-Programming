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

public class Management_CustomerCreate extends JFrame {

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

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Management_CustomerCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 454, 297);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 11, 157, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 42, 157, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 73, 39, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 139, 157, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(138, 170, 157, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 201, 157, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(138, 232, 157, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 104, 39, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(185, 73, 45, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(240, 73, 55, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(185, 104, 45, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(240, 104, 55, 20);
		panel.add(textField_11);
		
		JRadioButton radioButton = new JRadioButton("Female");
		radioButton.setBounds(138, 258, 59, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Male");
		radioButton_1.setBounds(199, 258, 109, 23);
		panel.add(radioButton_1);
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Phone P=new Phone(textField_2.getText(), textField_8.getText(), textField_9.getText());
				Adress A=new Adress(textField_3.getText(), textField_4.getText(), textField_5.getText());
				Date D=new Date(Integer.parseInt(textField_7.getText()), Integer.parseInt(textField_10.getText()), Integer.parseInt(textField_11.getText()));
				Customer C=new Customer(textField.getText(), textField_1.getText(), textField_6.getText(), P, radioButton.getActionCommand(), A, D);
				SelectionScreen.D.addPerson(C);
				List_Customer_Button lcb = new List_Customer_Button();
				lcb.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(334, 272, 89, 23);
		panel.add(button);
		
		JLabel label = new JLabel("Name:");
		label.setBounds(10, 14, 45, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Surname:");
		label_1.setBounds(10, 45, 56, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Phone :");
		label_2.setBounds(10, 76, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Date :");
		label_3.setBounds(10, 107, 46, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Adress :");
		label_4.setBounds(10, 142, 46, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Mail :");
		label_5.setBounds(10, 235, 67, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Gender :");
		label_6.setBounds(10, 262, 46, 14);
		panel.add(label_6);
	}
}
