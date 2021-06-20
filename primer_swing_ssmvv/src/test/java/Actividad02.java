


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//aplicación que pase nombres de una caja de texto a una lista


public class Actividad02 extends JFrame implements ActionListener{
    private JButton boton;
    private JTextField campoTexto;
    private DefaultListModel modelo; 
    private JScrollPane scrollPane;
   // private JPanel panel;
    
    public Actividad02(){
         
        setTitle("Pasar nombres");    
	setLayout(null);
        
        modelo = new DefaultListModel();
        JList<String> lista = new JList<>();
        lista.setModel(modelo); 
        scrollPane = new JScrollPane(lista);
        lista.setBounds(100,50,200,100);
        
        
        campoTexto = new JTextField();
        campoTexto.setBounds(100,250,200,30);
        
        
        boton = new JButton("enviar");
        boton.setBounds(50,300,150,100);
        boton.addActionListener(this);
        
        add(lista); add(campoTexto); add(boton);
         
     }
    
     public void actionPerformed(ActionEvent e){
            if(e.getSource()==boton){
		if(!campoTexto.getText().trim().equals("")){
		modelo.addElement(campoTexto.getText().trim());
		campoTexto.setText("");
		campoTexto.grabFocus();
	} else {
		JOptionPane.showMessageDialog(null, "Inserte contenido");
		}
            }    
	} 
    
  public static void main(String[] args){
    	Actividad02 interfaz = new Actividad02();
  	interfaz.setBounds(0,0,200,400);
  	interfaz.setVisible(true);
  	interfaz.setLocationRelativeTo(null);
  	interfaz.setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  }
}
