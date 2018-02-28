import java.util.Arrays;
public class notasTurma
{
    private int numeroCadeiras;
    private int numeroAlunos;
    private int[][] notas;
    public notasTurma(int[][] n, int nmroCadeiras, int nmroAlunos)
    {
        notas = n;
        numeroCadeiras = nmroCadeiras;
        numeroAlunos = nmroAlunos;
    }
    /**
     * Ver a nota de cada aluno a cada cadeira
     */
    public int[][] verNotas(){
        return notas;
    }
    /**
     * Ver a soma de todas as notas de uma cadeira
     */
    public int somaNotasCadeira(int cadeiraSoma){
        int soma = 0;
        for(int i = 0; i<numeroAlunos; i++){
            soma += notas[cadeiraSoma][i];
        }
        return soma;
    }
    /**
     * Ver a media das notas de um aluno
     */
    public float mediaAluno(int aluno){
        float media = 0;
        for(int i = 0;i<numeroCadeiras;i++){
            for(int j = 0; j < numeroAlunos; j++){
                if(j == aluno){media += notas[i][j];}
            }
        }
        media /= numeroCadeiras;
        return media;
    }
    /**
     * Dá a melhor nota de todas as cadeiras
     */
    public int melhorNota(){
        int m = 0;
        for(int i = 0; i<numeroCadeiras; i++){
            for(int j = 0; j<numeroAlunos; j++){
                if(notas[i][j] > m){m = notas[i][j];}
            }
        }
        return m;
    }
    /**
     * Dá a pior nota de todas as cadeiras
     */
    public int piorNota(){
        int p = 20;
        for(int i = 0; i<numeroCadeiras; i++){
            for(int j = 0; j<numeroAlunos; j++){
                if(notas[i][j] < p){p = notas[i][j];}
            }
        }
        return p;
    }
    /**
     * Dá uma lista de notas com valor acima do que o dado
     */
    public int[] notasAcima(int a){
        int r[] = new int[numeroAlunos * numeroCadeiras];
        int l = 0;
        for(int i = 0; i<numeroCadeiras; i++){
            for(int j = 0; j<numeroAlunos; j++){
                if(notas[i][j] > a){r[l] = notas[i][j]; l++;}
            }
        }
        return Arrays.copyOfRange(r, 0, l);
    }
}