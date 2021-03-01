/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import model.Cafe;
import model.Evento;
import model.Pessoa;
import java.util.ArrayList;
import model.Agendamento;

/**
 *
 * @author mathe
 */
public class Banco {
    
    public static ArrayList<Pessoa> pessoa;
    public static ArrayList<Cafe> cafe;
    public static ArrayList<Evento> evento;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void iniciar(){
    
        //Instancia os Objetos
        pessoa = new ArrayList<>();
        cafe = new ArrayList<>();
        evento = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando elementos
        

        Pessoa pessoa1 = new Pessoa(1, "Alan Figueiredo");
        Pessoa pessoa2 = new Pessoa(2, "Judite Oliveira");
        Pessoa pessoa3 = new Pessoa(3, "Paulo Ricado");
        Pessoa pessoa4 = new Pessoa(4, "Neymar Santos");
        Pessoa pessoa5 = new Pessoa(5, "Debruine Pipoqueiro");
        Pessoa pessoa6 = new Pessoa(6, "Matuidi Pareira");
        Pessoa pessoa7 = new Pessoa(7, "Marta de Souza");
        Pessoa pessoa8 = new Pessoa(8, "Aline Ferrari");
        Pessoa pessoa9 = new Pessoa(9, "Samuel Coltinho");
        Pessoa pessoa10 = new Pessoa(10, "Felipe Luis");
        
        Evento evento1 = new Evento(1, "Sala 1", 30);
        Evento evento2 = new Evento(2, "Sala 2", 30);

        
        Cafe cafe1 = new Cafe(6, "Intervalo 1");
        Cafe cafe2 = new Cafe(6, "Intervalo 2");


        Agendamento agendamento1 = new Agendamento(1, pessoa1, evento2, cafe1);
        Agendamento agendamento2 = new Agendamento(2, pessoa3, evento1, cafe2);
        Agendamento agendamento3 = new Agendamento(3, pessoa4, evento1, cafe1);
        
        //Adiciona Elementos na lista
        pessoa.add(pessoa1);
        pessoa.add(pessoa2);
        
        pessoa.add(pessoa1);
        pessoa.add(pessoa2);
        pessoa.add(pessoa3);
        pessoa.add(pessoa4);
        pessoa.add(pessoa5);
        pessoa.add(pessoa6);
        pessoa.add(pessoa7);
        pessoa.add(pessoa8);
        pessoa.add(pessoa9);
        pessoa.add(pessoa10);
        
        evento.add(evento1);
        evento.add(evento2);
        
        cafe.add(cafe1);
        cafe.add(cafe2);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
