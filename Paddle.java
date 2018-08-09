package idk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

public class Paddle extends JPanel {

	private int height = 15;
	private int width = 35;
	Dimension PaddleSize = new Dimension(this.height, this.width);
	public int PaddleX = 100;
	public int PaddleY = 600 - this.height;
	
	private Point topLeftPoint = new Point(this.PaddleX, this.PaddleY);
	
	
	public Paddle() {
		this.setPreferredSize(this.PaddleSize);
		this.setBackground(Color.white);
		
		
		
		this.setLocation(this.topLeftPoint);
	}
}
