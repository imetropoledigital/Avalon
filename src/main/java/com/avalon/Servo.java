package com.avalon;
import com.avalon.Personagens;

import java.util.ArrayList;


public class Servo implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Infelizmente você não sabe nada.");
    }

    @Override
    public void escolherInfluencia() {

    }

}
