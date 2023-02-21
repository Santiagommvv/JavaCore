package com.mycompany.networking.ddrsockets._3_minichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Cliente implements Runnable {

    private int puerto;
    private String mensaje;
    
    public Cliente(int puerto, String mensaje){
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        final String HOST = "127.0.0.1";
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, puerto);
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF(mensaje);
            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
