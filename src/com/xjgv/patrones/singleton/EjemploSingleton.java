package com.xjgv.patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {
        ConexionBDSingleton conexion = null;

        for (int i = 0; i < 10; i++){
            conexion = ConexionBDSingleton.getInstance();
            System.out.println("conexion : " + conexion);
        }
        ConexionBDSingleton conexion1 = ConexionBDSingleton.getInstance();
        ConexionBDSingleton conexion2 = ConexionBDSingleton.getInstance();
        boolean b1 = (conexion1 == conexion2);
        System.out.println("b1 = " + b1);
    }
}
