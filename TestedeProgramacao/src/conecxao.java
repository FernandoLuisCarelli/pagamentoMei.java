
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class conecxao {

public conecxao(){
    
    String urlConexao;
    urlConexao = "jdbc:derby://localhost:1527/sample";
    String usuario = "nbuser";
    String senha = "nbuser";
    
    try {
        Connection con;
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/mei"
                + "", "mei", "mei");
    } catch (SQLException ex) {
        Logger.getLogger(conecxao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}

}
