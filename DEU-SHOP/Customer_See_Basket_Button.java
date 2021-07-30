import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Customer_See_Basket_Button extends JFrame {

	public Customer_See_Basket_Button(Customer C) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		if(C.getBasket().size()==0) {
			JOptionPane.showMessageDialog(getContentPane(), "Customers basket is empty.");
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(scrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(scrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 36, 414, 180);
		getContentPane().add(scrollPane);
		JList list_1 = new JList(SelectionScreen.D.ListAllProducts(Customer_Selection.CC.getBasket()));
		scrollPane.setViewportView(list_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				List_All_Products cw=new List_All_Products();
				cw.setVisible(true);
			}
		});
		btnBack.setBounds(0, 11, 89, 23);
		getContentPane().add(btnBack);
		
		JButton btnRemovefrombasket = new JButton("RemoveFromBasket");
		btnRemovefrombasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list_1.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Please select a product.");
				} else {
					Product C = (Product) list_1.getSelectedValue();
					Product P = SelectionScreen.D.SearchProductInStack(Customer_Selection.CC.getBasket(),C);					
					SelectionScreen.D.getProducts().add(P);

					setVisible(false);
					Customer_See_Basket_Button lcb = new Customer_See_Basket_Button(Customer_Selection.CC);
					lcb.setVisible(true);

				}

			}
		});
		btnRemovefrombasket.setBounds(20, 227, 133, 23);
		getContentPane().add(btnRemovefrombasket);

		
	
	}

}
