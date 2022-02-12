package com.avalon;
import com.avalon.Personagens;

import java.util.ArrayList;


public class Mordred implements Personagens {

    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Teste1");
    }

    @Override
    public boolean escolherInfluencia() {
        return false;
    }

}
