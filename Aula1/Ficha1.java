public class Ficha1
{
    public double celsiusParaFarenheit(double graus){
        return graus*(9/5)+32;
    }
    public int maximoNumeros(int a, int b){
        return a > b ? a : b;
    }
    public String criaDescricaoConta(String nome, double saldo){
        return "Esta pessoa chama se "+nome+" e tem este saldo: "+saldo; 
    }
    public double eurosParaLibras(double valor, double taxaConversao){
        return valor*taxaConversao;
    }
    public long factorial(int num){
        int i;
        int r=1;
        for(i=1;i<num;i++){
            r *= i;
        }
        return r;
    }
}