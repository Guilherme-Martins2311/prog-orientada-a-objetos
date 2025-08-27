public class Radar {
    public Integer limiteVelociade;
    public String modelo;
    public String localizacao;
    public Integer velocidadeAvaliada;
    
    public void emitirNotificacao(String Placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: "+ this.limiteVelociade);
        System.out.println("Velociade Avaliada: "+ velocidadeAvaliada);
        System.out.println("Placa: "+ Placa);
    }

    public void avaliarVelocidade(Carro c){
        if(c.velocidade > this.limiteVelociade){
            emitirNotificacao(c.placa, c.velocidade);
        }
    }
}