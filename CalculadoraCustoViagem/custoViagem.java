package CalculadoraCustoViagem;
/**
 * custoViagem
 */
public class custoViagem {

    public static void main(String[] args) {
        int distanciaPercorrida = 148;// em km
        double consumoTransporte = 10; // em km/l
        double precoCombustivel = 4.99; // em R$
        double quantidadeLitrosCombustivel = distanciaPercorrida/consumoTransporte;
        double custoTotal = quantidadeLitrosCombustivel*precoCombustivel;
        System.out.println("o custo total da viagem foi de;");
        System.out.println("R$"+custoTotal);
        
        
    }
}