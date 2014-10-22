package entity;

import java.awt.Component;
import java.awt.Graphics;

public abstract class Forme extends Component{
	protected String name = "";
	protected String color = "#ff0000";
	public Point point = new Point(0, 0);
	
	
	public Forme(){
		this.name="forme";
		this.color="#ff0000";
		this.point = new Point(0, 0);
	}
	public Forme(int x,int y){
		this.name="forme";
		this.color="#ff0000";
		this.point = new Point(x, y);
	}
	public Forme(String name,String color,int x,int y){
		this.name=name;
		this.color=color;
		this.point = new Point(x, y);
	}
	
	//force la redefinition de "dessine()"
	public abstract String dessine();
	
	public abstract void paintComponent(Graphics g);
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public Point getPoint() {
		return point;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
}