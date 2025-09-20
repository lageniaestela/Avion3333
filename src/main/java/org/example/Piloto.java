package org.example;

public class Piloto {
     private String nombre;
     private String empresadetrabajo;

     Piloto(){};

    Piloto(String x, String y){
        this.nombre=x;
        this.empresadetrabajo=y;
    }

    public String getEmpresadetrabajo() {
        return empresadetrabajo;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String x) {
        this.nombre = x;
    }


}
