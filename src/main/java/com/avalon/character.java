package com.avalon;
import java.util.List;
import java.util.stream.Collectors;

public abstract class character{

    private String name;

    private boolean voto(int cd){
        return cd >0;
    }

    public boolean liderar(List <Team> time){
        int a = time.lengh/2;
        return time.stream().filter(x -> voto(time.cd(x))).filter();
    }

    boolean questVote;
    private int characterIndex;
    String characterType;




}
