package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Member extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member frame = new Member();
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
	public Member() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 824);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 432, 22);
		contentPane.add(menuBar);
		menuBar.setBackground(Color.RED);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setBackground(Color.RED);
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mntmSkrivUt.setBackground(Color.WHITE);
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mntmAvsluta.setBackground(Color.WHITE);
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		mnMedlem.setBackground(Color.RED);
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		mnHjlp.setBackground(Color.RED);
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 26, 434, 99);
		contentPane.add(scrollPane);
		
		
		String[] columnNames = {"Efternamn",
                "Fornamn"};

Object[][] data = {
		{"Andersson", "Anders", new Integer(3), new Boolean(true)},
		{"Bengtsson", "Bengt", new Integer(3), new Boolean(true)},
		{"Gunnarsson", "Gunnar", new Integer(3), new Boolean(true)},
		{"Nilsson", "Nils", new Integer(5), new Boolean(false)},
		{"Svensson", "Sven", new Integer(3), new Boolean(true)},
		

};
		
		table = new JTable(data, columnNames);
		table.setBackground(new Color(255, 250, 205));
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Fornamn:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(20, 505, 75, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(93, 505, 310, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Efternamn:");
		label.setForeground(Color.BLACK);
		label.setBounds(20, 539, 75, 22);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(93, 539, 310, 22);
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("Adress:");
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(20, 573, 75, 22);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(93, 573, 310, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(93, 607, 310, 22);
		contentPane.add(textField_3);
		
		JLabel label_2 = new JLabel("E-post:");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(20, 641, 75, 22);
		contentPane.add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(93, 641, 310, 22);
		contentPane.add(textField_4);
		
		JLabel label_3 = new JLabel("Telefon:");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(20, 676, 75, 22);
		contentPane.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(93, 677, 310, 22);
		contentPane.add(textField_5);
		
		JLabel label_4 = new JLabel("Personnr:");
		label_4.setForeground(Color.BLACK);
		label_4.setBounds(20, 471, 75, 22);
		contentPane.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(93, 471, 310, 22);
		contentPane.add(textField_6);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(285, 708, 117, 29);
		contentPane.add(btnSpara);
		
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(Member.class.getResource("/images/Images/profile.jpg")));
		lblNewLabel_1.setBounds(20, 343, 125, 116);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 343, 432, 396);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 26, 432, 305);
		contentPane.add(panel_1);
		
	}
}
