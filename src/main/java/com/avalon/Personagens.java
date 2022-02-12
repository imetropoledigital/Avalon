package com.avalon;

import java.util.ArrayList;

public interface Personagens {

    public void conhecimento(ArrayList<Jogador> Participantes);

    public default boolean escolherInfluencia(){
        System.out.println("Vocé é do bem, portanto ira aprovar a missão");
        return true;
    }

}
