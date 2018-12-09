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
 * @author ACER
 */
public class Jogo implements Serializable {

    private Integer id;
    private String nome;
    private List<Pergunta> perguntas;

    public Jogo() {
    }

    public Jogo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
