import java.util.Arrays;
public class notasTurma
{
    private int[][] notas;
    public notasTurma(int[][] n)
    {
        notas = n;
    }
    /**
     * Ver a nota de cada aluno a cada cadeira
     * 
     */
    public int[][] verNotas()
    {
        return notas;
    }
}