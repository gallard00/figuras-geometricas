package Model;

import Interface.ICalcularFig;

public class Poligono implements ICalcularFig {
    
    private  int cantLado;
    private  double lado;

    public Poligono(int cantLado, double lado) {
        this.cantLado = cantLado;
        this.lado = lado;
    }

    public Poligono(double lado) {
        this.lado = lado;
    }

    public Poligono(int cantLado) {
        this.cantLado = cantLado;
    }
    
    

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getCantLado() {
        return cantLado;
    }

    public void setCantLado(int cantLado) {
        this.cantLado = cantLado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    //</editor-fold>   

//<editor-fold defaultstate="collapsed" desc="Metodos ICalcularFigura">    
    @Override
    public double calcArea() {
        double apotema = lado / (2 * Math.tan(Math.PI / cantLado));
        return (cantLado * lado * apotema) / 2;
    }

    @Override
    public double calcPer() {
        return cantLado * lado;
    }
//</editor-fold>   
}
