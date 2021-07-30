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

public class More_Information_Button extends JFrame {

	public More_Information_Button(Customer C) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		JList list_1 = new JList(SelectionScreen.D.toArrayProduct(C.getBasket()));
		if(C.getBasket().size()==0) {
			JOptionPane.showMessageDialog(getContentPane(), "Customers basket is empty.");
		}
		list_1.setBounds(0, 35, 434, 226);
		getContentPane().add(list_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				List_Customer_Button cw=new List_Customer_Button();
				cw.setVisible(true);
			}
		});
		btnBack.setBounds(0, 11, 89, 23);
		getContentPane().add(btnBack);

		
	
	}

}
