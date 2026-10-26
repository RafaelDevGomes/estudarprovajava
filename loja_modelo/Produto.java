public class Produto {
    
    private int codigo;
    private String descricao;
    private int quantidadeEstoque;
    private double precoUnitario;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidadeEstoque += qtd;
            System.out.println("Estoque adicionado com sucesso! Quantidade atual: " + this.quantidadeEstoque);
        } else {
            System.out.println("Erro: A quantidade a ser adicionada deve ser maior que zero!");
        }
    }
    

    public boolean removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= qtd;
            System.out.println("Estoque removido com sucesso! Quantidade atual: " + this.quantidadeEstoque);
            return true;
        } else {
            System.err.println("Erro: Quantidade inválida ou maior que a quantidade disponível em estoque.");
            return false;
        }
    }
}

