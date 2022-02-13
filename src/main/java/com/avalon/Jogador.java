package com.avalon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Jogador {

    //private String name;
    private int id;
    private Personagens Classe;
    private Classes Carta;

    public Jogador(int id,int Classe){
        this.id = id;

        if(Classe == 0){
            this.Classe = new Merlin();
            this.Carta = Classes.MERLIM;
        }
        else if(Classe == 1){
            this.Classe = new Percival();
            this.Carta = Classes.PERCIVAL;
        }
        else if(Classe == 2){
            this.Classe = new Assassino();
            this.Carta = Classes.ASSASINO;
        }
        else if(Classe == 3){
            this.Classe = new Morgana();
            this.Carta = Classes.MORGANA;
        }
        else if(Classe == 6){
            this.Classe = new Mordred();
            this.Carta = Classes.MORDRED;
        }
        else if(Classe == 9){
            this.Classe = new Oberon();
            this.Carta = Classes.OBERON;
        }
        else{
            this.Classe = new Servo();
            this.Carta = Classes.SERVO;
        }

    }

    public int getId(){ return id;}

    public Classes getClasse(){ return Carta;}

    public void Exodia(ArrayList<Jogador> Participantes){
        Classe.conhecimento(Participantes);
    }

    public boolean Votar(){
        return Classe.escolherInfluencia();
    }

    public boolean aprovarVoto(){
        Scanner scanner4 = new Scanner(System.in);
        while (true){
            int input = 0;
            System.out.println("Digite 1 aprovar e 2 para rejeitar a votação.");

            try {
                input = scanner4.nextInt();
            }
            catch (Exception e){

            }
            if (input == 1){
                return true;
            }
            else if (input == 2){
                return false;
            }
            else{ System.out.println("Comando Invalido");}

            scanner4.nextLine();
        }
    }


    //public void setname(String b){ name = b;}

    //public String getname(){ return name;}


}
