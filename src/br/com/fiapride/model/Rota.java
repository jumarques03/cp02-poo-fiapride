package br.com.fiapride.model;

public class Rota {
    private String enderecoDestino;
    private Veiculo veiculoUtilizado;
    private Produto produtoAEntregar;

    public Rota(String enderecoDestino, Veiculo veiculoUtilizado, Produto produtoAEntregar) {
        if (veiculoUtilizado == null || produtoAEntregar == null) {
            throw new IllegalArgumentException("Veículo e Produto são obrigatórios para uma rota.");
        }
        setDestino(enderecoDestino);
        this.veiculoUtilizado = veiculoUtilizado;
        this.produtoAEntregar = produtoAEntregar;
    }

    public void exibirResumoEntrega() {
        System.out.println("--- Resumo da Entrega ---");
        System.out.println("Destino: " + enderecoDestino);
        System.out.println("Veículo (Placa): " + veiculoUtilizado.getPlaca());
        System.out.println("Produto: " + produtoAEntregar.getCodigo());
        System.out.println("Status Atual: " + produtoAEntregar.getStatus());
    }

    public String getDestino() { 
        return this.enderecoDestino; 
    }

    private void setDestino(String endereco) {
        if(endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Só é possível realizar uma entrega com um destino definido! Verifique se há um endereço de entrega.");
        }
        this.enderecoDestino = endereco; 
    }
    
    public Veiculo getVeiculoUtilizado() { 
        return this.veiculoUtilizado; 
    }
    
    public Produto getProdutoAEntregar() { 
        return this.produtoAEntregar; 
    }
}
