package com.xjgv.patrones.factory.ejemplo;

import com.xjgv.patrones.factory.PizzaProducto;
import com.xjgv.patrones.factory.PizzeriaCaliforniaFactory;
import com.xjgv.patrones.factory.PizzeriaNewYorkFactory;
import com.xjgv.patrones.factory.PizzeriaZonaAbstractFactory;
import com.xjgv.patrones.factory.producto.PizzaNewYorkItaliana;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("Andres ordena una pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("John ordena la pizza " + pizza.getNombre());
    }
}
