package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import entity.*;

public class FormePanel extends JPanel {
	public Forme forme = null;

/*
	public FormePanel(Forme forme) throws Exception {
		System.out.println("creation d'un objet");
		if (forme == null) {
			throw new Exception ("l'objet forme n'existe pas et/ou est null");
		}
	}
	*/	
	public void paintComponent(Graphics g){
		System.out.print("dessine un objet");
		
		if (forme == null) {
				System.out.println("l'objet forme n'existe pas et/ou est null");
		} 
	
		g.setColor(Color.decode(forme.getColor()));  
				
	    //si c'est une brique
		if(forme instanceof Brique){
			System.out.println(" brique");
			g.fillRect(forme.getPoint().getX(),forme.getPoint().getY(),((Brique) forme).getWidth(), ((Brique) forme).getHeight());
		}
		
		//si c'est une balle
		if(forme instanceof Balle){
			System.out.println(" balle");
			g.fillOval(forme.getPoint().getX(),forme.getPoint().getY(), ((Balle) forme).getRayon()*2, ((Balle) forme).getRayon()*2);
		}
	  }
	
		public void go(){
			this.repaint();
		}

		public Forme getForme() {
			return forme;
		}

		public void setForme(Forme forme) {
			this.forme = forme;
		}
		
		
	}