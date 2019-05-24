
package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoProdutoPK implements Serializable{
    private static final long serialVersionUID = -637018809489152388L;
    private float valor;
    private float quantidade;

    @Override
    public String toString() {
        return "("+ getValor()+ ") " + getQuantidade();
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
}
