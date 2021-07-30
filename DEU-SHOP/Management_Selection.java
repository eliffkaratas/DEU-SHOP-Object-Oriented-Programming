import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Management_Selection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Management_Selection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListCustomer = new JButton("List Customers");
		btnListCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List_Customer_Button lcb = new List_Customer_Button();
				lcb.setVisible(true);
				setVisible(false);
				
			}
		});
		btnListCustomer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnListCustomer.setBounds(10, 40, 188, 23);
		contentPane.add(btnListCustomer);
		
		JButton btnListSellers = new JButton("List Sellers");
		btnListSellers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List_Seller_Buton lcb = new List_Seller_Buton();
				lcb.setVisible(true);
				setVisible(false);
			}
		});
		btnListSellers.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnListSellers.setBounds(10, 90, 188, 23);
		contentPane.add(btnListSellers);
		
		JButton btnNewButton = new JButton("List Cargo Workers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List_CW_Button lcb = new List_CW_Button();
				lcb.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 140, 188, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				ManagementLogin l = new ManagementLogin();
				l.frmLogIn.setVisible(true);
			}
		});
		btnBack.setBounds(0, 0, 89, 23);
		contentPane.add(btnBack);
	}

}
