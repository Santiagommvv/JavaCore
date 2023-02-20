//Ejemplo de socket TCP
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
				//"socket del cliente"
				sc = servidor.accept();
				
				System.out.println("Cliente conectado");
				in = new DataInputStream(sc.getInputStream());
				out = new DataOutputStream(sc.getOutputStream());
				
				//queda a la espera con readUTF()
				String mensaje =  in.readUTF();
				
				System.out.println(mensaje);
				
				out.writeUTF("Salu2 desde el servidor");
				
				sc.close();
				System.out.println("Cliente desconectado");
				
			}
		} 
		catch (IOException ex) 
		{
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		}	
		
	}
}