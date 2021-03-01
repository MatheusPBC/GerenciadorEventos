/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author mathe
 */
public class Agendamento {
    private int id;
    private Cafe nomeCafe;
    private Evento nomeLota;
    private Pessoa nome;

    public Agendamento(int id, Pessoa nome, Evento nomeLota, Cafe nomeCafe) {
        this.id = id;
        this.nome = nome;
        this.nomeCafe = nomeCafe;
        this.nomeLota = nomeLota;
           
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public Evento getNomeLota() {
        return nomeLota;
    }

    public void setNomeLota(Evento nomeLota) {
        this.nomeLota = nomeLota;
    }

    public Pessoa getNome() {
        return nome;
    }

    public void setNome(Pessoa nome) {
        this.nome = nome;
    }

    public Cafe getNomeCafe() {
        return nomeCafe;
    }

    public void setNomeCafe(Cafe nomeCafe) {
        this.nomeCafe = nomeCafe;
    }

  
}
