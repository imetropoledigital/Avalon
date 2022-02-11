package com.avalon;

public class Jogar{

    private int Wait,Playing,Exit;
    private int Rounds;
    private int ScoreBoard;

    public Jogar(int Wait, int Playing,int Exit, int Rounds, int ScoreBoard){
        this.Wait = Wait;
        this.Playing = Playing;
        this.Exit = Exit;
        this.Rounds = Rounds;
        this.ScoreBoard = ScoreBoard;
    }

    public void setRounds(int a){
        Rounds = a;
    }

    public void setScoreBoard(int b){
        ScoreBoard = b;
    }

    public int getRounds(){
        return Rounds;
    }

    public int getScoreBoard(){
        return ScoreBoard;
    }




}