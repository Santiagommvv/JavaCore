/*
ejemplo UDP 
	el rol "servidor" tiene puerto, 
	el cliente no lo explicita
	
	respecto a la capacidad de los arreglos de bytes que manejan Servidor y Cliente,
	debería conseguir hacer un trim del espacio en blanco cuando 
	termina la comunicación

*/
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.InetAddress;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor
{
	public static void main(String[] args)
	{
		final int PUERTO = 6000;
		byte[] buffer = new byte[256];
		
		try 
		{	
			System.out.println("Comienza UDP puerto 6000:");
			DatagramSocket socketUDP = new DatagramSocket(PUERTO);
			
			while (true)
			{
				DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
				
				//recepcion del datagrama
				socketUDP.receive(peticion);
				System.out.println("Recibo info de Don Cliente");
				
				String mensaje = new String(peticion.getData());
				System.out.println(mensaje);
				
				//si no se quiere responder, no es necesario (¿¿??)
				int puertoCliente = peticion.getPort();
				InetAddress direccion = peticion.getAddress(); 
				
				
				
				mensaje = "hola desde el servidor (sin ahorrar en caracteres)";
				buffer = new byte[256];
				buffer = mensaje.getBytes();
				
				DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, puertoCliente);
				
				System.out.println("Enviada info cliente");
				socketUDP.send(respuesta);
			}	
		} 
		catch (SocketException ex)
		{
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		catch (IOException ex)
		{
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		} 
		
	}
}