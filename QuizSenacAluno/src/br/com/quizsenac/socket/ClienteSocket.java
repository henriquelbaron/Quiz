/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quizsenac.socket;

import br.com.quizsenac.bens.Pergunta;
import br.com.quizsenac.bens.Usuario;
import br.com.quizsenac.bens.UsuarioResposta;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class ClienteSocket {

    public static void enviarUsuarioParaAdmin(String ip, int porta , Object obj){
        try {
            Socket usuario = new Socket(ip, porta);
            ObjectOutputStream output = new ObjectOutputStream(usuario.getOutputStream());
            output.writeObject(obj);
            usuario.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
