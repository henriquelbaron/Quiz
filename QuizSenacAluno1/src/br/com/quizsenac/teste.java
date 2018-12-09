package br.com.quizsenac;

import br.com.quizsenac.bens.Pergunta;
import br.com.quizsenac.bens.Usuario;
import br.com.quizsenac.socket.ServidorSocketUsuario;
import br.com.quizsenac.view.FrameInicial;
import br.com.quizsenac.view.PanelRespostaCorreta;
import br.com.quizsenac.view.PanelRespostaErrada;
import br.com.quizsenac.view.RespostaUsuarioPanel;
import br.com.quizsenac.view.TelaEsperaPanel;
import javax.swing.JFrame;

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
        FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FRAME.setVisible(true);
    }

    public static void abrirRespostaErrada() {
        PanelRespostaErrada pane = new PanelRespostaErrada();
        FRAME.setContentPane(pane);
        FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FRAME.setVisible(true);

    }

    public static void abrirRespostaCerta() {
        PanelRespostaCorreta pane = new PanelRespostaCorreta();
        FRAME.setContentPane(pane);
        FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FRAME.setVisible(true);
    }

    public teste() {
    }

    public static void abrirPanelResposta(Pergunta p) {
        RespostaUsuarioPanel pane = new RespostaUsuarioPanel(p);
        FRAME.setContentPane(pane);
        FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FRAME.setVisible(true);
    }

    public static void abrirTeladeEspera() {
        TelaEsperaPanel panel = new TelaEsperaPanel();
        FRAME.setContentPane(panel);
        FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FRAME.setVisible(true);
    }

}
