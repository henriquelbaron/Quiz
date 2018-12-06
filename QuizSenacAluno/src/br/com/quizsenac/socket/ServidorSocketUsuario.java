/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quizsenac.socket;

import br.com.quizsenac.bens.Pergunta;
import br.com.quizsenac.bens.Usuario;
import br.com.quizsenac.bens.UsuarioResposta;
import br.com.quizsenac.teste;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.swing.JOptionPane;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class ServidorSocketUsuario implements Runnable {

    private Integer porta;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Socket cliente;
    private ServerSocket server;

    public static void main(String[] args) {
        ServidorSocketUsuario serv = new ServidorSocketUsuario(8787);
        try {
            Thread t = new Thread(serv);
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ServidorSocketUsuario() {
    }

    public ServidorSocketUsuario(Integer porta) {
        this.porta = porta;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    @Override
    public void run() {
        try {
            JOptionPane.showMessageDialog(null, "Servidor iniciado " + InetAddress.getLocalHost().getHostAddress() + " porta " + porta);
            System.out.println("Servidor do Usuario iniciado " + InetAddress.getLocalHost().getHostAddress() + " porta " + porta);

            server = new ServerSocket(porta);
            while (true) {

                cliente = server.accept();
                System.out.println(cliente.getInetAddress().getHostName());
                input = new ObjectInputStream(cliente.getInputStream());
                Object obj = input.readObject();
                teste.processarMensagem(obj);
//                output = new ObjectOutputStream(cliente.getOutputStream());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ObjectOutputStream getSaidaObjeto(OutputStream outputStream) {
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(outputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return saida;
    }
   

    public static UsuarioResposta respostaUsuario(Object object) {
        if (object instanceof UsuarioResposta) {
            return (UsuarioResposta) object;
        }
        return null;
    }

    public static Pergunta pergunta(Object object) {
        if (object instanceof Pergunta) {
            return (Pergunta) object;
        }
        return null;
    }

    public void fechar() {
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException iOException) {
            iOException.getMessage();
        }
        try {
            if (cliente != null) {
                cliente.close();
            }
        } catch (IOException iOException) {
            iOException.getMessage();
        }
        try {
            if (server != null) {
                server.close();
            }
        } catch (IOException iOException) {
            iOException.getMessage();
        }
    }

}
