package Estoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;
    private ArrayList<Transacao> transacoes;

    public Estoque() {
        this.produtos = new ArrayList<>();
        this.setTransacoes(new ArrayList<>());
    }

    // Métodos para adicionar, remover produtos e registrar transações

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.calcularValorEmEstoque();
        }
        return valorTotal;
    }

    public void gerarRelatorioEstoque() {
        System.out.println("Relatório de Estoque:");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() +
                    ", Nome: " + produto.getNome() +
                    ", Quantidade em Estoque: " + produto.getQuantidadeEmEstoque() +
                    ", Valor em Estoque: " + produto.calcularValorEmEstoque());
        }
    }

    public Produto buscarProduto(String termoBusca) {
        for (Produto produto : produtos) {
            if (produto.compararProduto(new Produto(0, termoBusca, "", 0, 0))) {
                return produto;
            }
        }
        return null;
    }

	public ArrayList<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(ArrayList<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
}
