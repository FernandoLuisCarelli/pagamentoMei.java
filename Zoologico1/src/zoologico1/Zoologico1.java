package zoologico1;

public class Zoologico1 {

    public static void main(String[] args) {
           
    Animal a = new Animal("lulu", 30, 30, true);    
        
        
       // System.out.println(a.getNome());
        //System.out.println(a.getPeso());
        //System.out.println(a.getIdade());
        //System.out.println(a.getAcordado());
        
    a.emiteSom("Cachorro");
    a.dormir();
    System.out.println(a.isAcordado());
    }
    
}
