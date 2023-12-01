package com.xjgv.patrones.factory;

import com.xjgv.patrones.factory.producto.PizzaNewYorkItaliana;
import com.xjgv.patrones.factory.producto.PizzaNewYorkPeperoni;
import com.xjgv.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana" ->{
                producto = new PizzaNewYorkVegetariana();
            }
            case "peperoni" -> {
                producto = new PizzaNewYorkPeperoni();

            }
            case "italiana" -> {
                producto = new PizzaNewYorkItaliana();
            }
        }
        return null;
    }
}
