package org.example;

public class Avion {

        private int cantpasajeros;
        private String Nombreempresa;
        private int combustible;



    public int getCombustible(){
        return(combustible);
    }
    public void setCombustible(int x) {
        this.combustible=x;
    }


    public String getCodigoruta() {
        return codigoruta;
    }

    public void setCodigoruta(String codigoruta) {
        this.codigoruta = codigoruta;
    }

    private String codigoruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    private String ruta;
     Avion(){}
     Avion(int a, String b){
         this.cantpasajeros=a;
         this.Nombreempresa=b;
     }
     Avion(int t, String tt, String ttt )
     {   this.cantpasajeros=t;
         this.Nombreempresa=tt;
         this.codigoruta=ttt;

     }
    Avion(int valor1, String valor2, int valor3)
    {
         this.cantpasajeros=valor1;
         this.Nombreempresa=valor2;
         this.combustible=valor3;
    }
    public void aterrezar(){
        System.out.println("Avion aterrizando");
    }

    public String getNombreempresa() {
        return Nombreempresa;
    }

    public void setNombreempresa(String x) {
        Nombreempresa = x;
    }

    public int getCantpasajeros() {
        return cantpasajeros;
    }

    public void setCantpasajeros(int valor) {
        this.cantpasajeros = valor;
    }
}
