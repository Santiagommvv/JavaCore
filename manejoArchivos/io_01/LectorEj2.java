import java.io.*;

public class LectorEj2 {

    public static void main(String[] args) {
        //Usando StringBuilder para no generar nuevas cadenas por cada caracter que leo 
        StringBuilder contenido = new StringBuilder("");
        int c;
        
        try {
            FileReader fr = new FileReader("../texto4.txt");
            //EOF devuelve -1
            while((c = fr.read()) != -1){   // pasado por el while evito escribirlo afuera y adentro del bucle
                contenido.append((char)c);
            }
            
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        System.out.println("contenido del archivo: \n\n" + contenido);
    }

}
