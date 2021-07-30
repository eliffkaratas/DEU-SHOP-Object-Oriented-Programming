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

public class List_Customer_Button extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public List_Customer_Button() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JList list = new JList(SelectionScreen.D.ListCustomers());

		list.setFont(new Font("Tahoma", Font.PLAIN, 9));
		list.setBounds(10, 36, 414, 180);
		contentPane.add(list);

		JButton btnNext = new JButton("See Basket");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Please select a person.");
				} 
				else {
					Customer C = (Customer) list.getSelectedValue();
						if(C.getBasket().size()==0) {
							JOptionPane.showMessageDialog(getContentPane(), "Customers basket is empty.");
						}
						else {
							More_Information_Button MB = new More_Information_Button(C);
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
				Management_CustomerCreate sc = new Management_CustomerCreate();
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
					Customer C = (Customer) list.getSelectedValue();
					int index=SelectionScreen.D.Search(2, C.getName());
					SelectionScreen.D.getPersons()[index]=null;
					setVisible(false);
					List_Customer_Button lcb = new List_Customer_Button();
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
