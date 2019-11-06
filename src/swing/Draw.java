package swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Draw extends JPanel{

	public Draw() {
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.drawRect(50, 50, 300, 300);
		//g.drawLine(50, 50, 300, 300);
		//g.drawArc(50, 60, 100, 100, 30, 50);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,80);
		g2.draw(rectangulo);
		
	}
}
