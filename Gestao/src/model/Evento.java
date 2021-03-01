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
public class Evento {
    
    private int id;
    protected String nomeLota;
    private int Lotacao;

    public Evento(int id, String nomeLota, int Lotacao) {
        this.id = id;
        this.nomeLota = nomeLota;
        this.Lotacao = Lotacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLota() {
        return nomeLota;
    }

    public void setNomeLota(String nomeLota) {
        this.nomeLota = nomeLota;
    }

    public int getLotacao() {
        return Lotacao;
    }

    public void setLotacao(int Lotacao) {
        this.Lotacao = Lotacao;
    }
    
    
    
}
