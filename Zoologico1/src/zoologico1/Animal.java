package zoologico1;

public class Animal {
    
private String nome;
private double peso;
private int idade;
private boolean acordado;


public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public double getPeso(){
    return peso;
}

public void setPeso(double peso){
    this.peso = peso;
}

public int getIdade(){
    return idade;
}

public void setIdade(int idade){
    this.idade = idade;
}

public boolean isAcordado(){
    return acordado;
}

public void setAcordado(boolean acordado){
    this.acordado = acordado;
}



public Animal(String nome, double peso, int idade, boolean acordado){

this.nome = nome;
this.peso = peso;
this.idade = idade;
this.acordado = acordado;

}

public Animal() {
        this("", 0, 0, false);
    }
    
    public Animal(Animal outro) {
        this(outro.getNome(),
             outro.getPeso(),
             outro.getIdade(),
             outro.isAcordado());
    }
    
public void emiteSom(String tipo){
    if (tipo == "Leao"){
        System.out.println("RUAAAAAARRRR");
    }else if(tipo == "Cachorro"){
        System.out.println("Au Au Au");
    }else{
        System.out.println("Animal não Cadastrado");
    }
}

public void dormir(){
    acordado = false;
    System.out.println("ZZZZZZZZZZZ");
}
        





}