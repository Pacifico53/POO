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
}