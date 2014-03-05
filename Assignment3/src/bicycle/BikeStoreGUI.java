package bicycle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private BikeStore store;
	private JTextArea textArea;
	private JButton btnAddBike;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		store = new BikeStore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(200, 10, 222, 239);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(77, 56, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 87, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 118, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(18, 62, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(18, 93, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(18, 121, 46, 14);
		contentPane.add(lblPrice);
		
		/**JButton adds color, size and price to textArea */
		
		btnAddBike = new JButton("Add Bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				store.addBikes(textField.getText(), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()));
				textArea.setText(store.getAllBikes());
			}
		});
		btnAddBike.setBounds(35, 160, 117, 29);
		contentPane.add(btnAddBike);
		
		
		
	}
}
