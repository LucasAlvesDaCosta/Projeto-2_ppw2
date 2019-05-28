
package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PedidoProdutoPK implements Serializable{
    private static final long serialVersionUID = -637018809489152388L;
   @Column(name = "pedido_id")
    private Integer pedidoId;
   
   @Column(name = "produto_id")
    private Integer produtoId;
   
    private float valor;
    private float quantidade;

   @ManyToOne
   @JoinColumn(name = "pedido_id")
    private Pedido pedido;
   
   @ManyToOne
   @JoinColumn(name = "produto_id")
   private Produto produto;
   
    @Override
    public String toString() {
        return "("+ getValor()+ ") " + getQuantidade();
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
