package swing;

import java.awt.*;
import javax.swing.*;

public class TestDraw {

	public TestDraw() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame1 frame = new Frame1(400,400,"Prueba de Dibujo");
		Draw dibujo = new Draw();
		frame.add(dibujo);
		frame.setFrameToCenter(true);
		frame.setFrameIcon("C:/Users/Usuario/Downloads/e536f1c455971518335bccb0a63f2b5e.JPG");
	}

}
