package org.yanG.patrones.singleton;

public class Singleton {
    public static void main(String[] args) {
        ConexionBdSingleton conexion = null;
        for (int i = 0; i <10 ; i++) {
            conexion = ConexionBdSingleton.getInstance();
            System.out.println("con: " + conexion);
        }

        ConexionBdSingleton conexion2 = ConexionBdSingleton.getInstance();
        ConexionBdSingleton conexion3 = ConexionBdSingleton.getInstance();
        boolean b1 = (conexion == conexion2) && (conexion3 == conexion2) && (conexion == conexion3);
        System.out.printf("b1: " + b1);
    }
}
