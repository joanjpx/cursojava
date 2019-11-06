package swing;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Text1 extends JPanel {

	public Text1() {
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Learning javax.Swing", 100, 100);
	}

}
