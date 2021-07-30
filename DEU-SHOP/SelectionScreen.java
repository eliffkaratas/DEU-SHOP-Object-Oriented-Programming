import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SelectionScreen extends JFrame {

	private JPanel contentPane;

	public static DEUSHOP D;
	public static void main(String[] args) {
		D=new DEUSHOP(50);
		DEUSHOP D=new DEUSHOP(55);
		Date D1 = new Date(5, 7, 1998);
		Date D2 = new Date(10, 7, 2004);

		Phone P1 = new Phone("534", "342", "23234");
		Phone P2 = new Phone("53224", "342", "23234");

		Adress A1 = new Adress("SSS", "KKK", "MMM");
		Adress A2 = new Adress("SQQQSS", "KKK", "MMM");
		Customer C1 = new Customer("Berkay", "asfd", "gmail", P1, "sdaf", A1, D1);
		Customer C2 = new Customer("Berk", "asfd", "gmail", P2, "sdaf", A2, D2);
		Customer C3 = new Customer("Elif", "asfd", "gmail", P2, "sdaf", A2, D2);

		Seller S1 = new Seller("sdf", "sdf", "sdf", P2, "sdf", A2, D2);
		Seller S2 = new Seller("ssdfg", "sdf", "sdf", P2, "sdf", A2, D2);
		
		CargoWorker CW1=new CargoWorker("Berkay", "asfd", "gmail", P1, "sdaf", A1, D1,10);
		CargoWorker CW2=new CargoWorker("Berkay", "asfd", "gmail", P1, "sdaf", A1, D1,15);
		CargoWorker CW3=new CargoWorker("Elif", "asfd", "gmail", P1, "sdaf", A1, D1,15);
		
		Product P=new Women_Product(S2, "TYPE", "NAME", 31, 69, "SDF", true);
		Product P11=new Women_Product(S2, "TYPE1", "NAME1", 31, 69, "SDF", true);
		Product P12=new Women_Product(S2, "TYPE2", "NAME2", 31, 69, "SDF", true);
		Product P3=new Women_Product(S2, "TYPE", "NAME3", 31, 69, "SDF", true);
		Product P4=new Women_Product(S2, "TYPE", "NAME4", 31, 69, "SDF", true);
		Product P5=new Women_Product(S2, "TYPE", "NAME5", 31, 69, "SDF", true);
		Product P6=new Women_Product(S2, "TYPE", "NAME6", 31, 69, "SDF", true);
		Product P7=new Women_Product(S2, "TYPE", "NAME7", 31, 69, "SDF", true);
		Product P8=new Women_Product(S2, "TYPE", "NAME8", 31, 69, "SDF", true);
		
		D.getProducts().add(P);
		D.getProducts().add(P11);
		D.getProducts().add(P12);
		D.getProducts().add(P3);
		D.getProducts().add(P4);
		D.getProducts().add(P5);
		D.getProducts().add(P6);
		D.getProducts().add(P7);
		D.getProducts().add(P8);
		
		
		Packet PP=new Packet(C2, S2, D2, D2, 5, CW2);
		CW1.getDistribution_order().enqueue(PP);
		S1.getOrders().enqueue(PP);
		C1.getBasket().push(PP);
		
		D.addPerson(C1);
		D.addPerson(C2);
		D.addPerson(S1);
		D.addPerson(S2);
		D.addPerson(CW1);
		D.addPerson(CW2);
		D.addPerson(CW3);
		D.addPerson(C3);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionScreen frame = new SelectionScreen();
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
	public SelectionScreen() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CustomerLogin l = new CustomerLogin();
				setVisible(false);
				l.frmLogIn.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(189, 172, 134, 95);
		contentPane.add(btnNewButton);
		
		JButton btnSeller = new JButton("Seller");
		btnSeller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				SellerLogin l = new SellerLogin();
				l.frmLogIn.setVisible(true);
			}
		});
		btnSeller.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSeller.setBounds(32, 172, 126, 95);
		contentPane.add(btnSeller);
		
		JButton btnManagement = new JButton("Management");
		btnManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ManagementLogin l = new ManagementLogin();
				l.frmLogIn.setVisible(true);
				
			}
		});
		btnManagement.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnManagement.setBounds(350, 172, 161, 95);
		contentPane.add(btnManagement);
		
		JLabel lblChooseYourRole = new JLabel("Choose Your Role");
		lblChooseYourRole.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblChooseYourRole.setBounds(153, 77, 186, 28);
		contentPane.add(lblChooseYourRole);
	}
}
