package br.com.fiapride.model;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeCargaKg, int quantidadeEixos) {
        super(placa, capacidadeCargaKg);
        setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
        return this.quantidadeEixos;
    }

    private void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos < 2) {
            throw new IllegalArgumentException("Um caminhão deve ter pelo menos 2 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }
}