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
public class Cafe {
    
    private int id;
    protected String nomeCafe;

    public Cafe(int id, String nomeCafe) {
        this.id = id;
        this.nomeCafe = nomeCafe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCafe() {
        return nomeCafe;
    }

    public void setNomeCafe(String nomeCafe) {
        this.nomeCafe = nomeCafe;
    }
    
    
    
}
