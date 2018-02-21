import java.util.Scanner;
public class ProgramaTesteFicha1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ficha1 f = new Ficha1();
        //EXERCICIO 1
        System.out.println("Introduza a temperatura em C");
        double tc = sc.nextDouble();
        double tf = f.celsiusParaFarenheit(tc);
        System.out.println(tc + " graus em farenheit dá: " + tf + "!!");
        
        //EXERCICIO 2
        System.out.println("Introduz dois numeros para ver qual é o maior");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int maior = f.maximoNumeros(n1, n2);
        System.out.println("Entre "+ n1 + " e "+n2+", o maior numero é: "+maior);
        
        //EXERCICIO 3
        System.out.println("Introduz um nome:");
        String pessoa = sc.next();
        System.out.println("Introduz o teu saldo:");
        int saldo = sc.nextInt();
        String saldodapessoa = f.criaDescricaoConta(pessoa, saldo);
        System.out.println(saldodapessoa);
        
        //EXERCICIO 4
        System.out.println("Introduz valor em euros para converter para libra");
        double valor = sc.nextDouble();
        System.out.println("Introduz uma taxa de conversao para libra (a actual é 0.89)");
        double taxaConversao = sc.nextDouble();
        double libra = f.eurosParaLibras(valor, taxaConversao);
        System.out.println(valor+" em libras usando a taxa de "+taxaConversao+" é: "+libra);
        
        //EXERCICIO 5
        System.out.println("Introduz dois numeros, vao ser apresentados em ordem decrescente e tambem a media deles");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println(Math.max(n1, n2)+" "+Math.min(n1, n2)+" Media: "+((n1+n2)/2));
        
        //EXERCICIO 6
        System.out.println("Introduz um numero para calcular o fatorial:");
        n1 = sc.nextInt();
        long fact = f.factorial(n1);
        System.out.println("Factorial de "+n1+" é "+fact);
        
        //EXERCICIO 7
        long tempo = f.tempoGasto();
        System.out.println("Tempo gasto para calcular o factorial de 5000: "+ tempo);
    }
}