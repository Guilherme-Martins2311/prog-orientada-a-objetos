package atividade01;

public class Main {
    public static void main(String[] args) {

        Computador pc = new Computador(16, 500, 8, 2.5f);

        SistemaOperacional so = new SistemaOperacional(pc);

        // Programa executado com sucesso
        Programa p1 = new Programa(8, 100, 4, 10000);
        so.executarPrograma(p1);

        // Erro na instalação do programa (SSD insuficiente)
        Programa p2 = new Programa(4, 600, 2, 5000);
        so.executarPrograma(p2);

        // Erro na execução do programa (RAM insuficiente)
        Programa p3 = new Programa(32, 100, 2, 20000);
        so.executarPrograma(p3);
    }
}