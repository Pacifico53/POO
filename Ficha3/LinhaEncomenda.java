public class LinhaEncomenda
{
    private String referencia;
    private String descricao;
    private int preco;
    private int quantidade;
    private double imposto;
    private double desconto;
    /**
     * Constructor vazio
     */
    public LinhaEncomenda()
    {
        this.referencia = "";
        this.descricao = "";
        this.preco = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.desconto = 0;
    }
    /**
     * Constructor parameterizado
     */
    public LinhaEncomenda(String ref, String descr, int price, int quant, double imp, double desc)
    {
        this.referencia = ref;
        this.descricao = descr;
        this.preco = price;
        this.quantidade = quant;
        this.imposto = imp;
        this.desconto = desc;
    }
    /**
     * Construtor de copia
     */
    public LinhaEncomenda(LinhaEncomenda l)
    {
        this.referencia = l.getRef();
        this.descricao = l.getDescr();
        this.preco = l.getPreco();
        this.quantidade = l.getQuantidade();
        this.imposto = l.getImposto();
        this.desconto = l.getDesconto();
    }
    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);
    }
    public boolean equals(Object l){
        if(this == l) return true;
        if(l == null || this.getClass() != l.getClass()) return false;
        LinhaEncomenda ll = (LinhaEncomenda) l;
        return (this.getDesconto() == ll.getDesconto() && this.getDescr() == ll.getDescr() && this.getImposto() == ll.getImposto() 
        && this.getPreco() == ll.getPreco() && this.getQuantidade() == ll.getQuantidade() && this.getRef() == ll.getRef());
    }
    /**
     * Get da referencia
     */
    public String getRef()
    {
        return this.referencia;
    }
    /**
     * Set da referencia
     */
    public void setRef(String s)
    {
        this.referencia = s;
    }
    /**
     * Get da descricao
     */
    public String getDescr()
    {
        return this.descricao;
    }
    /**
     * Set da Descricao
     */
    public void setDescricao(String s)
    {
        this.descricao = s;
    }
    /**
     * Get do preco
     */
    public int getPreco()
    {
        return this.preco;
    }
    /**
     * Set do preco
     */
    public void setPreco(int p)
    {
        this.preco = p;
    }
    /**
     * Get da quantidade
     */
    public int getQuantidade()
    {
        return this.quantidade;
    }
    /**
     * Set da quantidade
     */
    public void setQuantidade(int q)
    {
        this.quantidade = q;
    }
    /**
     * Get do imposto
     */
    public double getImposto()
    {
        return this.imposto;
    }
    /**
     * Set do imposto
     */
    public void setImposto(double i)
    {
        this.imposto = i;
    }
    /**
     * Get do desconto
     */
    public double getDesconto()
    {
        return this.desconto;
    }
    /**
     * Set do desconto
     */
    public void setDesconto(double d)
    {
        this.desconto = d;
    }
    public double calculaValorLinhaEnc(){
        int p = this.preco;
        int q = this.quantidade;
        double d = this.desconto;
        double imp = this.imposto;
        return (p + (p * imp) - (p * d)) * q;
    }
}
