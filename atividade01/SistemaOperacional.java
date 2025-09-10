package atividade01;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: Espaço em SSD insuficiente para instalar o programa.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: Memória RAM insuficiente para executar o programa.");
            return false;
        }

        if (p.getNucleos() > computador.getNucleos()) {
            System.out.println("Erro: O programa requer mais núcleos do que o disponível no computador.");
            return false;
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}