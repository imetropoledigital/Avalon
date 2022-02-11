package com.avalon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avalon {

    public static int Jogadores;
    public static int JogadoresBens;
    public static int JogadoresMaus;
    private boolean Resultado;

    private int Lider;
    public static ArrayList<Boolean> Votacoes = new ArrayList<>();
    public static ArrayList<Integer> Tamanhotime = new ArrayList<>();

    public static int Comecar(){

        Scanner scanner = new Scanner(System.in);

        while (true){

            int input = 0;
            System.out.println("Quantos jogadores vão participar do jogo?");

            try {
                input = scanner.nextInt();
            }
            catch (Exception e){

            }

            if (input >= 5 && input <= 10){
                return input;
            }

            else {
                System.out.println("Valor invalido");
            }

            scanner.nextLine();

        }
    }

    public Avalon(int Jogadores){
        this.Jogadores = Jogadores;
        switch (Jogadores){

            case 5:
                JogadoresBens = 3;
                JogadoresMaus = 2;
                Tamanhotime.addAll(List.of(2,3,2,3,3));
                break;

            case 6:
                JogadoresBens = 4;
                JogadoresMaus = 2;
                break;

            case 7:
                JogadoresBens = 4;
                JogadoresMaus = 3;
                break;

            case 8:
                JogadoresBens = 5;
                JogadoresMaus = 3;
                break;

            case 9:
                JogadoresBens = 6;
                JogadoresMaus = 3;
                break;

            case 10:
                JogadoresBens = 6;
                JogadoresMaus = 4;
                break;

        }
    }

    public void teste(){
        System.out.println(Jogadores);
        System.out.println(JogadoresBens);
        System.out.println(JogadoresMaus);
    }

}

