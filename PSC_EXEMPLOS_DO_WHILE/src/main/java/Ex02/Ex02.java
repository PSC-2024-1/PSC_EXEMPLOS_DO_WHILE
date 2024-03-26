/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    public static void main(String[] args) {
        /*Escreva um programa em Java para exibir um menu. 
        O menu tem que ser exibido pelo
        menos uma vez e sair com a opção 0.*/
        boolean continuar = true;
        int opcao;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imprimir mensagem surpresa 1: ");
            System.out.println("2. Imprimir mensagem surpresa 2: ");
            System.out.println("0. Sair");

            System.out.print("\nInsira sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Opção 1 escolhida!");
                    break;

                case 2:
                    System.out.println("Opção 2 escolhida!");
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Programa finalizado.");
            }
       
        } while (continuar);
    }
}
