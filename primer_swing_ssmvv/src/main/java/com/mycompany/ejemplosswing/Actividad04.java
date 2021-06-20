package com.mycompany.ejemplosswing;

import javax.swing.*;
import java.awt.event.*;


public class Actividad04 extends JFrame implements ActionListener{
	
	private DefaultListModel model;
        private JComboBox comboBox;
	private JButton button;
	private JTextField textField;
        private JScrollPane scrollpane;
        
	public Actividad04(){
	 setTitle("Ejercicio 3 ");
         setLayout(null);
	
        model = new DefaultListModel();
            model.addElement("Chile");
            model.addElement("Bolivia");
            model.addElement("Paraguay");
            model.addElement("Brasil");
            model.addElement("Uruguay");
        JList<String> lista = new JList<>();
        lista.setModel(model); 
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
	button.addActionListener(this);
        add(button);
        
	}
        
        
        
	public void actionPerformed (ActionEvent e){
	if(!textField.getText().trim().equals("")){
		model.addElement(textField.getText().trim());
		textField.setText("");
		textField.grabFocus();
	} else {
		JOptionPane.showMessageDialog(null, "Inserte contenido");
		}
}
        
        

  public static void main(String[] args){
  	Actividad04 ventana = new Actividad04();	
        ventana.setBounds(0,0,300,380);
	ventana.setVisible(true);
	ventana.setLocationRelativeTo(null);
	ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}