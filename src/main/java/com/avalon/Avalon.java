package com.avalon;

import java.util.*;

/* @see Avalon: A classe Avalon comporta atributos e métodos fundamentais  */
public class Avalon {

    private static int Jogadores;
    private int VitoriasBem = 0;
    private int VitoriasMal = 0;
    private int indiceMissao = 0;
    private static int metade;
    public static ArrayList<Integer> Tamanhotime = new ArrayList<>();
    public static ArrayList<Jogador> Participantes = new ArrayList<>();
    public static ArrayList<Jogador> Escolhidos = new ArrayList<>();

    public Avalon(int Jogadores){
        Avalon.Jogadores = Jogadores;
        Integer[] role = new Integer[Jogadores];

        for (int i = 0; i < role.length; i++){
            role[i] = i;
        }
        Collections.shuffle(Arrays.asList(role));
        for(int j = 0; j < role.length; j++){
            Participantes.add(new Jogador(j, role[j]));
            Participantes.get(j).escolherNome();
        }

        switch (Jogadores){

            case 5:
                Tamanhotime.addAll(List.of(2,3,2,3,3));
                metade = 3;
                break;

            case 6:
                Tamanhotime.addAll(List.of(2,3,4,3,4));
                metade = 4;
                break;

            case 7:
                Tamanhotime.addAll(List.of(2,3,4,3,4));
                metade = 4;
                break;

            case 8:
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                metade = 5;
                break;

            case 9:
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                metade = 5;
                break;

            case 10:
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                metade = 6;
                break;

        }
    }

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
            System.out.println("Jogador " + i + " : ");
            Participantes.get(i).getConhecimento(Participantes);
        }

    }

    public void Jogar(){
        boolean Resultado;
        int indiceLider = 0;
        Jogador Lider;
        while (true){
            Resultado = true;
            Lider = Participantes.get(indiceLider);
            System.out.println("O lider " + Lider.getnome() + " de id " + Lider.getId() + " ira escolher o time.");
            escolhaTime();
            if(aprovarVotacao()){
                for(int i = 0; i < Escolhidos.size(); i++){
                    int auxiliar = Escolhidos.get(i).getId();
                    System.out.println("Jogador de id " + auxiliar + " ira escolher sua influecia.");
                    if(!Escolhidos.get(i).Votar()){
                        Resultado = false;
                    }
                }

                if(Resultado){
                    VitoriasBem++;
                    System.out.println("O bem venceu essa rodada!");
                }
                else{
                    VitoriasMal++;
                    System.out.println("O mal venceu essa rodada!");
                }

                indiceMissao++;
            }

            Escolhidos.clear();


            if(VitoriasBem == 3){
                System.out.println("O bem conseguiu 3 sucessos, mas ainda não acabou...");
                break;
            }

            if(VitoriasMal == 3){
                System.out.println("O mal conseguiu 3 fracassos!");
                System.out.println("O mal ganhou!");
                break;
            }

            indiceLider++;
            if(indiceLider == Participantes.size()){
                indiceLider = 0;
            }
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

            if (input >= 0 && input < Participantes.size() && !Escolhidos.contains(Participantes.get(input))){
                Escolhidos.add(Participantes.get(input));
                verificar++;
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

    public boolean aprovarVotacao(){
        int verificar = 0;
        for(int i = 0; i < Participantes.size(); i++){
            System.out.println("Jogador de ID " + i + " ira julgar a votação.");
            if(Participantes.get(i).aprovarVoto()){
                verificar++;
            }
        }

        if(verificar >= metade){
            return true;
        }
        return false;
    }


}

