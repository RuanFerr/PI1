/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.reserva;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kelli
 */
public class HistoricoDevolucao {

    private Reserva reserva;
    private String operacao;
    private Date dataOperacao;
    private String nomeFunc;
    
    public HistoricoDevolucao(){
    }
    
    public HistoricoDevolucao(Reserva reserva, String operacao, Date dataOperacao, String nomeFunc){
        
        this.reserva = reserva;
        this.nomeFunc = nomeFunc;
        this.dataOperacao = dataOperacao;
        this.operacao = operacao;
        
    }
    
    private static ArrayList<HistoricoDevolucao> historicoDevolucao;

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public static ArrayList<HistoricoDevolucao> getHistoricoDevolucao() {
        return historicoDevolucao;
    }

    public static void setHistoricoDevolucao(ArrayList<HistoricoDevolucao> historicoDevolucao) {
        HistoricoDevolucao.historicoDevolucao = historicoDevolucao;
    }

    public static void registrarDevolucao(Reserva res){
        
        historicoDevolucao.add(new HistoricoDevolucao());
        
    }
    
    public void listarDadosDevolucao() {
        
    }

}
