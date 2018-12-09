/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quizsenac.bens;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Pergunta implements Serializable{
    private Integer id;
    private String pergunta;
    private List<Resposta> respostas;
    private Jogo jogo;

    public Pergunta() {
    }

    public Pergunta(Integer id, String pergunta) {
        this.id = id;
        this.pergunta = pergunta;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    
    
}
