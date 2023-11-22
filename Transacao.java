package Estoque;

import java.util.Date;

public class Transacao {
    private int id;
    private Date data;
    private Produto produtoVendido;
    private int quantidade;
    private double precoUnitario;
    private String tipo; // COMPRA ou VENDA

    public Transacao(int id, Date data, Produto produtoVendido, int quantidade, double precoUnitario, String tipo) {
        this.setId(id);
        this.setData(data);
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.tipo = tipo;
    }

    // Getters e setters

    public double calcularValorTotalTransacao() {
        return quantidade * precoUnitario;
    }

    public void processarTransacao() {
        if (tipo.equalsIgnoreCase("VENDA")) {
            if (quantidade <= produtoVendido.getQuantidadeEmEstoque()) {
                produtoVendido.setQuantidadeEmEstoque(produtoVendido.getQuantidadeEmEstoque() - quantidade);
            } else {
                // Lidar com a falta de estoque
                System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
            }
        } else if (tipo.equalsIgnoreCase("COMPRA")) {
            produtoVendido.setQuantidadeEmEstoque(produtoVendido.getQuantidadeEmEstoque() + quantidade);
        }
    }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
