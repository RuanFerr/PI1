package control.reserva;

import java.util.ArrayList;
import view.CadastroEquipamento;

public class Reserva {

    private int idReserva;
    private String dataHoraReserva;
    private Equipamento itemReserva;
    private String nomeResponsavel;
    private long CpfResp;

    public long getCpfResp() {
        return CpfResp;
    }

    public void setCpfResp(long CpfResp) {
        this.CpfResp = CpfResp;
    }
    
    private Equipamento equipamento;

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public static ArrayList<Reserva> getLogReservas() {
        return logReservas;
    }

    public static void setLogReservas(ArrayList<Reserva> logReservas) {
        Reserva.logReservas = logReservas;
    }

    public Reserva() {

    }

    public Reserva(Equipamento item, String dataHora, String nomeResponsavel, long cpfResp) {
        this.dataHoraReserva = dataHora;
        this.itemReserva = item;
        this.nomeResponsavel = nomeResponsavel;
        this.CpfResp = cpfResp;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getDataHoraReserva() {
        return dataHoraReserva;
    }

    public void setDataHoraReserva(String dataHoraReserva) {
        this.dataHoraReserva = dataHoraReserva;
    }

    public Equipamento getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(Equipamento itemReserva) {
        this.itemReserva = itemReserva;
    }

    public void registraDevolucao() {

    }

    public static String[] getMes() {
        return mes;
    }

    public static void setMes(String[] mes) {
        Reserva.mes = mes;
    }

    public static String[] getDia28() {
        return dia28;
    }

    public static void setDia28(String[] dia28) {
        Reserva.dia28 = dia28;
    }

    public static String[] getDia30() {
        return dia30;
    }

    public static void setDia30(String[] dia30) {
        Reserva.dia30 = dia30;
    }

    public static String[] getDia31() {
        return dia31;
    }

    public static void setDia31(String[] dia31) {
        Reserva.dia31 = dia31;
    }

    public static String[] retornaNomeItem() {

        final int asd = CadastroEquipamento.itens.size();

        String[] nomes = new String[asd];

        for (int i = 0; i < CadastroEquipamento.itens.size(); i++) {

            String b = CadastroEquipamento.itens.get(i).getNome();

            nomes[i] = b;
        }
        return nomes;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public static boolean validarReserva(Reserva res) {

        boolean aceito = true;

        for (int i = 0; i < reservas.size(); i++) {
            if ((res.dataHoraReserva.equals(reservas.get(i).dataHoraReserva)) && (res.itemReserva.equals(reservas.get(i).itemReserva)) && (res.CpfResp == reservas.get(i).CpfResp)) {
                aceito = false;
            }
        }

        return aceito;
    }

    public static ArrayList<Reserva> reservas = new ArrayList();

    private static ArrayList<Reserva> logReservas = new ArrayList();

    private static String mes[] = {"mês", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

    private static String dia28[] = {"dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"};
    private static String dia30[] = {"dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    private static String dia31[] = {"dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

}
