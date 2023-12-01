package com.xjgv.patrones.factory.producto;

import com.xjgv.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza California Peperoni";
        masa = "Masa a la piedra gruesa";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Peperoni");
        ingredientes.add("Aceitunas");


    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min. a 55°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
