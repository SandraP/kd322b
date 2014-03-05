package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculatorGUI extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private Calculator calc;
	private JTextField textField;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 435);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		calc = new Calculator();
		
		
		
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.clear();
				updateTextField();
			}
		});
		btnNewButton.setBounds(76, 132, 73, 49);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("+/-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(156, 132, 72, 49);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(236, 132, 70, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(314, 132, 71, 49);
		contentPane.add(btnNewButton_2);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(7);
				updateTextField();
			}
		});
		button_4.setBounds(76, 182, 71, 49);
		contentPane.add(button_4);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(8);
				updateTextField();
			}
		});
		button_2.setBounds(156, 182, 72, 49);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(9);
				updateTextField();
			}
		});
		button_3.setBounds(236, 182, 70, 49);
		contentPane.add(button_3);
		
		JButton button_1 = new JButton("x");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.mult();
				updateTextField();
			}
		});
		button_1.setBounds(314, 182, 73, 49);
		contentPane.add(button_1);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(4);
				updateTextField();
			}
		});
		button_5.setBounds(76, 233, 73, 49);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(5);
				updateTextField();
			}
		});
		button_6.setBounds(156, 233, 72, 49);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(6);
				updateTextField();
			}
		});
		button_7.setBounds(236, 233, 70, 49);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.minus();
				updateTextField();
			}
		});
		button_8.setBounds(314, 233, 71, 49);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(1);
				updateTextField();
			}
		});
		button_9.setBounds(76, 285, 73, 49);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(2);
				updateTextField();
			}
		});
		button_10.setBounds(156, 285, 71, 49);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(3);
				updateTextField();
			}
		});
		button_11.setBounds(236, 285, 70, 49);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.plus();
				updateTextField();
				
			}
		}
		);
		button_12.setBounds(314, 285, 72, 49);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(0);
				int i = calc.getOperand();
				
			
			}
		});
		button_13.setBounds(76, 338, 151, 49);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton(",");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setBounds(236, 338, 71, 49);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.equals();
				updateTextField();
			
			}
		});
		button_15.setBounds(314, 338, 70, 49);
		contentPane.add(button_15);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(59, 24, 339, 369);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(11, 38, 317, 61);
		panel.add(textField);
		textField.setColumns(10);
		
		
	}


public void updateTextField(){
	textField.validate();
		textField.setText(calc.getResult() + "" + calc.getOperator() + "" + calc.getOperand());
}
}
