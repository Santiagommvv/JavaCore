import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ej_BuffEscribe {

    public static void main(String[] args) {
        
        String texto1="Primera linea de texto ";
        String texto2="Segunda linea de texto";
        
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("../prueba_buffered.txt"))){
            
            bw.write(texto1);
            bw.newLine();
            bw.write(texto2);
            
        }catch(IOException e){
            System.out.println("Error");
        }
        
    }
    
}