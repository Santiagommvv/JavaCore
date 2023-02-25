import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej_BuffLector {

    public static void main(String[] args) {
        
        try(BufferedReader br=new BufferedReader(new FileReader("../prueba_buffered.txt"))){
            
            String linea;
            
			
            while ( (linea = br.readLine()) != null ){
                System.out.println(linea);
            }
            
        }catch(IOException e){
            System.out.println("Error");
        }
        
        
    }
    
}