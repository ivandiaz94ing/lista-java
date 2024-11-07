package com.aluracursos.listas.principal;

import com.aluracursos.listas.modelo.Producto;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        List<Producto> listaProductos = new ArrayList<>();

        double saldo = 0;
        int i = 1;


        System.out.println("Ingresar Limite de tu saldo: ");
        saldo = lectura.nextDouble();

        while (i == 1 && saldo > 0) {
            System.out.println("Escriba la descripcion de la compra");
            Producto producto = new Producto();
            producto.setNombre(lectura.next());

            System.out.println("Escriba el valor de la compra");
            double precio = lectura.nextDouble();

            if (precio > saldo) {
                System.out.println("Saldo insuficiente. ");
                break;
            }
            producto.setPrecio(precio);
            listaProductos.add(producto);
            saldo -= precio;

            System.out.println("Compra realizada!!");
            if (saldo > 0) {
                System.out.println("Escriba 0 para salir o 1 para continuar");
                while (true) {
                    i = lectura.nextInt();
                    if (i == 0 || i == 1) {
                        break;
                    } else {
                        System.out.println("Opcion invalida. Escriba 0 para salir o 1 para continuar");
                    }
                }

            } else {
                System.out.println("Tu cuenta quedo en cero");

            }


        }
        Collections.sort(listaProductos, new Comparator<Producto>() {
            public int compare(Producto p1, Producto p2) {
                return Double.compare(p1.getPrecio(), p2.getPrecio());
            }
        });

        System.out.println("*************************");
        System.out.println("COMPRAS REALIZADAS:");
        System.out.println();
        for (Producto item : listaProductos) {
            System.out.println(item);
        }


    }
}
