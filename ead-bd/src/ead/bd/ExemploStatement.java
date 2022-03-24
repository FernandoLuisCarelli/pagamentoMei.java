package ead.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ExemploStatement {

    private Connection con =null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driveJDBC = null;
    
    
    public ExemploStatement(){
        driveJDBC = "org.apache.derby.jdbc.ClientDriver";
        urlConexao = "jdbc:derby://localhost:1527/ead-bd";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        this.executarStatement();
        this.desconectaBanco();
    }
    
    private void conectarBanco(){
    
    try {
        Class.forName(driveJDBC);
        con = DriverManager.getConnection(urlConexao,usuario,senha);
        JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        
        }catch(ClassNotFoundException | SQLException ex){
        JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro ao conectar no banco",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void desconectaBanco(){
    
    try{
        if(!con.isClosed()){
            con.close();
        }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Erro ao desconectar do Banco",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void executarStatement(){
    
    String sql = "SELECT * FROM EAD.PODRUTO";
    Statement stmt;
        try {
            stmt = con.createStatement();
            int qtdRegistrosInseridos = stmt.executeUpdate(sql);
            String saida = "Quaridade de Registros inseridos: " + qtdRegistrosInseridos;
            JOptionPane.showMessageDialog(null, saida, "Registro inserido com sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            ResultSet dados = stmt.executeQuery(sql);
            dados.first();
            while (!dados.isAfterLast()){
            
                saida += "\n" + dados.getInt(1) + "\t" + dados.getString(2);
                dados.next();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ExemploStatement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, ex.getMessage(), "Erro ao inserir Registro", JOptionPane.ERROR_MESSAGE);
            
        
        }
    }
}
