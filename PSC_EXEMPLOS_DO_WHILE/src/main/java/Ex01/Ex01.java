/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa em Java que solicita ao usuário que 
        digite números inteiros positivos. O programa deve continuar 
        solicitando números até que o usuário digite um número negativo. 
        Ao final, o programa deve imprimir a quantidade de números positivos 
        digitados.*/
        Scanner input = new Scanner(System.in);
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo (ou um negativo para sair): ");
            numero = input.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);

        System.out.println("Quantidade de números positivos digitados: " + contador);

    }

}
