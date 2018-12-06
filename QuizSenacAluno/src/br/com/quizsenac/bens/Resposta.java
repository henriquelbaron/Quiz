/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quizsenac.bens;

import java.io.Serializable;

/**
 *
 * @author Alunos
 */
public class Resposta implements Serializable {

    private Integer id;
    private String resposta;
    private Pergunta pergunta;
    private Boolean correta;

    public Resposta() {
    }

    public Resposta(String resposta, Boolean correta) {
        this.resposta = resposta;
        this.correta = correta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Boolean getCorreta() {
        return correta;
    }

    public void setCorreta(Boolean correta) {
        this.correta = correta;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "Resposta{" + "resposta=" + resposta + ", correta=" + correta + '}';
    }

}
