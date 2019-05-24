/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
 @Table(name="pedido")
public class Pedido implements Serializable{
    private static final long serialVersionUID = 5999236902534007386L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @EmbeddedId
    private PedidoProdutoPK id;
    
    @Column(name = "cliente_id")
    private Integer clienteID;
    
    @Temporal(TemporalType.DATE)    
    @Column(name = "data_pedido")    
    private Date dataP;    
    
    private String observacoes;    
    @Column(name = "observacoes_cliente")
    private String observacoesC;
    
    @Column(name = "usuario_id")
    private Integer usuarioID;
    private float desconto;
@ManyToMany
    @JoinTable(name = "pedido_has_produto", 
            joinColumns = @JoinColumn(name="produto_id"),
            inverseJoinColumns = @JoinColumn(name="pedido_id"))
    private List<Produto> produtos;

@OneToMany
 @JoinColumn(name = "pedido_id")
  private FluxoCaixa fluxoCaixa;

    public List<Produto> getProdutos() {
        return produtos;
    }
    
  public String getProdutosString(){
        StringBuilder builder = new StringBuilder();
        for (Produto produto : produtos) {
            builder.append(produto.getNome()).append(",");
        }
        return builder.toString();
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Pedido other = (Pedido) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public PedidoProdutoPK getId() {
        return id;
    }

    public void setId(PedidoProdutoPK id) {
        this.id = id;
    }

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Date getDataP() {
        return dataP;
    }

    public void setDataP(Date dataP) {
        this.dataP = dataP;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoesC() {
        return observacoesC;
    }

    public void setObservacoesC(String observacoesC) {
        this.observacoesC = observacoesC;
    }

    public Integer getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public FluxoCaixa getFluxoCaixa() {
        return fluxoCaixa;
    }

    public void setFluxoCaixa(FluxoCaixa fluxoCaixa) {
        this.fluxoCaixa = fluxoCaixa;
    }
    
    
}
