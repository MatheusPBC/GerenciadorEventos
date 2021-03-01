/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.helper;

import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;

/**
 *
 * @author mathe
 */
public class AgendaHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[] {
                
                agendamento.getId(),
                agendamento.getNome(),
                agendamento.getNomeLota(),
                agendamento.getNomeCafe()
                
                
            });
            
        }
    }
    
    
}
