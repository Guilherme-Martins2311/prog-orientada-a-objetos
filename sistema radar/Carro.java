public class Carro {
    public Integer ano;
    public String modelo;
    public String placa;
    public Integer velocidade;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo){
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }

    public Integer getVelocidade(){
        return this.velocidade;
    }

    
    
    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        this.velocidade -= 10;
    }
    
}
