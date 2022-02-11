package com.avalon;

import java.util.ArrayList;
import java.util.Scanner;

public class Avalon {

    public static int Jogadores;
    public static int JogadoresBens;
    public static int JogadoresMaus;
    private boolean Resultado;
    private int Lider;
    public static ArrayList<Boolean> Votacoes = new ArrayList<Boolean>();

    public void Comecar(){
        System.out.println("Quantos jogadores vão participar do jogo?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Jogadores = input;



    }

}

