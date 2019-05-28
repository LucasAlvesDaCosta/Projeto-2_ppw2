
package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import java.util.Objects;
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

   @ManyToOne
   @JoinColumn(name = "pedido_id")
    private Pedido pedido;
   
   @ManyToOne
   @JoinColumn(name = "produto_id")
   private Produto produto;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.pedidoId);
        hash = 79 * hash + Objects.hashCode(this.produtoId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoProdutoPK other = (PedidoProdutoPK) obj;
        if (!Objects.equals(this.pedidoId, other.pedidoId)) {
            return false;
        }
        if (!Objects.equals(this.produtoId, other.produtoId)) {
            return false;
        }
        return true;
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
