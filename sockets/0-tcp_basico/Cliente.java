//Ejemplo de socket TCP
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente{
	public static void main(String[] args)
	{
		final String HOST = "127.0.0.1";
		final int PUERTO = 6000;
		DataInputStream in;
		DataOutputStream out;
		
		try
		{
			Socket sc = new Socket(HOST, PUERTO);
			in = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			
			out.writeUTF("Hola, here I am El Cliente");
			String mensaje = in.readUTF();
			System.out.println(mensaje);
			
			
			sc.close();
			
		} catch(IOException ex)
		{
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}