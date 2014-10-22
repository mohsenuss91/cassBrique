package entity;

import java.awt.Color;
import java.awt.Graphics;

public class Balle extends Forme{
	protected int rayon;
	
	//constructor
	public Balle() {
		super();
		super.name="Balle";
		this.rayon = 10;
		// TODO Auto-generated constructor stub
	}
	
	public Balle(int x,int y,int width,int height){
		super(x,y);
		this.rayon = width;
	}
	
	public Balle(String color, int x,int y,int width,int height){
		super(x,y);
		super.color = color;
		this.rayon = width;
	}
	
	
	public String toString() {
		return "rayon = "+rayon+ ", color = " + color + ", x=" + point.x + ", y=" + point.y;
	}
	@Override
	public String dessine() {
		// TODO Auto-generated method stub
		return null;
	}
	//collision
	public boolean Colision(Brique brique){
		if (brique == null) {
            return false;
        }
		//premier test en considérant le cercle comme un carré (whidth : rayon*2, height : rayon*2) 
		if (this.point.getX() < brique.point.getX() + brique.getWidth() && this.point.getX() + this.rayon*2 > brique.point.getX() && this.point.getX() < brique.point.getY() + brique.getHeight() && this.rayon*2 + this.point.getX() > brique.point.getY()) {
			
			//test 2 les angles 
			
			
			return true;
		}
		return false;
	}

	//getter setter
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public void paintComponent(Graphics g){
		System.out.println("dessine une balle");
	    g.setColor(Color.decode(this.getColor()));
	    g.fillOval(this.point.x, this.point.y, this.rayon*2, this.rayon*2);
	  }

}
