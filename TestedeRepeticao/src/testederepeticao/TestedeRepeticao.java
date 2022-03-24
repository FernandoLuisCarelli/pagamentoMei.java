package testederepeticao;

public class TestedeRepeticao {

    public static void main(String[] args) {

        
int resultado = 0;
int op = 0;

for(int i = 0; i <= 500; i++){
    if(i % 2 ==  0){
        resultado += i;
    }
}

System.out.println("A soma é :" + resultado);

Repeticao rep = new Repeticao();
rep.Repeticao();


}
    
}
