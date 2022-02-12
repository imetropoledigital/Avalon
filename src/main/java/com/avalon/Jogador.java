package com.avalon;
import java.util.List;
import java.util.stream.Collectors;


public class Jogador extends Personagem {


public class Jogador {

    //private String name;
    private int id;
    private Personagens Classe;

    public Jogador(int id,int Classe){
        this.id = id;

        /*if(Classe == 1){
            this.Classe = new Merlin();
        }
        else if(Classe == 2){
            this.Classe = new Percival();
        }
        else if(Classe == 3){
            this.Classe = new Assasino();
        }
        else if(Classe == 4){
            this.Classe = new Morgana();
        }
        else if(Classe == 7){
            this.Classe = new Mordred();
        }
        else if(Classe == 10){
            this.Classe = new Oberon();
        }
        else{
            this.Classe = new Servo();
        }*/

    }


    public int getId(){ return id;}

    public void getConhecimento(){
        Classe.conhecimento();
    }

    //public void setname(String b){ name = b;}

    //public String getname(){ return name;}



}
