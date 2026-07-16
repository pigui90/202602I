package model;

public class Transporte {
    private String placa;
    private int tarifa;
    private int capacidad;
    private TipoTarifa tipoTarifa;
    private TipoTransporte tipoTransporte;

    public Transporte(){

    }

    public Transporte(String placa, int capacidad, int tarifa, TipoTarifa tipoTarifa, TipoTransporte tipoTransporte ){
        this.placa = placa;
        this.capacidad = capacidad;
        this.tarifa = tarifa;
        this.tipoTarifa = tipoTarifa;
        this.tipoTransporte = tipoTransporte;

    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
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

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }


    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int gananciaTotal(){
        return this.capacidad * this.tarifa;
    }

}
