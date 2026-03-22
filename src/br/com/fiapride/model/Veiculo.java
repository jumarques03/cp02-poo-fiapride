package br.com.fiapride.model;

public class Veiculo {

    // Atributos privados para garantir a segurança dos dados
    private String nomeDono;   
    private String placa;   
    private double quantidadeGasolinaLitros;

    public Veiculo(String nomeDono, String placa, double quantidadeGasolinaLitros) {
        this.setNomeDono(nomeDono);
        this.setPlaca(placa);
        this.setQuantidadeGasolinaLitros(quantidadeGasolinaLitros);
    }
    
    // Getters públicos para leitura controlada
    public String getNomeDono() {
        return this.nomeDono;
    } 
    
    public String getPlaca() {
        return this.placa;
    } 
    
    public double getQuantidadeGasolinaLitros() {
        return this.quantidadeGasolinaLitros;
    } 

    // Setters privados para garantir o encapsulamento e a validação dos dados
    private void setNomeDono(String nome) {
        if (nome == null || nome.trim().isEmpty()) { 
            System.out.println("ERRO: Tentativa de definir o nome do dono do veículo bloqueada!");
            return;
        }

        this.nomeDono = nome;
    } 
    
    private void setPlaca(String placa) {
        if (placa == null || placa.trim().length() != 8) {
            System.out.println("ERRO: A placa deve conter exatamente 8 caracteres (contando com o hífen).");
            return; 
        }

        this.placa = placa;
    }
    
    private void setQuantidadeGasolinaLitros(double quantidadeGasolinaLitros) {
        if (quantidadeGasolinaLitros <= 0){
            System.out.println("ERRO: Tentativa de definir quantidade de gasolina negativa bloqueada!");
            return; 
        }

        this.quantidadeGasolinaLitros = quantidadeGasolinaLitros;
    }  

    // Métodos de Negócio: substituem a alteração direta de atributos
    public void abastecer(double litrosGasolina) {
        if (quantidadeGasolinaLitros <= 0){
            System.out.println("ERRO: Quantidade de gasolina inválida. O valor a abastecer tem que ser maior que zero.");
            return; 
        }

        this.quantidadeGasolinaLitros += litrosGasolina;
        System.out.println("Veículo abastecido com " + litrosGasolina + " litros de gasolina.");
    }

    public void consumir(double litrosGasolina) {
        if (this.quantidadeGasolinaLitros < litrosGasolina){
            System.out.println("ERRO: Quantidade de gasolina insuficiente. Abasteça o veículo.");
            return; 
        }

        this.quantidadeGasolinaLitros -= litrosGasolina;
        System.out.println("Veículo consumiu " + litrosGasolina + " litros de gasolina.");
    }
}
