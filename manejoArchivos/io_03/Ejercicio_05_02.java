import java.util.*;
import java.io.*;

public class Ejercicio_05_02 {
    public static void main(String[] args) {
        
        try(DataInputStream dis 
                = new DataInputStream
                    (new FileInputStream
                    ("../patterns/src/main/java/com/mycompany/ddr/archivos/candidatos.sam"));) 
        {
            
            System.out.println("DNI\t\t\tNombre\t\tEdad\t\texp.Salario");
            String dni;
            String nombre;
            int edad;
            double expectativa_salarial;
            
                    /*puedo hacer un filtro muy precario
                    manteniendo los dis.read
                    pero souteando bajo alguna condición*/
            
            while(true){
                dni = dis.readUTF();
                System.out.print(dni + "\t\t");
                
                nombre = dis.readUTF();
                System.out.print(nombre + "\t\t");
                
                edad =  dis.readInt();
                System.out.print(edad + "\t\t");
                
                expectativa_salarial = dis.readDouble();
                System.out.print(expectativa_salarial + "\t\t\n");
                //System.out.println("");//en caso que "no convenga" escapar un salto dentro del último campo
            }
        } catch (EOFException eofe) {
            System.out.println("\n---EOF---\n");    //usar excepción como flujo de programa tiene que ser una mala práctica
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
    }
    
}
