public class Telemovel
{
    private String marca;
    private String modelo;
    private int resX;
    private int resY;
    private int armazenamentoSMS;
    private int armazenamentoFotos;
    private int armazenamentoApps;
    private int armazenamentoTotal;
    private int espacoOcupado;
    private int numeroFotos;
    private int numeroApps;
    private String[] nomeApps;
    /**
     * Constructor por omissao
     */
    public Telemovel()
    {
        this.marca = "";
        this.modelo = "";
        this.resX = 0;
        this.resY = 0;
        this.armazenamentoSMS = 0;
        this.armazenamentoFotos = 0;
        this.armazenamentoApps = 0;
        this.armazenamentoTotal = 0;
        this.espacoOcupado = 0;
        this.numeroFotos = 0;
        this.numeroApps = 0;
        this.nomeApps = new String[0];
    }
    /**
     * Construtor parameterizado
     */
    public Telemovel(String marca1, String modelo1, int resXX, int resYY, int armazSMS, int armazFotos, int armazApps, int espacOcup, int nmroFotos, int nmroApps, String[] nomApps){
        this.marca = marca1;
        this.modelo = modelo1;
        this.resX = resXX;
        this.resY = resYY;
        this.armazenamentoSMS = armazSMS;
        this.armazenamentoFotos = armazFotos;
        this.armazenamentoApps = armazApps;
        this.armazenamentoTotal = armazFotos + armazApps;
        this.espacoOcupado = espacOcup;
        this.numeroFotos = nmroFotos;
        this.numeroApps = nmroApps;
        this.nomeApps = nomApps;
    }
    /**
     * Construtor de copia
     */
    public Telemovel(Telemovel t){
        this.marca = t.getMarca();
        this.modelo = t.getModelo();
        this.resX = t.getResX();
        this.resY = t.getResY();
        this.armazenamentoSMS = t.getArmazSMS();
        this.armazenamentoFotos = t.getArmazFotos();
        this.armazenamentoApps = t.getArmazApps();
        this.armazenamentoTotal = t.getArmazTotal();
        this.espacoOcupado = t.getEspacoOcupado();
        /*this.numeroFotos = t.getNmroFotos();
        this.numeroApps = t.getNmroApps();
        this.nomeApps = t.getNomeApps();*/
    }
    /**
     * Get da marca
     */
    public String getMarca(){
        return this.marca;
    }
    /**
     * Set da marca
     */
    public void setMarca(String newmarca){
        this.marca = newmarca;
    }
    /**
     * Get do modelo
     */
    public String getModelo(){
        return this.modelo;
    }
    /**
     * Set do modelo
     */
    public void setModelo(String newmodel){
        this.modelo = newmodel;
    }
    /**
     * Get da resolucao X
     */
    public int getResX(){
        return this.resX;
    }
    /**
     * Set da resolucao X
     */
    public void setResX(int newRes){
        this.resX = newRes;
    }
    /**
     * Get da resolucao Y
     */
    public int getResY(){
        return this.resY;
    }
    /**
     * Set da resolucao Y
     */
    public void setResY(int newRes){
        this.resY = newRes;
    }
    /**
     * Get do armazenamento das sms
     */
    public int getArmazSMS(){
        return this.armazenamentoSMS;
    }
    /**
     * Set do armazenamento SMS
     */
    public void setArmazSMS(int newArmaz){
        this.armazenamentoSMS = newArmaz;
    }
    /**
     * Get do armazenamento das fotos
     */
    public int getArmazFotos(){
        return this.armazenamentoFotos;
    }
    /**
     * Set do armazenamento Fotos
     */
    public void setArmazFotos(int newArmaz){
        this.armazenamentoFotos = newArmaz;
    }
    /**
     * Get do armazenamento das apps
     */
    public int getArmazApps(){
        return this.armazenamentoApps;
    }
    /**
     * Set do armazenamento apps
     */
    public void setArmazApps(int newArmaz){
        this.armazenamentoApps = newArmaz;
    }
    /**
     * Get do armazenamento total (apps e fotos)
     */
    public int getArmazTotal(){
        return this.armazenamentoTotal;
    }
    /**
     * Get do espaco ocupado
     */
    public int getEspacoOcupado(){
        return this.espacoOcupado;
    }
    /**
     * Set do espaco ocupado
     */
    public void setEspacoOcupado(int newEspaco){
        this.espacoOcupado = newEspaco;
    }
    /**
     * Get do numero de fotos
     */
    public int getNumeroFotos(){
        return this.numeroFotos;
    }
    /**
     * Set do numero de fotos
     */
    public void setNumeroFotos(int newFotos){
        this.numeroFotos = newFotos;
    }
    /**
     * Get do numero apps
     */
    public int getNumeroApps(){
        return this.numeroApps;
    }
    /**
     * Get do nome das apps
     */
    public String[] getNomeApps(){
        return this.nomeApps;
    }
    /**
     * Diz se existe espaco para instalar certo ficheiro de X bytes
     */
    public boolean existeEspaco(int numeroBytes){
        boolean r;
        if(numeroBytes > (this.armazenamentoTotal + this.armazenamentoSMS - this.espacoOcupado)) r = false;
            else r = true;
        return r;
    }
    /**
     * Instala uma aplicacao, dado o nome e o tamanho
     */
    public void instalaApp(String nome, int tamanho){
        this.espacoOcupado += tamanho;
        this.numeroApps++;
        String[] tempArray = new String[this.numeroApps];
        for (int i=0; i < this.numeroApps - 1; i++){
            tempArray[i] = this.nomeApps[i];
        }
        tempArray[this.numeroApps - 1] = nome;
        this.nomeApps = tempArray;
    }
}