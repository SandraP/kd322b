package uppgift2;


import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	House[] houses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		 
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 37, 387, 231);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(6, 6, 438, 329);
		lblNewLabel_1.setIcon(new ImageIcon(HouseGUI.class.getResource("/Images/Sk\u00E4rmavbild 2014-01-31 kl. 02.16.54.png")));
		contentPane.add(lblNewLabel_1);
		
		House[] myHouse = new House[10];{
			myHouse[0] = new House(1985, 120);
			myHouse[1] = new House(1993, 150);
			myHouse[2] = new House(1996, 160);
			
			
			
			for(int i=0; i< myHouse.length; i++){
				if(myHouse[i] !=null){
					textArea.append("Ett hus byggt " + myHouse[i].getYear() + " som ar " + myHouse[i].getSize() + " kvm stort.\n");
					
					
					
				}
			}textArea.append("Det finns totalt: " + House.getNbrOfHouses() + " stycken hus.");
		}
		
		
		
	        
				
	}
}

