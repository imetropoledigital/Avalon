package com.avalon;

import java.util.ArrayList;

public class Assassino implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Teste5");
    }

    @Override
    public boolean escolherInfluencia() {
        return false;
    }

}
