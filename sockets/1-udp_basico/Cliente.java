/*
ejemplo UDP 
	rol de "cliente"

	respecto a la capacidad de los arreglos de bytes que manejan Servidor y Cliente,
	debería conseguir hacer un trim del espacio en blanco cuando 
	termina la comunicación

*/
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente{
	public static void main(String[] args)
	{
		final int PUERTO_DEL_SERVIDOR = 6000;
		byte[] buffer = new byte[256];
		
		try
		{ 
			InetAddress direccionServidor = InetAddress.getByName("localhost");
			DatagramSocket socketUDP = new DatagramSocket();
			
			buffer = new byte[256];
			
			String mensaje = "HOLA desde el cliente";
			//lee mensaje en bytes
			buffer = mensaje.getBytes();
			//ahora el datagrama se crea con esos bytes y +
			DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length, direccionServidor, PUERTO_DEL_SERVIDOR);
			
			System.out.println("envio el datagrama");
			socketUDP.send(pregunta);
			
			//el mensaje que recibo del servidor se pisa con lo que escribo más abajo, por eso tengo que instanciar un arreglo de bytes nuevo
			buffer = new byte[256];
			//prepara respuesta
			DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
			
			//recibo respuesta
			socketUDP.receive(peticion);
			System.out.println("recibo respuesta(peticion) y por las dudas voy a hacerla bastante larga");
			
			mensaje = new String(peticion.getData());
			System.out.println(mensaje);
			
			socketUDP.close();
		
		} catch (SocketException ex){
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnknownHostException ex){
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex){
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}