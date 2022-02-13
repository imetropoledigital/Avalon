package com.avalon;
import com.avalon.Personagens;

import java.util.ArrayList;


public class Servo implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Você é um servo");
        System.out.println("e infelizmente você não sabe nada.");
    }



}
