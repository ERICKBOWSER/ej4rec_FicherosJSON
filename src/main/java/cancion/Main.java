/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cancion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Listamos los ficheros que se pueden leer
        System.out.println("¿Que fichero quieres leer?\n"
                + FicheroJSON.listarDirectorio("casos\\"));

        // Almacenamos el nombre del fichero a leer
        String ficheroLeer = teclado.nextLine();

        // Ejecutamos el método y lo almacenamos en la instancia
        CasoPrueba caso = FicheroJSON.leerJSON(ficheroLeer);

        String respuesta = "";

        do {
            respuesta = obtenerDato(caso);
            respuesta = teclado.nextLine(); // Limpiamos
            
            switch (respuesta) {

                case "1":
                    System.out.println("El peso que soporta es: " + caso.getPeso() + "kg");
                    break;
                case "2":
                    // Bucle para modificar el peso
                    for (int i = 0; i < caso.getElefantes().size(); i++) {
                        // Almacenamos el valor absoluto
                        int num = Math.abs(caso.getElefantes().get(i).getPeso());
                        // Hacemos un set para modificar su peso
                        caso.getElefantes().get(i).setPeso(num);
                    }
                    System.out.println("Lista de elefantes: \n"
                            + caso.getElefantes());
                    break;
                case "3":
                    columpiar(caso);
            }            
            
        } while (!respuesta.equals("4"));

    }

    public static String obtenerDato(CasoPrueba c) {
        String res = "";
        String texto = """
                       "Un elefante se balanceaba en la tela de una araña..."?
                       
                       1. Peso que soporta la tela
                       2. Lista de elefantes, con su nombre y peso. Si algún elefante tiene peso negativo, se considera peso positivo.
                       3. Nombres de los elefantes que se pudieron columpiar antes de que se rompiera la tela, suponiendo el orden de llegada el mismo que el que tiene el fichero. En caso de que no se pueda columpiar ninguno, se mostrará "Ninguno".
                       4. Salir
                       """;
        System.out.println(texto);
        return res;
    }

    public static void columpiar(CasoPrueba c) {
        int pesoTotal = 0;
        String resultado = "";
        for (int i = 0; i < c.getElefantes().size(); i++) {
            if (pesoTotal < c.getPeso()) {
                pesoTotal += c.getElefantes().get(i).getPeso();
                resultado += c.getElefantes().get(i).getNombre() + "\n";
            } else {
                resultado = "Ninguno";
            }
        }
        System.out.println(resultado);
    }

}
