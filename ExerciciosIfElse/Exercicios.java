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
    }
public void exercicio5() {
    
}