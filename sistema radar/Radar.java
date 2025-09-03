public class Radar {
    public Integer limiteVelocidade;
    public String modelo;
    public String localizacao;
    public Integer velocidadeAvaliada;

    public Radar(String modelo, Integer limiteVelocidade, String localizacao){
        this.limiteVelocidade = limiteVelocidade;
        this.localizacao = localizacao;
        this.modelo = modelo;
    }
    
    public void emitirNotificacao(String Placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: "+ this.limiteVelocidade);
        System.out.println("Velociade Avaliada: "+ velocidadeAvaliada);
        System.out.println("Placa: "+ Placa);
    }

    public void avaliarVelocidade(Carro c){
        if(c.velocidade > this.limiteVelocidade){
            emitirNotificacao(c.placa, c.velocidade);
        }
    }
}