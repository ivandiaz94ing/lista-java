package com.aluracursos.listas.principal;

import com.aluracursos.listas.modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double saldo = 0;
        int i = 1;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresar Limite de tu saldo: ");
        saldo = lectura.nextDouble();
        System.out.println(saldo);
        List<Producto> listaProductos = new ArrayList<>();



        while (saldo > 0 && i == 1){
            switch (i){
                case 1:
                    Producto producto = new Producto();
                    System.out.println("Escriba la descripcion de la compra");
                    producto.setNombre(lectura.next());
                    System.out.println("Escriba el valor de la compra");
                    producto.setPrecio(lectura.nextDouble());
                    listaProductos.add(producto);
                    System.out.println("Compra realizada!!");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida : ");
            }

            System.out.println("Escriba 0 para salir o 1 para continuar");
            i = lectura.nextInt();
            System.out.println(i);
        }
        System.out.println(listaProductos);
    }
}
