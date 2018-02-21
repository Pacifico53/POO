import java.util.Scanner;
import java.util.Arrays;
public class ProgramaTesteFicha2
{
    public static void main(String[] args){
        //FAZER ARRAY DE INTS INICIAL PARA USAR NOS EXERCICIOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere o tamanho da tua lista de numeros:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Insere os numeros do array:");
        for(int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        Inteiros lint = new Inteiros(array);
        
        //EXERCICIOS
        System.out.println("Exercicio 1.\na) Min desse array: "+ lint.min());
        System.out.println("b) Insere dois indices para cortar o teu array:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] newarray = lint.doisIndex(a, b);
        System.out.println("Array resultante: "+ Arrays.toString(newarray));
        
        System.out.println("c) Insere o tamanho de uma lista para comparar numeros iguais:");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Insere os numeros do array:");
        for(int i = 0;i<size2;i++){
            array2[i] = sc.nextInt();
        }
        int[] arrayComp = lint.comparaDois(array2);
        System.out.println("Array com numeros iguais: "+ Arrays.toString(arrayComp));
    }
}