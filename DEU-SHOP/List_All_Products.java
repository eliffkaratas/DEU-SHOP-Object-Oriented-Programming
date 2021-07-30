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
import javax.swing.JScrollPane;

public class List_All_Products extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public List_All_Products() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(scrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(scrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 36, 414, 180);
		contentPane.add(scrollPane);
		JList list = new JList(SelectionScreen.D.ListAllProducts());
		scrollPane.setViewportView(list);

		list.setFont(new Font("Tahoma", Font.PLAIN, 9));

		JButton btnNext = new JButton("Purchase");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(!Customer_Selection.CC.getBasket().isEmpty()) {
					Product P=(Product) Customer_Selection.CC.getBasket().peek();				
					P.sell(Customer_Selection.CC);
				}
				
				
				setVisible(false);
				List_All_Products lcb = new List_All_Products();
				lcb.setVisible(true);
				
			}
			
			

		});
		btnNext.setBounds(151, 227, 100, 23);
		contentPane.add(btnNext);
		JButton btnAdd = new JButton("AddToBasket");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Please a select product.");
				} else {
					Product C = (Product) list.getSelectedValue();
					Product P = SelectionScreen.D.SearchProduct(C);
					P.addToBasket(Customer_Selection.CC);
					SelectionScreen.D.getProducts().remove(P);
					setVisible(false);
					List_All_Products lcb = new List_All_Products();
					lcb.setVisible(true);

				}
			}
		});
		btnAdd.setBounds(10, 227, 100, 23);
		contentPane.add(btnAdd);

		JButton btnSeebasket = new JButton("SeeBasket");
		btnSeebasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
						if(Customer_Selection.CC.getBasket().size()==0) {
							JOptionPane.showMessageDialog(getContentPane(), "Your basket is empty.");
						}
						else {
							Customer_See_Basket_Button MB = new Customer_See_Basket_Button(Customer_Selection.CC);
							MB.setVisible(true);
							setVisible(false);
						}					
					

				}
			}
		);
		btnSeebasket.setBounds(291, 227, 100, 23);
		contentPane.add(btnSeebasket);
		
		JButton btnBacktoroles = new JButton("BackToRoles");
		btnBacktoroles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectionScreen sc=new SelectionScreen();
				setVisible(false);
				sc.setVisible(true);
				
			}
		});
		btnBacktoroles.setBounds(10, 11, 120, 23);
		contentPane.add(btnBacktoroles);
	}
}
