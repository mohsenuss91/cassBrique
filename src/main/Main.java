package main;

import java.awt.Color;
import java.awt.Component;

import entity.Balle;
import entity.Brique;
import entity.Forme;
import entity.Point;
import view.Panel;
import view.Window;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window view = new Window();
		Panel panel = new Panel();
		
		panel.setSize(200, 200);
		Balle[] tabBalle = {
				new Balle(10,10,5,5),
				new Balle("#00ff00",10,150,5,5)};
		
		Brique[] tabBrique = {
				new Brique(150, 50, 10, 10),
				new Brique(150, 150, 10, 10)
		};
		
		try {
			
			
			for(Balle balle : tabBalle){
				System.out.println("balle : "+balle);
				panel.add(balle);
			}
			
			for(Brique brique : tabBrique){
				System.out.println("brique : "+brique);
				panel.add(brique);
			}
			
								
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		view.setContentPane(panel);
		
		 do{
			 Point p = tabBalle[0].getPoint();p.setX(p.getX()+1);
			
			 for(Component componement : panel.getComponents()){
				 ((Forme) componement).paintComponent(panel.getGraphics());
			}
			 
			 try {
				 Thread.sleep(100);
			 } catch (InterruptedException e) {
			     e.printStackTrace();
			 }
		 }while(true);
		 
	}
	
	
	

}
