package logica.parte2;

import java.util.Date;

public class Ticket {
    private int numero;
    private int fila;
    private int asiento;
    private Date fechaCompra;
    private Date fechaValidez;
    private double precio;


    public Ticket() {
    }

    public Ticket(int numero, int fila, int asiento, Date fechaCompra, Date fechaValidez, double precio) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +
                ", fila=" + fila +
                ", asiento=" + asiento +
                ", fechaCompra=" + fechaCompra +
                ", fechaValidez=" + fechaValidez +
                ", precio=" + precio+"}";
    }
}