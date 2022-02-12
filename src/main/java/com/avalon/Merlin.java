package com.avalon;


import com.avalon.Personagens;

import java.util.ArrayList;


public class Merlin implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes){
        for(int i = 0; i < Participantes.size(); i++){
            Jogador I = Participantes.get(i);
            if(I.getClasse() == Classes.ASSASINO || I.getClasse() == Classes.MORGANA || I.getClasse() == Classes.OBERON){
                System.out.println("Jogador " + I.getId() + ".");
            }
        }
        System.out.println("eles são do mal.");
    }


}
