package swing;

import javax.swing.JFrame;

class Frame1 extends JFrame{
	
	public Frame1(int x, int y) {
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ventana de Prueba");
		//this.setLocation(400,250);
		this.setBounds(x, y, getWidth(), getHeight());
		this.setResizable(false);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}