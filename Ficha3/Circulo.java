public class Circulo
{
    private double x;
    private double y;
    private double raio;
    /**
     * Construtor por omissao
     */
    public Circulo()
    {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }
    /**
     * Construtor parameterizado
     */
    public Circulo(double xx, double yy, double rr){
        this.x = xx;
        this.y = yy;
        this.raio = rr;
    }
    /**
     * Construtor de copia
     */
    public Circulo(Circulo c1){
        this.x = c1.getX();
        this.y = c1.getY();
        this.raio = c1.getRaio();
    }
    /**
     * Compara um objecto com o circulo, se for totalmente igual retorna TRUE
     */
    public boolean equals(Object o){
        boolean r = false;
        r = (this == o);
        r = !(o == null || this.getClass() != o.getClass());
        Circulo c = (Circulo)o;
        r = (this.x == c.getX() && this.y == c.getY() && this.raio == c.getRaio());
        return r;
    }
    /**
     * get do valor x
     */
    public double getX(){
        return this.x;
    }
    /**
     * get do valor y
     */
    public double getY(){
        return this.y;
    }
    /**
     * get do valor raio
     */
    public double getRaio(){
        return this.raio;
    }
    /**
     * Set do valor x para um que seja dado
     */
    public void setX(double xx){
        this.x = xx;
    }
    /**
     * Set do valor y para um que seja dado
     */
    public void setY(double yy){
        this.y = yy;
    }
    /**
     * Set do valor raio para um que seja dado
     */
    public void setRaio(double rr){
        this.raio = rr;
    }
    /**
     * Altera a posiçao do circulo
     */
    public void alteraCentro(double xx, double yy){
        this.setX(xx);
        this.setY(yy);
    }
    /**
     * Dá a area do circulo
     */
    public double calculaArea(){
        double a = this.raio * this.raio * Math.PI;
        return a;
    }
    /**
     * Dá o perimetro do circulo
     */
    public double calculaPerimetro(){
        double p = this.raio * Math.PI * 2;
        return p;
    }
}