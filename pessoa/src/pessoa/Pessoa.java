package pessoa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "pessoa")

public class Pessoa implements Serializable {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        
        
        @Column(name = "Nome", nullable = false, length = 60)
        private String nome;
        
        @Column(name = "Idade", nullable = true)
        private int idade;
        
        public Pessoa(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

        
        
    }
        
