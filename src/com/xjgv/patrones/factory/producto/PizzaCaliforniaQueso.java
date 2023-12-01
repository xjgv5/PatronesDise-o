package com.xjgv.patrones.factory.producto;

import com.xjgv.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");


    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min. a 100°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
