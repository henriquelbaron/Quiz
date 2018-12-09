/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quizsenac.bens;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;

/**
 *
 * @author Alunos
 */
public class UsuarioResposta implements Serializable {

    private Integer id;
    private Pergunta pergunta;
    private Resposta resposta;
    private Usuario usuario;
    private Integer tempo;
    private Integer pontos;

    public UsuarioResposta() {
        this.pontos = 0;
    }

    public UsuarioResposta(Integer id, Pergunta pergunta, Resposta resposta, Usuario usuario, Integer tempo, Integer pontos) {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.tempo = tempo;
        this.pontos = pontos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void addPontos(Integer pontos) {
        this.pontos = pontos + this.pontos;
    }

    @Override
    public String toString() {
        return "Nome " +usuario.getNome() + " Acerto " + resposta.getCorreta();
    }

}
