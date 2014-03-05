package xmlProgram;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bargraph extends JComponent {

	
	private int women;
	private int men;
	private float total;

	
	public Bargraph(){
		this.women = 0;
		this.men = 0;
		this.total = 0;
	}
	
	public Bargraph(int women, int men){
		super();
		this.men = men;
		this.women = women;
	}
	
	
	public void updateValues(int women, int men) {
		
		this.women = women;
		this.men = men;
		this.total = this.women + this.men;
		
		System.out.println("effin hate allt");
		
		this.invalidate();
		this.repaint();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		int height = getHeight();
		int width = getWidth();
		
		if(this.women > 0) {
			
			float percent = women / total;
			float pixelValue = height * percent;
			
			System.out.println("asdsadas" + percent + " % ksjadhasjkhd");
			
			int posX = (width / 2) - (width / 6);
			int posY = (int) (height - pixelValue);
			
			g.setColor(Color.BLACK);
			g.fillRect(posX, posY, width / 4, (int) pixelValue); 
		} else {
			System.out.println("women = 0");
		}
		
		if(this.men > 0) {
			
			float percent = men / total;
			float pixelValue = height * percent;
			
			System.out.println("asdsadas" + percent + " % ksjadhasjkhd");
			
			int posX = (width / 2) - (width / 2);
			int posY = (int) (height - pixelValue);
			
			g.setColor(Color.RED);
			g.fillRect(posX, posY, width / 4, (int) pixelValue); 
		} else {
			System.out.println("men = 0");
		}
		
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, width, 0);
		g.drawString("Totalt " + total + " sokande.", 0, 15);
		
		
		
	}
}
