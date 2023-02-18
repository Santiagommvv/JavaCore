//un ejemplo de socket TCP
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor
{
	public static void main(String[] args)
	{
		ServerSocket servidor = null;
		Socket sc = null;
		final int PUERTO = 6000;
		DataInputStream in;
		DataOutputStream out;
		
		
		try 
		{	
			servidor = new ServerSocket(PUERTO);
			System.out.println("Servidor Iniciado");
			
			while(true)
			{
				sc = servidor.accept();
				
				
			}
		} 
		catch (IOException ex) 
		{
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		}	
		
	}
}