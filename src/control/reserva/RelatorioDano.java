/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.reserva;

/**
 *
 * @author Kelli
 */
public class RelatorioDano {
    
    private int id;
    
    private Reserva reservaRelatada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reserva getReservaRelatada() {
        return reservaRelatada;
    }

    public void setReservaRelatada(Reserva reservaRelatada) {
        this.reservaRelatada = reservaRelatada;
    }
    
    

    public void listarEquipDano() {
    }

}
