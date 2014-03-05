package xmlProgram;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;




public class DOMproject extends JFrame {
	
	private Document doc;
	org.w3c.dom.Node node;
	private ArrayList<Program> programList = new ArrayList<Program>();
	
	public JLabel programLable;
	public JLabel lblNewLabel;
	public JLabel amountLabel;
	private JPanel contentPane;

	
	/**This method finds the XML file and returns content*/
	private Document openXmlFile(String fileName){
	
		Document doc = null;
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e){
			e.printStackTrace();
		}
		return doc;
	}
	
	
	/**ArrayList that gets all programs from the XML file*/

	private ArrayList<Program> loadAllPrograms(){
		ArrayList<Program> output = new ArrayList<Program>();
		
		
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i< programs.getLength(); i++){
			node = programs.item(i); 
			Element elm = (Element) node;
			
			
			String name =elm.getElementsByTagName("name").item(0).getTextContent();
			String code = elm.getElementsByTagName("code").item(0).getTextContent();
			int woman = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
			int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
				
			Program program = new Program(name, code, woman ,men);
			output.add(program);
			
		}
		return output;
	}
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DOMproject frame = new DOMproject();
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
	public DOMproject() {
		doc = openXmlFile("ht2013_antagning.xml");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel programLable = new JLabel("New label");
		programLable.setBounds(25, 6, 439, 53);
		contentPane.add(programLable);
		programLable.setText("First element (the root): " + doc.getDocumentElement().getNodeName());
				
		JLabel lblNewLabel = new JLabel("New label");
		programList = loadAllPrograms();
		lblNewLabel.setBounds(25, 54, 358, 40);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("Amount of programs: " + programList.size());
	
		
	
		programList = loadAllPrograms();
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(20, 89, 421, 40);
		contentPane.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(programList.toArray()));
	
		
	
		programList = loadAllPrograms();
		System.out.println("First element (the root): " + doc.getDocumentElement().getNodeName());
		System.out.println("Amount of programs: " + programList.size());

	}
}


