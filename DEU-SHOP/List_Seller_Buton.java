import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class List_Seller_Buton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public List_Seller_Buton() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JList list = new JList(SelectionScreen.D.ListSellers());

		list.setFont(new Font("Tahoma", Font.PLAIN, 9));
		list.setBounds(10, 36, 414, 180);
		contentPane.add(list);

		JButton btnNext = new JButton("See Orders");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Please select a person.");
				} 
				else {
					Seller S = (Seller) list.getSelectedValue();
					
						if(S.getOrders().isEmpty()) {
							JOptionPane.showMessageDialog(getContentPane(), "Seller order is empty.");
						}
						else {
							More_Information_Seller_Button MB = new More_Information_Seller_Button(S);
							MB.setVisible(true);
							setVisible(false);
						}					
					} 

				}

			
		});
		btnNext.setBounds(208, 227, 117, 23);
		contentPane.add(btnNext);
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Management_Seller_Create sc = new Management_Seller_Create();
				setVisible(false);
				sc.setVisible(true);
			}
		});
		btnAdd.setBounds(10, 227, 89, 23);
		contentPane.add(btnAdd);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Please select a person.");
				} 
				else {
					Seller C = (Seller) list.getSelectedValue();
					int index=SelectionScreen.D.Search(3, C.getName());
					SelectionScreen.D.getPersons()[index]=null;
					setVisible(false);
					List_Seller_Buton lcb = new List_Seller_Buton();
					lcb.setVisible(true);
					
				}
				
				
				
			}
		});
		btnDelete.setBounds(109, 227, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Management_Selection mng = new Management_Selection();
				mng.setVisible(true);
				
			}
		});
		btnBack.setBounds(10, 11, 89, 23);
		contentPane.add(btnBack);
	}
}
