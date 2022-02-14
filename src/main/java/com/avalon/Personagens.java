package com.avalon;

import java.util.ArrayList;

/* @see Personagens: Interface que cria alguns metodos fundamentais para a classe de jogadores do jogo
       @param não tem paramêtros
       @return sem return
     */
public interface Personagens {

    /* @see conhecimento: Metodo que imprime as habilidades do personagem que a implementa
       @param Participantes do tipo ArrayList<Jogadores>
       @return não tem return
     */
    public void conhecimento(ArrayList<Jogador> Participantes);

    /* @see escolherInfluencia: Imprime a equipe do jogador , no caso se é do bem ou do mal.
       @param não tem paramêtros
       @return não tem return
     */
    public default boolean escolherInfluencia(){
        System.out.println("Vocé é do bem, portanto ira aprovar a missão");
        return true;
    }

}
