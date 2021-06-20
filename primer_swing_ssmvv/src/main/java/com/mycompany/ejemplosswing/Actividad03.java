package com.mycompany.ejemplosswing;

import javax.swing.*;
import java.awt.*;

public class Actividad03 extends JFrame{
	private final JComboBox comboBox;
	private String[] paises = {"Chile", "Bolivia", "Paraguay", "Brasil", "Uruguay"};
	private JButton button;
	private JTextField textField;
        private JScrollPane scrollpane;
        
	public Actividad03(){
	 setTitle("Ejercicio 3 ");
         setLayout(null);
	
	JList lista = new JList(paises);
        scrollpane = new JScrollPane(lista);
        scrollpane.setBounds(60,20,170,100);
        add(scrollpane);
                
        comboBox = new JComboBox();
	comboBox.setBounds(60,150,170,30);
	for(int i=1; i<31; i++){
                comboBox.addItem(i);
	}
        add(comboBox);
        
	
	textField = new JTextField();
	textField.setBounds(60,240,170,30);
	add(textField);
	
	button = new JButton("Insertar");
	button.setBounds(95,286,100,30);
        add(button);
        
	}

	

  public static void main(String[] args){
  	Actividad03 ventana = new Actividad03();	
        ventana.setBounds(0,0,300,380);
	ventana.setVisible(true);
	ventana.setLocationRelativeTo(null);
	ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}