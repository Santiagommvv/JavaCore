import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio_01 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("../archivoDeTexto.txt"); //directorio raíz de proyectos de netbeans
            fw.write("Firrrst line");
            fw.append("\n\nSecondaLine appendiada after 2 spaces");
            fw.close(); 

            //segundo argumento para evitar sobre-escritura como si fuese un append
            FileWriter fw2 = new FileWriter("../archivoDeTexto.txt", true);
            fw2.write("\n\nAppend tras saltar dos lines");
            fw2.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio_01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
