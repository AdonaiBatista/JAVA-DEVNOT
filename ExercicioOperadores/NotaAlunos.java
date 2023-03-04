package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);

    public void NotaFrequencia() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno:");
        int nota2 = sc.nextInt();

        // double mediaAluno = (nota1+nota2)/2;
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("A média do aluno é" + mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluno está aprovado por Nota?" + mediaAprovado);
        System.out.println("Informe a frequencia do aluno");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovada = frequenciaAluno >= 75;
        System.out.println("O Aluno está aprovado por Frequencia?" + frequenciaAprovada);
        boolean aprovacaoFinal = (mediaAprovado == true) && (frequenciaAprovada == true);
        System.out.println("O aluno esta aprovado no curso?" + aprovacaoFinal);
    }

}
