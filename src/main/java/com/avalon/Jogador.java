package com.avalon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* @see Jogador: Classe com atributos importantes para os jogadores
       @param não tem paramêtro
       @return não tem return.
     */
public class Jogador {

    private String nome;
    private int id;
    private Personagens Classe;
    private Classes Carta;
    private ArrayList<String> listajogadores;

    /* @see Jogador: Construtor default da classe Jogador
       @param id do tipo int é o id do jogador, Classe int é a representação da classe do jogador usando do Enum classes
       @return não tem return
     */
    public Jogador(int id,int Classe){
        this.id = id;

        if(Classe == 0){
            this.Classe = new Merlin();
            this.Carta = Classes.MERLIM;
        }
        else if(Classe == 1){
            this.Classe = new Percival();
            this.Carta = Classes.PERCIVAL;
        }
        else if(Classe == 2){
            this.Classe = new Assassino();
            this.Carta = Classes.ASSASINO;
        }
        else if(Classe == 3){
            this.Classe = new Morgana();
            this.Carta = Classes.MORGANA;
        }
        else if(Classe == 6){
            this.Classe = new Mordred();
            this.Carta = Classes.MORDRED;
        }
        else if(Classe == 9){
            this.Classe = new Oberon();
            this.Carta = Classes.OBERON;
        }
        else{
            this.Classe = new Servo();
            this.Carta = Classes.SERVO;
        }

    }

    /* @see getID: Retorna o id do jogador
       @param não tem paramêtro.
       @return id do tipo int.
     */
    public int getId(){ return id;}

    /* @see getClasse: Retorna a carta um atributo do jogador.
       @param não tem paramêtros
       @return Carta do tipo Classes.
     */
    public Classes getClasse(){ return Carta;}

    /* @see getConhecimento: Chama o metodo conhecimento implementado pelas outras classes.
       @param Participantes do tipo ArrayList<Jogador> um array com os jogadores.
       @return sem return
     */
    public void getConhecimento(ArrayList<Jogador> Participantes){
        Classe.conhecimento(Participantes);
    }

    /* @see Votar: Retorna o metodo escolherInfluencia implementado pelas outra classes
       @param não tem paramêtros
       @return boolean retorna outra função.
     */
    public boolean Votar(){
        return Classe.escolherInfluencia();
    }

    /* @see AprovarVoto: Faz a checagem dos votos, recebendo um input e tratando os erros.
       @param não tem paramêtros
       @return boolean se o input for 1 é sucesso/true, se for 2 é falha/false e caso contrario é comando invalido.
     */
    public boolean aprovarVoto(){
        Scanner scanner4 = new Scanner(System.in);
        while (true){
            int input = 0;
            System.out.println("Digite 1 aprovar e 2 para rejeitar a votação.");

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

    /* @see testnome: testa o nome dos participantes
       @param String input nome dos jogadores
       @return boolean true se tem participante com nome igual , caso contrario false.
     */
    public boolean testnome(String input){
        return Avalon.Participantes.stream().map(x -> x.getnome().compareTo(input) == 0).noneMatch(x -> !x);
    }

    /* @see escolherNome: Seta o nome dos jogadores utilizando certos requisitos e tratando os erros.
       @param não tem paramêtros
       @return sem return.
     */
    public void escolherNome(){
        Scanner scanner6 = new Scanner(System.in);
        while (true){
            String input = "Padrão";
            System.out.println("Escolha seu nome:");

            try {
                input = scanner6.next();
            }
            catch (Exception e){

            }
            if (input.length() < 10 && input.length() > 3 && !input.equals("Padrão")){
               nome = input;
               System.out.println("Nome aprovado.");
               return;
            }

            else{ System.out.println("Nome invalido.");}

            scanner6.nextLine();
        }
    }

    /* @see getnome: Retorna o nome do jogador
       @param não tem paramêtros
       @return nome do tipo String.
     */
    public String getnome(){ return nome;}


}
