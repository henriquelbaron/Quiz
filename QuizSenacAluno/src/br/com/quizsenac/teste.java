package br.com.quizsenac;

import br.com.quizsenac.bens.Pergunta;
import br.com.quizsenac.socket.ServidorSocketUsuario;
import br.com.quizsenac.view.FrameInicial;
import br.com.quizsenac.view.RespostaUsuarioPanel;
import br.com.quizsenac.view.TelaEsperaPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public class teste {

    private static FrameInicial FRAME;
    private static ServidorSocketUsuario serverSocket;

    public static void main(String[] args) {
        FRAME = new FrameInicial();
        FRAME.setVisible(true);
    }

    public static void abrirPanelResposta(Pergunta p) {
        RespostaUsuarioPanel pane = new RespostaUsuarioPanel(p);
        FRAME.setContentPane(pane);
        FRAME.pack();
        FRAME.setVisible(true);
    }

    public static void abrirTeladeEspera() {
        serverSocket = new ServidorSocketUsuario();
        TelaEsperaPanel panel = new TelaEsperaPanel();
        FRAME.setContentPane(panel);
        FRAME.pack();
        FRAME.setVisible(true);
    }

    public static void processarMensagem(Object obj) {
        serverSocket.fechar();
        if (obj instanceof Pergunta) {
            abrirPanelResposta((Pergunta) obj);
        }
    }
}
