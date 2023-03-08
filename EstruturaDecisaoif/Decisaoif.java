package EstruturaDecisaoif;

import java.util.Scanner;

public class Decisaoif {
    Scanner sc = new Scanner(System.in);
    // Decisão IF

    public void calcularDescontoif() {
        System.out.println("Informe o valor do Produto:");

        double precoProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;

        if (precoProduto >= 200 && precoProduto<300) {
        percentualDesconto = 10.0;
        }

        if (precoProduto >= 100 && precoProduto < 200) {
        percentualDesconto = 5.0;
        }

        if (precoProduto >= 300) {
        percentualDesconto = 15.0;
        }
        // outra forma de fazer:
        //if (precoProduto >= 100) { // Estrutura de desisão if
            // Desconto para produtos de alto valor.
           // percentualDesconto = 5.0;
        
        //if (precoProduto >= 200) {
            //percentualDesconto = 10.0;
        
        //if (precoProduto >= 300) {
            //percentualDesconto = 15.0;
        
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");

    }

    // Decião IF encadeada
    public void DecisaoifElse() {
        System.out.println("Informe o valor do produto:");
        double precoProduto = sc.nextDouble();
        double percentualDesconto= 0.0;
        // Estrutura de decisçao encadeada
        if (precoProduto > 100) {
            percentualDesconto = 0.0;
            }
        else if (precoProduto >= 100 && precoProduto < 200) {
            percentualDesconto = 5.0;
        }
         else if(precoProduto>=200 && precoProduto < 300){
            percentualDesconto=10.0;
        }
        else {
            percentualDesconto = 15.0;

        }
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");
    }
}