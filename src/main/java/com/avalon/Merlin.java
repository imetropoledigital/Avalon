package com.avalon;


import com.avalon.Personagens;

import java.util.ArrayList;


public class Merlin implements Personagens {

    /* @see conhecimento: Metodo que imprime as habilidades do personagem que a implementa
       @param Participantes do tipo ArrayList<Jogadores>
       @return não tem return
     */
    @Override
    public void conhecimento(ArrayList<Jogador> Participantes){
        System.out.println("Você é o Merlin");
        for(int i = 0; i < Participantes.size(); i++){
            Jogador I = Participantes.get(i);
            if(I.getClasse() == Classes.ASSASINO || I.getClasse() == Classes.MORGANA || I.getClasse() == Classes.OBERON){
                System.out.println("Jogador " +I.getnome()+ " de ID " + I.getId() + ".");
            }
        }
        System.out.println("eles são do mal.");
    }


}
