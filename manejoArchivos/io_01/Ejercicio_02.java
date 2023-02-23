import java.io.*;

public class Ejercicio_02 {

    public static void main(String[] args) {

        try {
            FileWriter fw2;
            //alla try-with-resources
            try ( FileWriter fw = new FileWriter("../texto4.txt")) {
                fw.write("Primera escritura, sin necesitar close()");
                fw2 = new FileWriter("../texto4.txt", true);
                fw2.write("\nSegunda escritura (que necesito cerrar)");
            }
            //fw lo pasé con try-with-resources, fw2 no, por tanto lo cierro
            fw2.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
