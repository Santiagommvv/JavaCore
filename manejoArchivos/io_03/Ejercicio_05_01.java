import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

//sin validaciones porque enfoque manejo File
public class Ejercicio_05_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        boolean salir = false;

        do 
        {

            //inventando la extensión "sam"
            try ( DataOutputStream dos = 
                    new DataOutputStream
                        (new FileOutputStream("../patterns/src/main/java/com/mycompany/ddr/archivos/candidatos.sam"
                                , true));) 
            {

                System.out.println("Ingrese DNI: ");
                String dni = sc.next();

                System.out.println("Ingrese Nombre: (7 caracteres max)");
                String nombre = sc.next();

                System.out.println("Ingrese edad: ");
                int edad = sc.nextInt();

                System.out.println("Ingrese expectativa salarial: ");
                double expectativa_salarial = sc.nextDouble();

                dos.writeUTF(dni);
                dos.writeUTF(nombre);
                dos.writeInt(edad);
                dos.writeDouble(expectativa_salarial);
                System.out.println("Candidato ingresado");
                System.out.println("¿Añadir otro candidato?");
                
                //equivale a toque N para salir
                char respuesta = sc.next().toUpperCase().charAt(0);
                if (respuesta == 'N')
                    salir = true;
            } 
            //varios catch en vez que multicatch, como si fuera a diferenciar
            catch (InputMismatchException ime) 
            {
              System.out.println(ime.getMessage());
            }
            catch (FileNotFoundException fnfe) 
            {
              System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }

        }     while (!salir);

    }

}
