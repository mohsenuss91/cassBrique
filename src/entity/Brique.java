package entity;

import java.awt.Color;
import java.awt.Graphics;

public class Brique extends Forme{
	protected int width;
	protected int height;
	public Brique() {
		// TODO Auto-generated constructor stub
		super();
		super.name="Rectangle";
		this.width = 40;
		this.height = 20;
	}
	public Brique(int x,int y,int width,int height){
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String dessine() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//getter setter
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//dessine
		public void paintComponent(Graphics g){
			System.out.println("dessine un carre");
		    g.setColor(Color.decode(this.getColor()));
		    g.fillRect(this.point.x, this.point.y, this.width, this.height);
		  }
	
}
