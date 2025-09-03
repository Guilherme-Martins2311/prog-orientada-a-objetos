public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR100", 0, 76, "Comodoro");
        opala.velocidade = 0;
        opala.placa = "ACLR100";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar("pardal", 60, "Pistao Sul");
        radar.modelo = "pardal";
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistao Sul";

        opala.acelerar(); // 10
        opala.acelerar(); // 20
        opala.acelerar(); // 30
        opala.acelerar(); // 40
        opala.acelerar(); // 50
        opala.acelerar(); // 60
        
        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 70
        radar.avaliarVelocidade(opala);

        opala.frear(); // 60
        radar.avaliarVelocidade(opala);
    }
}
