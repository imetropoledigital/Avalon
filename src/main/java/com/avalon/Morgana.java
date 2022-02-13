package com.avalon;


import com.avalon.Personagens;

import java.util.ArrayList;
import java.util.Scanner;


public class Morgana implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Você é a Morgana");
        for(int i = 0; i < Participantes.size(); i++){
            Jogador I = Participantes.get(i);
            if(I.getClasse() == Classes.ASSASINO || I.getClasse() == Classes.MORDRED || I.getClasse() == Classes.OBERON){
                System.out.println("Jogador " +I.getnome()+ " de ID " + I.getId() + ".");
            }
        }
        System.out.println("eles são do seu time.");
    }

    @Override
    public boolean escolherInfluencia() {
        Scanner scanner4 = new Scanner(System.in);
        while (true){
            int input = 0;
            System.out.println("Digite 1 para colaborar com a missão ou 2 para sabotar a missão.");

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

}