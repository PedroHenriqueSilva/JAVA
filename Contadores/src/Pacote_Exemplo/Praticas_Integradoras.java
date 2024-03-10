package Pacote_Exemplo;

public class Praticas_Integradoras {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, frequencia, total_notas;
        char status;
        boolean aprovado;
        String nome;

        nome = "Pedro Henrique";
        status = 'M';
        nota1 = 20;
        nota2 = 20;
        nota3 = 30;
        nota4 = 5;
        frequencia = 0.80;
        total_notas = nota1+nota2+nota3+nota4;

        aprovado = total_notas >= 70 && frequencia >= 0.75;

        System.out.printf("O aluno %s obteve nota final %.2f e frequencia %.2f%% e a situacao do aluno e %c.\n Aluno Aprovado? %b"
        , nome,total_notas,frequencia*100,status,aprovado);

    }
}
