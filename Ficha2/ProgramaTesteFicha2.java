import java.util.Scanner;
import java.util.Arrays;
public class ProgramaTesteFicha2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //--------------------------------------EXERCICIO 1
        //FAZER ARRAY DE INTS INICIAL PARA USAR NOS EXERCICIOS
        System.out.println("----Exercicio 1----");
        System.out.println("Insere o tamanho da tua lista de numeros:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Insere os numeros do array:");
        for(int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        Inteiros lint = new Inteiros(array);
    
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
        
        //-----------------------------------------EXERCICIO 2
        System.out.println("----Exercicio 2----");
        
        //FAZER ARRAY DE NOTAS DE ALUNOS INICIAL PARA USAR NOS EXERCICIOS
        
        System.out.println("a) Criar tabela de notas:");
        System.out.println("Insere numero de cadeiras");
        int cadeiras = sc.nextInt();
        System.out.println("Insere numero de alunos");
        int alunos = sc.nextInt();
        int[][] listaNotas = new int[cadeiras][alunos];
        for(int i=0;i<cadeiras;i++){
            System.out.println("Notas da cadeira " + (i+1) + ":");
            for (int j=0;j<alunos;j++){
                System.out.println("Aluno "+ (j+1) + ":");
                listaNotas[i][j] = sc.nextInt();
            }
        }
        
        notasTurma lnotas = new notasTurma(listaNotas, cadeiras, alunos);
        
        System.out.println("b) Escolhe uma cadeira para calcular a soma das notas (index 0)");
        int cadeiraParaSomar = sc.nextInt();
        System.out.println("Soma das notas da cadeira "+ cadeiraParaSomar+": "+ lnotas.somaNotasCadeira(cadeiraParaSomar));
    }
}