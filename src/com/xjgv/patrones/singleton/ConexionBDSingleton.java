package com.xjgv.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton(){
        System.out.println("Conectandose con MySQL");
    }

    public static ConexionBDSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
