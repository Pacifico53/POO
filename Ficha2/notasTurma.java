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
}