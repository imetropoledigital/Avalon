package com.avalon;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int input = 0;
            printMenu("Jogar", "Regras","Sair");

            try {
                input = scanner.nextInt();
            }
            catch (Exception e){

            }

            if(input == 1){
                System.out.println("Jogar");
                Avalon avalon = new Avalon(Avalon.Configurar());
                avalon.Preparacao();
                avalon.Jogar();
                break;
            }

            else if (input == 2){
                System.out.println("Avalon é jogado entre 5 e 10 pessoas. E diferente de muitos jogos em que mesa cheia é sinal de jogo lento, aqui, quanto mais melhor! O grande Rei Arthur precisa consolidar seu reino e para isso, enviará seus bravos guerreiros em missões pela Bretanha. Infelizmente, o mal conseguiu se infiltrar nas fileiras de guerreiros de Arthur e os fiéis asseclas de Mordred farão todo o possível para sabotar essas missões e derrubarem o reino.\n" +
                        "Em cada partida, serão sorteados entre os jogadores personagens fiéis a Arthur e os obedientes a Mordred, que estarão em menor número, mas terão a vantagem de se conhecerem mutuamente, sendo desconhecidos dos demais guerreiros. Esses personagens podem ser comuns ou ter alguma habilidade especial. Falarei disso mais abaixo. Cada jogador terá duas opções de voto, uma de Aprovação e outra de Recusa.\n" +
                        "Uma vez memorizados os papeis, o jogo já pode começar. Um  jogador será nomeado como lider , que representa o líder naquela rodada, responsável por enviar a equipe..\n" +
                        "O papel do narrador é dar a abertura e completar a fase de reconhecimento, conforme os personagens que estão em jogo. Em uma partida só com Merlin e o Assassino, ele deverá pedir que todos fechem os seus olhos e que coloquem suas mãos em punho fechado, sobre a mesa. Então ele pedirá que abram os olhos e se reconheçam somente os mínions de Mordred. Depois estes fecharão os olhos e somente Merlin abrirá os olhos. O narrador pede então que os mínions de Mordred levantem o polegar para que Merlin os conheça. Terminada essa parte, todos abrem os olhos e a 'guerra' começa.\n");
            }

            else if (input == 3){
                System.out.println("Sair");
                break;
            }

            else {
                System.out.println("Comando não conhecido");
            }

            scanner.nextLine();
        }

    }

    public static void printMenu(String... args) {
        int i = 1;
        for (String s : args) {
            System.out.println("[" + i + "] " + s);
            i++;
        }
        System.out.print("Opção: ");
    }

}
