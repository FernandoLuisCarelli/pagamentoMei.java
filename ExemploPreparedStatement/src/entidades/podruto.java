package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "podruto")

public class podruto implements Serializable {

    @Id
    private long id;
    private String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    private BigDecimal quantidadeEstoque;
    
    
    public podruto() {

    }
    
    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public Date getDataCadastro(){
        return dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }
    
    public BigDecimal getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(BigDecimal quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
}
