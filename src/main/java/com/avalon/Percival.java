package com.avalon;


import com.avalon.Personagens;

import java.util.ArrayList;


public class Percival implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        for(int i = 0; i < Participantes.size(); i++){
            Jogador I = Participantes.get(i);
            if(I.getClasse() == Classes.MERLIM || I.getClasse() == Classes.MORGANA){
                System.out.println("Jogador " + I.getId() + ".");
            }
        }
        System.out.println("Um deles é o Merlin, o outro é a Morgana.");
    }

    @Override
    public void escolherInfluencia() {

    }

}
