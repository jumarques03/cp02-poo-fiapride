package br.com.fiapride.model;

public class Produto {
    private String codigo;
    private double preco;
    private String status;

    public Produto(String codigo, double preco) {
        setCodigo(codigo);
        setPreco(preco);
        setStatus("não entregue");
    }

    public void alterarStatus(String novoStatus) {
        if (novoStatus.equalsIgnoreCase("entregue") || 
            novoStatus.equalsIgnoreCase("não entregue") || 
            novoStatus.equalsIgnoreCase("a caminho")) {
            this.setStatus(novoStatus.toLowerCase()); // Setter sem validação pois a validação mais complexa é feita nesse método! 
        } else {
            throw new IllegalArgumentException("Status inválido. Insira um status válido (entregue, não entregue ou a caminho");
        }
    }

    public String getCodigo() { 
        return this.codigo; 
    }

    private void setCodigo(String codigo) {
        if(codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido, verifique o código do produto.");
        }
        this.codigo = codigo; 
    }

    public double getPreco() { 
        return this.preco; 
    }

    private void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço de um produto não pode ser negativo.");
        }
        this.preco = preco;
    }

    public String getStatus() { 
        return this.status; 
    }

    private void setStatus(String status) { 
        this.status = status;
    }
}
