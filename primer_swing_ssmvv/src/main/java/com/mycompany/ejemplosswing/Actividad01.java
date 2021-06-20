package com.mycompany.ejemplosswing;

import javax.swing.*;

public class Actividad01 extends JFrame{
	private JLabel label;

	Actividad01(){
	 setLayout(null);
	
	setTitle("Mi primera aplicación gráfica");
	}
  
  public static void main(String[] args){

	Actividad01 ventana = new Actividad01();
	ventana.setBounds(0,0,450,200);
	ventana.setLocationRelativeTo(null);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

  }
}