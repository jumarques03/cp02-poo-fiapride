package br.com.fiapride.model;

public class Veiculo {
    private String placa;
    private double capacidadeCargaKg;

    public Veiculo(String placa, double capacidadeCargaKg) {
        setPlaca(placa);
        setCapacidadeCargaKg(capacidadeCargaKg);
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        // modelo de placa: ABC2022 ou BRA2E19
        if (placa == null || placa.trim().isEmpty() || placa.length() != 7) {
            throw new IllegalArgumentException("Placa inválida. Insira uma placa válida (ex: ABC2022)");
        }
        this.placa = placa;
    }

    public double getCapacidadeCargaKg() {
        return this.capacidadeCargaKg;
    }

    private void setCapacidadeCargaKg(double capacidadeCargaKg) {
        if (capacidadeCargaKg <= 0) {
            throw new IllegalArgumentException("A capacidade de carga de um veículo não deve ser negativa.");
        }
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public void atualizarPlaca(String novaPlaca) {
        this.setPlaca(novaPlaca);
        System.out.println("Solicitação de mudança de placa aceita! Nova placa do veículo: " + this.getPlaca());
    }
}
