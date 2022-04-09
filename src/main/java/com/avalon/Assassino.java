package com.avalon;

import java.util.ArrayList;
import java.util.Scanner;

public class Assassino implements Personagens {

    /* @see conhecimento: Metodo que imprime as habilidades do personagem que a implementa
       @param Participantes do tipo ArrayList<Jogadores>
       @return não tem return
     */
    @Override
    public void conhecimento(ArrayList<Jogador> Participantes) {
        System.out.println("Você é o Assassino");
        for(int i = 0; i < Participantes.size(); i++){
            Jogador I = Participantes.get(i);
            if(I.getClasse() == Classes.MORGANA || I.getClasse() == Classes.MORDRED || I.getClasse() == Classes.OBERON){
                System.out.println("Jogador " +I.getnome()+ " de ID " + I.getId() + ".");
            }
        }
        System.out.println("eles são do seu time.");
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
