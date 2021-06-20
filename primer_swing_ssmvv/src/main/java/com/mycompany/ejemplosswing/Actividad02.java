package com.mycompany.ejemplosswing;

import javax.swing.*;
import java.awt.*;

public class Actividad02 extends JFrame{
	private final JComboBox combo1;
	private String[] paises = {"Chile", "Bolivia", "Paraguay", "Brasil", "Uruguay"};
        
	public Actividad02(){
	 setTitle("Ejercicio 2 ");
	setLayout(new GridLayout(2,1));
	
	combo1 = new JComboBox();
	for(int i=1; i<31; i++){
                combo1.addItem(i);
	}
        add(combo1);
        
	JList lista = new JList(paises);
        add(lista);
	}

	

  public static void main(String[] args){
  	Actividad02 ventana = new Actividad02();
	ventana.setBounds(0,0,300,300);	
	ventana.setVisible(true);
	ventana.setLocationRelativeTo(null);
	ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}