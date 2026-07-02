package model;

public class Transporte {

    private String placa;
    private String color;
    private String tipoTransporte;
    private int capacidad;
    private int tarifa;

    public Transporte() {
        this.placa = "Sin Definir";
        this.capacidad = 1;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public int getTarifa(){
        return this.tarifa;
    }

    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }

}
