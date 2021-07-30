import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Seller_Product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtProductName;
	private JTextField txtType;
	private JTextField txtSize;
	private JTextField txtColour;
	private JTextField txtPrice;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seller_Product frame = new Seller_Product();
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
	public Seller_Product() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddProduct = new JButton("ADD PRODUCT");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				DEFINE X = new DEFINE();
				X.setVisible(true);
			}
		});
		btnAddProduct.setBounds(72, 11, 134, 23);
		contentPane.add(btnAddProduct);
		
		textField = new JTextField();
		textField.setBounds(127, 55, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtProductName = new JTextField();
		txtProductName.setText("   Product  Name :");
		txtProductName.setBounds(10, 55, 86, 20);
		contentPane.add(txtProductName);
		txtProductName.setColumns(10);
		
		txtType = new JTextField();
		txtType.setText("Type :");
		txtType.setBounds(10, 86, 86, 20);
		contentPane.add(txtType);
		txtType.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setText("Size :");
		txtSize.setBounds(10, 120, 86, 20);
		contentPane.add(txtSize);
		txtSize.setColumns(10);
		
		txtColour = new JTextField();
		txtColour.setText("Colour :");
		txtColour.setBounds(10, 151, 86, 20);
		contentPane.add(txtColour);
		txtColour.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setText("Price :");
		txtPrice.setBounds(10, 182, 86, 20);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 86, 124, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 120, 124, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(127, 151, 124, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(127, 182, 124, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
