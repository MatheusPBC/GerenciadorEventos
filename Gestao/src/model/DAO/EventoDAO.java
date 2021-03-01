/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.Evento;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class EventoDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Evento evento){
        Banco.evento.add(evento);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param evento
     * @return 
     */
    public boolean update(Evento evento){
        
        for (int i = 0; i < Banco.evento.size(); i++) {
            if(idSaoIguais(Banco.evento.get(i),evento)){
                Banco.evento.set(i, evento);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param evento
     * @return 
     */
    public boolean delete(Evento evento){
        for (Evento eventoLista : Banco.evento) {
            if(idSaoIguais(eventoLista,evento)){
                Banco.evento.remove(eventoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Evento> selectAll(){
        return Banco.evento;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param evento
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Evento evento, Evento eventoAComparar) {
        return evento.getId() ==  eventoAComparar.getId();
    }
    
    
    
}
