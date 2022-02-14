package com.avalon;

import java.util.*;

/* @see Avalon: A classe Avalon comporta atributos e métodos fundamentais para o desenvolvimento do programa */
public class Avalon {

    private static int Jogadores;
    private int VitoriasBem = 0;
    private int VitoriasMal = 0;
    private int indiceMissao = 0;
    private static int metade;
    public static ArrayList<Integer> Tamanhotime = new ArrayList<>();
    public static ArrayList<Jogador> Participantes = new ArrayList<>();
    public static ArrayList<Jogador> Escolhidos = new ArrayList<>();

    /* @see Avalon: Construtador default da classe.
       @param Int Jogadores , número de jogadores necessário para configurar o jogo
       @return não tem return.
     */
    public Avalon(int Jogadores){
        Avalon.Jogadores = Jogadores;
        Integer[] role = new Integer[Jogadores];

        for (int i = 0; i < role.length; i++){
            role[i] = i;
        }
        Collections.shuffle(Arrays.asList(role));
        for(int j = 0; j < role.length; j++){
            Participantes.add(new Jogador(j, role[j]));
            Participantes.get(j).escolherNome();
        }

        switch (Jogadores){

            case 5:
                Tamanhotime.addAll(List.of(2,3,2,3,3));
                metade = 3;
                break;

            case 6:
                Tamanhotime.addAll(List.of(2,3,4,3,4));
                metade = 4;
                break;

            case 7:
                Tamanhotime.addAll(List.of(2,3,4,3,4));
                metade = 4;
                break;

            case 8:
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                metade = 5;
                break;

            case 9:
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                metade = 5;
                break;

            case 10:
                Tamanhotime.addAll(List.of(3,4,4,5,5));
                metade = 6;
                break;

        }
    }
    /* @see Configurar: Método que como o nome diz configura e recebe os inputs iniciais do jogo.
       @param não tem paramêtros
       @return input do tipo int que refere-se ao número de jogadores.
     */
    public static int Configurar(){

        Scanner scanner2 = new Scanner(System.in);

        while (true){

            int input = 0;
            System.out.println("Quantos jogadores vão participar do jogo?");

            try {
                input = scanner2.nextInt();
            }
            catch (Exception e){

            }

            if (input >= 5 && input <= 10){
                return input;
            }

            else {
                System.out.println("Valor invalido");
            }

            scanner2.nextLine();

        }
    }

    /* @see Preparação: Método que faz desenvolve a narrativa/construção do jogo e imprime informações necessárias para dar continuidade ao programa .
       @param não tem paramêtros
       @return não tem return.
     */
    public void Preparacao(){
        for(int i = 0; i < Participantes.size(); i++){
            System.out.println("Jogador " + i + " : ");
            Participantes.get(i).getConhecimento(Participantes);
        }

    }

    /* @see Jogar: Método onde começa a parte das missões do jogo, no qual utilizando um loop fazemos alguns prints na tela dando certas informações enquanto realizamos a chamada de funções complementares que pedem por alguns inputs para dar sequência.
       @param não tem paramêtros
       @return não tem return.
     */
    public void Jogar(){
        boolean Resultado;
        int indiceLider = 0;
        Jogador Lider;
        while (true){
            Resultado = true;
            Lider = Participantes.get(indiceLider);
            System.out.println("O lider " + Lider.getnome() + " de id " + Lider.getId() + " ira escolher o time.");
            escolhaTime();
            if(aprovarVotacao()){
                for(int i = 0; i < Escolhidos.size(); i++){
                    int auxiliar = Escolhidos.get(i).getId();
                    System.out.println("Jogador de id " + auxiliar + " ira escolher sua influecia.");
                    if(!Escolhidos.get(i).Votar()){
                        Resultado = false;
                    }
                }

                if(Resultado){
                    VitoriasBem++;
                    System.out.println("O bem venceu essa rodada!");
                }
                else{
                    VitoriasMal++;
                    System.out.println("O mal venceu essa rodada!");
                }

                indiceMissao++;
            }

            Escolhidos.clear();


            if(VitoriasBem == 3){
                System.out.println("O bem conseguiu 3 sucessos, mas ainda não acabou...");
                if (Assasinar(escolherAlvo())){
                    System.out.println("O Assasino matou o Merlin, o mal venceu!");
                    break;
                }
                System.out.println("O Merlin vive, o bem ganhou!");
                break;
            }

            if(VitoriasMal == 3){
                System.out.println("O mal conseguiu 3 fracassos!");
                System.out.println("O mal ganhou!");
                break;
            }

            indiceLider++;
            if(indiceLider == Participantes.size()){
                indiceLider = 0;
            }
        }
    }

    /* @see escolhaTime: Método onde o jogador definido como lider da rodada passa o indice dos jogadores que vão para a missão, é efeita a checagem destes indices por alguns requisitos e depois é adicionado no array escolhidos os jogadores selecionados..
       @param não tem paramêtros
       @return naõ tem return.
     */
    public void escolhaTime(){
        Scanner scanner3 = new Scanner(System.in);
        int verificar = 0;
        while (true){
            int input = -1;
            System.out.println("Digite o indice dos jogadores que irão participar da missão:");

            try {
                input = scanner3.nextInt();
            }
            catch (Exception e){

            }

            if (input >= 0 && input < Participantes.size() && !Escolhidos.contains(Participantes.get(input))){
                Escolhidos.add(Participantes.get(input));
                verificar++;
            }

            else {
                System.out.println("Valor invalido");
            }


            if(verificar == Tamanhotime.get(indiceMissao)){
                break;
            }

            scanner3.nextLine();
        }
    }

    /* @see AprovarVotacao: Método que faz um loop onde após a impressão de algumas informações é feita uma checagem na votação.
       @param não tem paramêtros
       @return boolean se a maioria votar 1 é sucesso/true, caso contrário é falha/false.
     */
    public boolean aprovarVotacao(){
        int verificar = 0;
        for(int i = 0; i < Participantes.size(); i++){
            System.out.println("Jogador de ID " + i + " ira julgar a votação.");
            if(Participantes.get(i).aprovarVoto()){
                verificar++;
            }
        }

        if(verificar >= metade){
            return true;
        }
        return false;
    }

    /* @see escolherAlvo: Método que o jogador da classe assassino usa, no qual é feita uma checagem se o indice do jogador passado é valido.
       @param não tem paramêtros
       @return input do tipo int .
     */
    public int escolherAlvo(){
        Scanner scanner4 = new Scanner(System.in);
        while (true){
            int input = -1;
            System.out.println("Digite o indice do jogador sera assasinado: ");

            try {
                input = scanner4.nextInt();
            }
            catch (Exception e){

            }
            if(input >= 0 && input < Participantes.size()){
                return input;
            }
            else{ System.out.println("Comando Invalido");}

            scanner4.nextLine();
        }
    }

    /* @see Assassinar: Método que checa se o indice passado é igual ao indice do jogador com a classe Merlin.
       @param indice do tipo int
       @return boolean, retorna true se o indice passado for igual ao indice do jogador com a classe Merlin, caso contrario retorna false.
     */
    public boolean Assasinar(int indice){
        if(Avalon.Participantes.get(indice).getClasse() == Classes.MERLIM){
            return true;
        }
        return false;
    }

}

