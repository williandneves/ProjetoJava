package Estoque;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date dataDeValidade;

    public ProdutoPerecivel(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, Date dataDeValidade) {
        super(id, nome, descricao, preco, quantidadeEmEstoque);
        this.dataDeValidade = dataDeValidade;
    }

    // Getter e setter específicos para ProdutoPerecivel

    @Override
    public boolean verificarValidade() {
        Date hoje = new Date();
        return hoje.before(dataDeValidade);
    }
}
