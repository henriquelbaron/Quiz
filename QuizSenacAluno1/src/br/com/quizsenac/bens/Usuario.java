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
public class Usuario implements Serializable {

    private Integer id;
    private String nome;
    private String ip;

    public Usuario() {
    }

    public Usuario(Integer id, String nome,String ip) {
        this.id = id;
        this.nome = nome;
        this.ip = ip;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
