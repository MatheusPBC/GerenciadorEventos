/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.Cafe;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class CafeDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Cafe cafe){
        Banco.servico.add(cafe);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cafe
     * @return 
     */
    public boolean update(Cafe cafe){
        
        for (int i = 0; i < Banco.cafe.size(); i++) {
            if(idSaoIguais(Banco.cafe.get(i),cafe)){
                Banco.cafe.set(i, cafe);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param Cafe
     * @return 
     */
    public boolean delete(Cafe cafe){
        for (Cafe cafeLista : Banco.cafe) {
            if(idSaoIguais(cafeLista,cafe)){
                Banco.cafe.remove(cafe);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Cafe> selectAll(){
        return Banco.cafe;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param cafe
     * @param cafeAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Cafe cafe, Cafe cafeAComparar) {
        return cafe.getId() ==  cafeAComparar.getId();
    }
    
}
