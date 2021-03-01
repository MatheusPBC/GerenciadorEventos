/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class PessoaDAO {
    
    /**
     * Insere uma pessoa dentro do banco de dados
     * @param pessoa exige que seja passado um objeto do tipo pessoa
     */
    public void insert(Pessoa pessoa){
        Banco.pessoa.add(pessoa);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pessoa
     * @return 
     */
    public boolean update(Pessoa pessoa){
        
        for (int i = 0; i < Banco.pessoa.size(); i++) {
            if(idSaoIguais(Banco.pessoa.get(i),pessoa)){
                Banco.pessoa.set(i, pessoa);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param pessoa
     * @return 
     */
    public boolean delete(Pessoa pessoa){
        for (Pessoa pessoaLista : Banco.pessoa) {
            if(idSaoIguais(pessoaLista,pessoa)){
                Banco.pessoa.remove(pessoaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pessoa> selectAll(){
        return Banco.pessoa;
    }
    
  
  

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Pessoa usuario, Pessoa usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
    
    
}
