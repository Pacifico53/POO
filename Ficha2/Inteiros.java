import java.util.Arrays;
public class Inteiros
{
    public int[] listInts;
    public Inteiros(int[] li){
        listInts = li;
    }
    /**
     * Retorna o min do array
     */
    public int min(){
        int min = listInts[0];
        for(int v : listInts){
            if(v<min)
                min = v;
        }
        return min;
    }
    /**
     * Retorna matriz delimitada pelos dois indices atribuidos
     */
    public int[] doisIndex(int a, int b){
        int[] res = Arrays.copyOfRange(listInts, a, b);
        return res; 
    }
    public int[] comparaDois(int[] arr){
        int l = 0;
        for(int i=0; i<arr.length && i<listInts.length;i++){
            if(arr[i]==listInts[i]){
                l++;
            }
        }
        int[] res = new int[l];
        l = 0;
        for(int i=0; i<arr.length && i<listInts.length;i++){
            if(arr[i]==listInts[i]){
                res[l] = arr[i];
                l++;
            }
        }
        return res;
    }
}