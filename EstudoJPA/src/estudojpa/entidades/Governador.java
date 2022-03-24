    
    
package estudojpa.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name = "governador")
 public class Governador implements Serializable {

 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private long id;
 @Column(name ="nome", nullable=false, length=60)
 private String nome;

 public Governador() {
 }

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
}

