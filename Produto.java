package Estoque;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, String descricao, double preco, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters e setters

    public double calcularValorEmEstoque() {
        return quantidadeEmEstoque * preco;
    }

    public boolean verificarValidade() {
        return true; // Método padrão para produtos não perecíveis
    }

    public boolean compararProduto(Produto outroProduto) {
        return this.id == outroProduto.id || this.nome.equalsIgnoreCase(outroProduto.nome);
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getQuantidadeEmEstoque() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQuantidadeEmEstoque(int i) {
		// TODO Auto-generated method stub
		
	}
}
