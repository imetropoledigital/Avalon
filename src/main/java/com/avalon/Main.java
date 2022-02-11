package com.avalon;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int input = 0;

            try {
                input = scanner.nextInt();
            }
            catch (Exception e){

            }

            if(input == 1){
                System.out.println("Jogar");
                Avalon avalon = new Avalon();
                avalon.Comecar();
            }

            else if (input == 2){
                System.out.println("Regras");
            }

            else if (input == 3){
                System.out.println("Sair");
                break;
            }

            else {
                System.out.println("Comando não conhecido");
            }

            scanner.nextLine();
        }

    }

}
