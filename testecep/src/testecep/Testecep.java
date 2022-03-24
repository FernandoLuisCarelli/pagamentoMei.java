package testecep;

public class Testecep {

    public static void main(String[] args) {
    
    
/*String s = "José de Anchieta";
char chars[] = s.toCharArray();
chars [10] = 'X'; 
s = new String (chars); // Resultado = "José de AnXhieta"	*/

String s = "José de Anchieta";
s = s.substring (0, 10) + "X" + s.substring (11);

System.out.println(s);
}
}

//public class TesteQueryString {

