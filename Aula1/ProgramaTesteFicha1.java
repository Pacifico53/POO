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
    }
}