import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio_01_02 {

    public static void main(String[] args) {
        String ruta = JOptionPane.showInputDialog(null, 
                "Dame el file path:",
                "Insercion",
                JOptionPane.INFORMATION_MESSAGE);

        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int contadorNumeros = 0;



        try ( FileReader fr = new FileReader(ruta)) {
            int car;
            int[] vocales = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};


		/*
			la lógica siguiente
			tiene errores y está
			pendiente de corrección
		*/
            
            while ((car = fr.read()) != -1) {
                if (car >= 48 && car <= 57) {
                    contadorNumeros++;
                } else 
                    if ((car >= 65 && car <= 90) || (car >= 97 && car >= 122)) {
                        
                        boolean esVocal = false;
                        for(int i=0; i<vocales.length && !esVocal; i++){
                            if(car==vocales[i])
                                esVocal = true;
                        }
                        
                        if(esVocal)
                            contadorVocales++;
                        else
                            contadorConsonantes++;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        System.out.println("vocales: " + contadorVocales);
        System.out.println("consonantes: " + contadorConsonantes);
        System.out.println("numeros: " + contadorNumeros);
        
    }
}
