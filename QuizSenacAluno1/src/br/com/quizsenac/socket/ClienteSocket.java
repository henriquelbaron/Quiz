/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quizsenac.socket;

import br.com.quizsenac.bens.Pergunta;
import br.com.quizsenac.bens.Usuario;
import br.com.quizsenac.bens.UsuarioResposta;
import static br.com.quizsenac.teste.abrirPanelResposta;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author ACER
 */
public class ClienteSocket {

    private static UsuarioResposta usuarioResposta;
    private static Pergunta pergunta;
    private static Usuario usuario;
    private static String ipservidor;

    public static void processarMensagem(Object obj) {
        if (obj instanceof Usuario) {
            Usuario u = (Usuario) obj;
            setUsuario(u);
        }
        if (obj instanceof Pergunta) {
            Pergunta p = (Pergunta) obj;
            abrirPanelResposta(p);
        }
    }

    public static void enviarParaAdmin(String ip, Object obj) {
        try {
            Socket usuario = new Socket(ip, 8888);
            ObjectOutputStream output = new ObjectOutputStream(usuario.getOutputStream());
            output.writeObject(obj);
            usuario.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getIpservidor() {
        return ipservidor;
    }

    public static void setIpservidor(String ipservidor) {
        ClienteSocket.ipservidor = ipservidor;
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        ClienteSocket.usuario = usuario;
    }

    public static UsuarioResposta getUsuarioResposta() {
        return usuarioResposta;
    }

 

    public static Pergunta getPergunta() {
        return pergunta;
    }

    public static void setPergunta(Pergunta pergunta) {
        ClienteSocket.pergunta = pergunta;
    }

}
