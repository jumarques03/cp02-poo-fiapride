package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== TESTE FIAP DELIVERY ===\n");

        try {
            // Criando objetos válidos
            Caminhao caminhao = new Caminhao("ABC1234", 15000.0, 3);
            Moto moto = new Moto("BRA2E19", 50.0, true);
            Produto pacote = new Produto("BR999", 150.75);

            // Testando Polimorfismo e Fluxo Normal
            Rota rota1 = new Rota("Av. Paulista, 1100", caminhao, pacote);
            rota1.exibirResumoEntrega();

            System.out.println("\n--- Trocando para Moto e atualizando status ---");
            pacote.alterarStatus("a caminho");

            // Reutilizando a rota com outro tipo de veículo (Polimorfismo)
            Rota rota2 = new Rota("Rua Augusta, 500", moto, pacote);
            rota2.exibirResumoEntrega();

            // Testando Validações (Devem exibir as mensagens de erro que você criou)
            System.out.println("\n--- Testando Restrições de Segurança ---");

            try {
                new Caminhao("GHI9090", 5000, 1); // Erro: Um caminhão deve ter pelo menos 2 eixos.
            } catch (IllegalArgumentException e) {
                System.out.println("Validação Eixos: " + e.getMessage());
            }

            try {
                new Caminhao("GHI9090", -5000, 2); // Erro: A capacidade de carga de um veículo não deve ser negativa.
            } catch (IllegalArgumentException e) {
                System.out.println("Validação Capacidade de Carga: " + e.getMessage());
            }

            try {
                moto.atualizarPlaca("123"); // Erro: Placa inválida. Insira uma placa válida (ex: ABC2022)
            } catch (IllegalArgumentException e) {
                System.out.println("Validação Placa: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}