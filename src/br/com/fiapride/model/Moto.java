package br.com.fiapride.model;

public class Moto extends Veiculo {
    private boolean hasBau;

    public Moto(String placa, double capacidadeCargaKg, boolean hasBau) {
        super(placa, capacidadeCargaKg);
        setHasBau(hasBau);
    }

    public boolean hasBau() {
        return this.hasBau;
    }

    private void setHasBau(boolean hasBau) {
        this.hasBau = hasBau;
    }

    public void adicionarBau() {
        if (!this.hasBau) {
            setHasBau(true);
        }
    }
}
