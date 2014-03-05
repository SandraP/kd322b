package animals;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 48, 440, 224);
		contentPane.add(textArea);
		
		ArrayList<Animal> dumbFacts = new ArrayList<Animal>();
		
		Cat Animal1 = new Cat("Fat",5,9);
		Snake Animal2 = new Snake("Snape", true);
		Dog Animal3 = new Dog("Buster",4,true);
		Snake Animal4 = new Snake("Sir Vas", false);
		Dog Animal5 = new Dog("Barnie", 3, false);
		
		dumbFacts.add(Animal1);
		dumbFacts.add(Animal2);
		dumbFacts.add(Animal3);
		dumbFacts.add(Animal4);
		dumbFacts.add(new Cat("bob",2,2));
		
		
		String nothing = "";
		for(int i = 0; i < dumbFacts.size(); i++){
			Animal currentAnimal = dumbFacts.get(i);
			nothing = nothing + currentAnimal.getInfo() + "\n";
			
		}
		
		textArea.setText(nothing); 
		
		
		
		
		
		JLabel lblDumbFacts = new JLabel("Dumb facts:");
		lblDumbFacts.setBounds(16, 20, 105, 16);
		contentPane.add(lblDumbFacts);
	}
}
