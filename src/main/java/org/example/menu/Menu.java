package org.example.menu;

import org.example.producto.Inventario;

import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENÚ PRINCIPAL");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar/Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Crear un pedido");
            System.out.println("6. Listar pedidos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
                System.out.print("Seleccione una opción: ");
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {System.out.println("Nombre: ");
                String nombre= scanner.nextLine();

                    System.out.println("Precio: ");
                    double precio= scanner.nextDouble();

                    System.out.println("Cantidad: ");
                    int cantidad= scanner.nextInt();
                    scanner.nextLine();

                    Inventario.agregarProducto(nombre, precio, cantidad);
                }
                case 2 -> Inventario.listarProductos();
                case 3 -> System.out.println("Buscar/Actualizar producto seleccionado."); //sin hacer
                case 4 -> { System.out.println("Ingrese el ID del producto que desea eliminar: " );
                    int id= scanner.nextInt();
                    scanner.nextLine();
                    Inventario.eliminarProductoPorId(id);
                }

                case 5 -> System.out.println("Crear un pedido seleccionado.");
                case 6 -> System.out.println("Listar pedidos seleccionado.");
                case 7 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}
