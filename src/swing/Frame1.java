package swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

class Frame1 extends JFrame{
	
	Toolkit TK = Toolkit.getDefaultToolkit();
	
	public Frame1(int w, int h, String t) {
		this.setSize(w, h);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(t);
		//this.setLocation(400,250);
		//this.setBounds(x, y, getWidth(), getHeight());
		this.setResizable(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public void setFrameToCenter(boolean v)
	{
		if (v==true)
		{
			Dimension screenSize = TK.getScreenSize();
			this.setLocation(screenSize.width/4,screenSize.height/4);
		}
	}
	
	public void setFrameIcon(String filename)
	{
		Image myIcon = TK.getImage(filename);
		this.setIconImage(myIcon);
	}
	
	
}