package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    // Exercicio 1 - //Algoritimo
    // 1. int valor1 = informado pelo usuario;
    // 2. int vaor2 = informado pelo usuario;
    // 3. se (valor1>valor2) então {
    // valor1 é maior
    // 4.} caso contrario {
    // valor2 é maior
    // 5. imprima o maior valor

    public void exercicio1() {
        System.out.println("informe o primeiro valor");
        int valor1 = sc.nextInt();
        System.out.println("informe o segundo valor");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valor é" + valor1);
        } else {
            System.out.println("O maior valor é" + valor2);
        }
    }

    public void exercicio2() {
        System.out.println("informe o ano de nascimento");
        int anoNascimento = sc.nextInt();
        System.out.println("informe o ano atual");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNascimento;
        if (idade >= 16) {
            System.out.println("Você pode votar");
        }
        if (idade < 16) {
            System.out.println("Você pode votar");
        }
    }

    public void exercicio3() {
        System.out.print("Insira o código de acesso: ");
        codigo = entrada.nextInt();

        if (codigo == 1234) {
            System.out.print("Insira a senha de acesso: ");
            senha = entrada.nextInt();
            if (senha == 9999) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Código incorreto");
        }

    }

    public void exercicio4() {
        System.out.println("Informe a quantidade de maçãs");
        double quantiaMaca = sc.nextDouble();
        double valorMaca = 0.30;
        if (quantiaMaca <= 11) {
            valorMaca = 0.30;
        } else {
            valorMaca = 0.25;
        }
        double valorTotal = valorMaca * quantiaMaca;
        System.out.println("O valor total da compra é de R$" + valorTotal);
    }

    public void exercicio5() {
        System.out.println("Nesse exercicio você irá informar 3 numeros inteiros de 1 a 9 de cada vez.");
        System.out.println("Informe o primeiro número:");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Informe o segundo número:");
        double segundoNumero = sc.nextDouble();
        System.out.print("Informe o terceiro número:");
        double terceiroNumero = sc.nextDouble();

        if (primeiroNumero > segundoNumero && segundoNumero > terceiroNumero) {
            System.out.println(terceiroNumero + ", " + segundoNumero + ", " + primeiroNumero);
        } else if (primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero) {
            System.out.println(segundoNumero + ", " + terceiroNumero + ", " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && primeiroNumero > terceiroNumero) {
            System.out.println(terceiroNumero + ", " + primeiroNumero + ", " + segundoNumero);
        } else if (segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero) {
            System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
        } else if (terceiroNumero > primeiroNumero && primeiroNumero > segundoNumero) {
            System.out.println(segundoNumero + ", " + primeiroNumero + ", " + terceiroNumero);
        } else if (terceiroNumero > segundoNumero && segundoNumero > primeiroNumero) {
            System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
        }

    }

    public void exercicio06() {
        System.out.println("Informe sua altura em metros:");
        double altura = sc.nextDouble();
        System.out.print("Informe seu sexo, digitando (1) para feminino ou (2) masculino");
        double sexo = sc.nextDouble();
        String sexoWrite = "masculino";
        if (sexo == 1) {
            sexoWrite = "feminino";
        } else {
            sexoWrite = "masculino";
        }
        System.out.println("Você informou que sua altura é: " + altura + "m, e que você é do sexo: " + sexoWrite
                + ". Está correto? Informe com (1) para sim ou (2) para não: ");
        double correto = sc.nextDouble();
        double formulaHomens = (72.7 * altura) - 58;
        double formulaMulheres = (62.1 * altura) - 44.7;
        double formulaUsar = formulaHomens;
        if (sexo == 1) {
            formulaUsar = formulaMulheres;
        }
        if (sexo == 2) {
            formulaUsar = formulaHomens;
        }
        if (correto == 1) {
            System.out.println("Com base nas suas informações o seu peso ideal é: " + formulaUsar + "kg");
        } else {
            System.out.println("Comece o programa novamente");
        }
    }

    public void exercicio07() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno:");
        int nota2 = sc.nextInt();
        // double mediaAluno = (nota1 + nota2)/2;
        double mediaAluno = (nota1 + nota2) / 2;
        System.out.println("A media do Aluno é: " + mediaAluno);
        if (mediaAluno >= 50) {
            System.out.println("O Aluno Esta Aprovado por Nota, " + mediaAluno);
        } else
            System.out.println("O Aluno Esta Reprovado por Nota, " + mediaAluno);
        System.out.println("Informe a Frequencia do Aluno:");
        int frequenciaAluno = sc.nextInt();
        if (frequenciaAluno >= 75) {
            System.out.println("O Aluno Esta Aprovado por Frequência: " + frequenciaAluno);
        } else
            System.out.println("O Aluno esta Reprovado por Frequencia: " + frequenciaAluno);
        if (frequenciaAluno >= 75 && mediaAluno >= 50) {
            System.out.println("O Aluno esta Aprovado no Curso");
        } else
            System.out.println("O Aluno Esta Reprovado no Curso");
    
    }

    public void exercicio08() {
        System.out.println("Informe um número e eu informarei se é impar ou par: ");
        double numero = sc.nextDouble();
        double par = numero % 2;
        if (par == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }

}