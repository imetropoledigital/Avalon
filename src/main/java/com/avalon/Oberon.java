package com.avalon;


import com.avalon.Personagens;

import java.util.ArrayList;
import java.util.Scanner;


public class Oberon implements Personagens {

    /* @see conhecimento: Metodo que imprime as habilidades do personagem que a implementa
       @param Participantes do tipo ArrayList<Jogadores>
       @return não tem return
     */
    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Você é o Oberon");
        System.out.println("e você não conhece quem é do seu time.");
    }

    /* @see escolherInfluencia: Imprime a equipe do jogador , no caso se é do bem ou do mal e sua decisão na votação.
       @param não tem paramêtros
       @return não tem return
     */
    @Override
    public boolean escolherInfluencia() {
        Scanner scanner4 = new Scanner(System.in);
        while (true){
            int input = 0;
            System.out.println("Digite 1 para colaborar com a missão ou 2 para sabotar a missão.");

            try {
                input = scanner4.nextInt();
            }
            catch (Exception e){

            }
            if (input == 1){
                return true;
            }
            else if (input == 2){
                return false;
            }
            else{ System.out.println("Comando Invalido");}

            scanner4.nextLine();
        }


    }

}
