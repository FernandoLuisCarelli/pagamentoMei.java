/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeconecxao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class Conecxao {
    
    private Connection con =null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driveJDBC = null;

    public Conecxao(){
    
    driveJDBC = "org.apache.derby.jdbc.ClientDriver";
    urlConexao = "jdbc:derby://localhost:1527/ead-bd";
    usuario = "ead";
    senha = "ead";
    
    this.conectarBanco();
   // this.executarPreparedStatement();
    this.desconectaBanco();


    }
    
    
        private void conectarBanco(){
    try {
        Class.forName(driveJDBC);
        con = DriverManager.getConnection(urlConexao,usuario,senha);
        JOptionPane.showMessageDialog(null,"Conectado com Sucesso");
        }catch(ClassNotFoundException | SQLException ex){
        JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro ao conectar no banco",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void desconectaBanco(){
        
        try{
            if (!con.isClosed()){
            
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
            con.close();
            }
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro ao Desconectar", JOptionPane.ERROR_MESSAGE);
            }
        
        
    }

    
}
