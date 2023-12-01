package com.xjgv.patrones.factory;

import com.xjgv.patrones.factory.producto.PizzaCaliforniaPeperoni;
import com.xjgv.patrones.factory.producto.PizzaCaliforniaQueso;
import com.xjgv.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{


    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso" -> {
                producto = new PizzaCaliforniaQueso();
            }
            case "peperoni" -> {
                producto = new PizzaCaliforniaPeperoni();
            }
            case "vegetariana" ->{
                producto = new PizzaCaliforniaVegetariana();
            }
        }

        return producto;
    }
}
