package swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Index {

	public Index() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit TK = Toolkit.getDefaultToolkit();
		Dimension screenSize = TK.getScreenSize();
		Frame1 frame = new Frame1(screenSize.width/4,screenSize.height/4);
		
	}

}

