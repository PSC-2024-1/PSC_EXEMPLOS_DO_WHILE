/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Utilize a instrução switch e o laço/loop do-while para implementar
        uma questão de múltipla escolha referente a alguma das outras disciplinas 
        que você está cursando neste semestre. Primeiro deverá ser apresentado o 
        enunciado da questão com as 5 opções/alternativas de resposta, que são 
        (a), (b), (c), (d) e (e). Depois que o usuário escolher uma opção, 
        se for a resposta correta deverá ser impresso “Resposta correta”, 
        caso contrário “Resposta incorreta”. No caso de “Resposta incorreta” a 
        questão deve ser apresentada novamente para outra tentativa. Deve ser 
        permitido no máximo 3 tentativas, quando a resposta correta for escolhida 
        deve ser informado em qual tentativa isso ocorreu, caso isso não ocorra 
        em nenhuma das 3 tentativas deve ser impresso 
        “Resposta incorreta nas 3 tentativas”.*/
        Scanner input = new Scanner(System.in);
        String resposta;
        int tentativa = 0;
        boolean acertou = false;

        do {
            System.out.println("Qual é o principal produto da fotossíntese?");
            System.out.println("(a) Oxigênio");
            System.out.println("(b) Dióxido de carbono");
            System.out.println("(c) Glicose");
            System.out.println("(d) Água");
            System.out.println("(e) Nitrogênio");
            System.out.print("Escolha uma opção (a, b, c, d, e): ");
            resposta = input.nextLine();
            tentativa++;

            switch (resposta) {
                case "c":
                    System.out.println("Resposta correta!");
                    acertou = true;
                    break;
                case "a":
                case "b":
                case "d":
                case "e":
                    System.out.println("Resposta incorreta.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    tentativa--; // Não conta como tentativa se a opção for inválida
                    break;
            }

            if (acertou) {
                System.out.println("Você acertou na " + tentativa +"ª tentativa.");
                break;
            } else if (tentativa < 3) {
                System.out.println("Tente novamente.");
            }

        } while (tentativa < 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }
    }

}
