package com.mycompany.ejemplosswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Actividad05 extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu aplicaciones;
	private JMenuItem m1, m2, m3, m4;
	
	Actividad05(){
	 setLayout(null);
	setTitle("Quinto ejercicio");
	
	mb = new JMenuBar();
	setJMenuBar(mb);
	
	aplicaciones = new JMenu("Aplicaciones");
	mb.add(aplicaciones);

	m1 = new JMenuItem("Primera aplicación");
	aplicaciones.add(m1);
	m1.addActionListener(this);

	m2 = new JMenuItem("Segunda aplicación");
	aplicaciones.add(m2);
	m2.addActionListener(this);

	m3 = new JMenuItem("Tercera aplicación");
	aplicaciones.add(m3);
	m3.addActionListener(this);	
	
	m4 = new JMenuItem("Cuarta aplicación");
	aplicaciones.add(m4);
	m4.addActionListener(this);
	
	}

        public void actionPerformed(ActionEvent e){
            if (e.getSource() == m1)
            {
		Actividad01 ventana = new Actividad01();
		ventana.setBounds(0,0,450,200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                //this.setVisible(false);
            }
            if (e.getSource() == m2)
            {	
		Actividad02 ventana = new Actividad02();
		ventana.setBounds(0,0,300,300);	
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                //this.setVisible(false);
            }
            if (e.getSource() == m3)
            {
		Actividad03 ventana = new Actividad03();	
        	ventana.setBounds(0,0,300,380);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                //this.setVisible(false);
            }
            if (e.getSource() == m4)
            {
		Actividad04 ventana = new Actividad04();	
        	ventana.setBounds(0,0,300,380);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                //this.setVisible(false);
            }
        }



  public static void main(String[] args){
	Actividad05 ventana = new Actividad05();	
        ventana.setBounds(0,0,300,380);
	ventana.setVisible(true);
	ventana.setLocationRelativeTo(null);
	ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }	
}