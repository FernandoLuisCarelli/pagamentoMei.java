 package estudojpa.entidades;

 import java.io.Serializable;
import java.util.ArrayList;
 import java.util.List;
 import javax.persistence.CascadeType;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.OneToMany;
 import javax.persistence.OneToOne;
 import javax.persistence.Table;

 @Entity
 @Table(name = "estados")
 public class Estados1 implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 @Column(name = "uf", nullable = false, length = 2)
 private String unidade_federativa;
 @Column(name = "nome", nullable = false, length = 60)
 private String nome;
 @OneToMany(cascade= CascadeType.ALL)
 private List<Cidades> cidades = new ArrayList<Cidades>();
 @OneToOne(cascade= CascadeType.ALL)
 private Governador governador;

 public Estados1() {
 }

 public long getId() {
 return id;
 }

 public void setId(long id) {
 this.id = id;
 }

    public String getUnidade_federativa() {
        return unidade_federativa;
    }

    public void setUnidade_federativa(String unidade_federativa) {
        this.unidade_federativa = unidade_federativa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidades> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidades> cidades) {
        this.cidades = cidades;
    }

    public Governador getGovernador() {
        return governador;
    }

    public void setGovernador(Governador governador) {
        this.governador = governador;
    }

    
 }