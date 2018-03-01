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
        this.armazenamentoApps = 0;
        this.armazenamentoTotal = 0;
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
     * Get do modelo
     */
    public String getModelo(){
        return this.modelo;
    }
    /**
     * Get da resolucao X
     */
    public int getResX(){
        return this.resX;
    }
    /**
     * Get da resolucao Y
     */
    public int getResY(){
        return this.resY;
    }
    /**
     * Get do armazenamento das sms
     */
    public int getArmazSMS(){
        return this.armazenamentoSMS;
    }
    /**
     * Get do armazenamento das fotos
     */
    public int getArmazFotos(){
        return this.armazenamentoFotos;
    }
    /**
     * Get do armazenamento das apps
     */
    public int getArmazApps(){
        return this.armazenamentoApps;
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
}
