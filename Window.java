package idk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JPanel topPanel = new JPanel();
	
	Paddle paddle = new Paddle();
	
	public Window() {
		this.init();
	}
	
	private void init() {
		this.setPreferredSize(new Dimension(600, 600));
		this.setTitle("Break Out");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.black);
//		this.setLayout(null);
		this.add(this.topPanel);

		
		this.topPanel.setPreferredSize(new Dimension(600, 600));
		this.topPanel.setBackground(Color.RED);
		this.topPanel.setLocation(new Point(0, 0));
		this.topPanel.add(this.paddle);
		
		this.pack();
	}
}
