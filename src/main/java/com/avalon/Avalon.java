package com.avalon;

import java.util.*;

public class Avalon {

    private static int Jogadores;
    private static int JogadoresBens;
    private static int JogadoresMaus;
    private static int VitoriasBem = 0;
    private static int VitoriasMal = 0;
    private int indiceLider = 0;
    private Jogador Lider;
    private boolean Resultado;
    private int indiceMissao = 0;
    public static ArrayList<Integer> Tamanhotime = new ArrayList<>();
    public static ArrayList<Jogador> Participantes = new ArrayList<>();
    public static ArrayList<Jogador> Escolhidos = new ArrayList<>();

    public static int Configurar(){

        Scanner scanner2 = new Scanner(System.in);

        while (true){

            int input = 0;
            System.out.println("Quantos jogadores vão participar do jogo?");

            try {
                input = scanner2.nextInt();
            }
            catch (Exception e){

            }

            if (input >= 5 && input <= 10){
                return input;
            }

            else {
                System.out.println("Valor invalido");
            }

            scanner2.nextLine();

        }
    }

    public void Preparacao(){
        for(int i = 0; i < Participantes.size(); i++){
            Participantes.get(i).Exodia(Participantes);
        }
    }

    public void Jogar(){
        while (true){
            Resultado = true;
            Lider = Participantes.get(indiceLider);
            escolhaTime();
            for(int i = 0; i < Escolhidos.size(); i++){
                if(Escolhidos.get(i).Votar() == false){
                    Resultado = false;
                }
            }

            Escolhidos.clear();

            if(Resultado == true){
                VitoriasBem++;
                System.out.println("O bem venceu essa rodada!");
            }
            else{
                VitoriasMal++;
                System.out.println("O mal venceu essa rodada!");
            }

            if(VitoriasBem == 3){
                System.out.println("O conseguiu 3 sucessos, mas ainda não acabou...");
                break;
            }

            if(VitoriasMal == 3){
                System.out.println("O mal ganhou!");
                break;
            }

            indiceLider++;
            indiceMissao++;
        }
    }

    public void escolhaTime(){
        Scanner scanner3 = new Scanner(System.in);
        int verificar = 0;
        while (true){
            int input = -1;
            System.out.println("Digite o indice dos jogadores que irão participar da missão:");

            try {
                input = scanner3.nextInt();
            }
            catch (Exception e){

            }

            if (input >= 0 && input < Participantes.size()){
                Escolhidos.add(Participantes.get(input));
                verificar++;
                System.out.println("Passou!");
            }

            else {
                System.out.println("Valor invalido");
            }


            if(verificar == Tamanhotime.get(indiceMissao)){
                break;
            }

            scanner3.nextLine();
        }
    }

    public Avalon(int Jogadores){
        this.Jogadores = Jogadores;
        Integer[] role = new Integer[Jogadores];

        for (int i = 0; i < role.length; i++){
            role[i] = i;
        }
        Collections.shuffle(Arrays.asList(role));
        for(int j = 0; j < role.length; j++){
            Participantes.add(new Jogador(j, role[j]));
        }

        switch (Jogadores){

            case 5:
                JogadoresBens = 3;
                JogadoresMaus = 2;
                Tamanhotime.addAll(List.of(2,3,2,3,3));
                break;

            case 6:
                JogadoresBens = 4;
                JogadoresMaus = 2;
                Tamanhotime.addAll(List.of(2,3,4,3,4));
                break;

            case 7:
                JogadoresBens = 4;
                JogadoresMaus = 3;
                Tamanhotime.addAll(List.of(2,3,4,3,4));
                break;

            case 8:
                JogadoresBens = 5;
                JogadoresMaus = 3;
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                break;

            case 9:
                JogadoresBens = 6;
                JogadoresMaus = 3;
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                break;

            case 10:
                JogadoresBens = 6;
                JogadoresMaus = 4;
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                break;

        }
    }

    public void teste(){
        System.out.println(Jogadores);
        System.out.println(JogadoresBens);
        System.out.println(JogadoresMaus);
    }

}

