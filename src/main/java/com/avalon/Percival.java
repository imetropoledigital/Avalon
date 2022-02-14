package com.avalon;


import com.avalon.Personagens;

import java.util.ArrayList;


public class Percival implements Personagens {

    /* @see conhecimento: Metodo que imprime as habilidades do personagem que a implementa
       @param Participantes do tipo ArrayList<Jogadores>
       @return não tem return
     */
    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Você é o Percival");
        for(int i = 0; i < Participantes.size(); i++){
            Jogador I = Participantes.get(i);
            if(I.getClasse() == Classes.MERLIM || I.getClasse() == Classes.MORGANA){
                System.out.println("Jogador " +I.getnome()+ " de ID " + I.getId() + ".");
            }
        }
        System.out.println("Um deles é o Merlin, o outro é a Morgana.");
    }



}
