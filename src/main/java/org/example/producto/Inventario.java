package org.example.producto;

import java.util.ArrayList;

public class Inventario {

    private static ArrayList<Producto> productos = new ArrayList<>();

    public static void agregarProducto(String nombre, double precio, int cantidad){
        Producto nuevoProducto = new Producto(nombre, precio, cantidad );
        productos.add(nuevoProducto);
        System.out.println("Producto guardado: " + nuevoProducto);

    }

    public static void listarProductos (){

        for (Producto p: productos){
            System.out.println(p);
        }
    }

    public static void eliminarProductoPorId(int id){
        Producto aEliminar= null;

        for (Producto p: productos){
            if (p.getId() == id) {
                aEliminar=p;
                break;
            }
        }
        if (aEliminar != null) {
            productos.remove(aEliminar);
            System.out.println("Producto eliminado: " + aEliminar );
        } else {
            System.out.println("No se encontró el producto con el ID: " + id);
        }



    }

}
