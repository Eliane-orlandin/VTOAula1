package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {
        int i;
        // int i; váriavel nao pode ter o mesmo nome
        int I; // case sensitive
        //int 1a; // váriavel não pode começar com número
        int _1a; // não é uma boa prática começar uma váraivel com _
        int $aq; // não é uma boa prática começar uma váraivel com $

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //variavel constante, sempre será este número
        //j = 15; não tem como alterar a váriavel final int
        int asrn24678md; //não usual, mas é válida
        //int asrn246 78md; não pode ter espaço
        int asrn2$4678_md = 10; //não usual, mas é válida
        //int asrn2$46%78_md = 10; caracteres especias não pode ser usado.

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; começar a váriavel com maiuscula, não da erro, mas não é uma boa prática
        final int NUMERO_TENTATIVAS = 5; //váriavel constante "final" Todas letras em maiusculo e separados por _
        //final int numeroTentativas = 5; não é uma boa prática
        int QUANTIDADE_OPCOES = 25;// Não está seguindo boa prática
        //int qtdProd; // não é uma váriavel expresiva

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
