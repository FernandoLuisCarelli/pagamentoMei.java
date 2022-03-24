package exemplopreparedstatement;

import entidades.podruto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ExemploPreparedStatement {

    private Connection con =null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driveJDBC = null;
    
    public ExemploPreparedStatement(){
    driveJDBC = "org.apache.derby.jdbc.ClientDriver";
    urlConexao = "jdbc:derby://localhost:1527/ead-bd";
    usuario = "ead";
    senha = "ead";
    
    this.conectarBanco();
    this.executarPreparedStatement();
    this.desconectaBanco();
    
    }
    

    public static void main(String[] args) {
    
        ExemploPreparedStatement prepStmt = new ExemploPreparedStatement();
        ExemploResultSet exRes = new ExemploResultSet();
        podruto prod = new podruto();
        
        
        
    
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
            con.close();
            }
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro ao Desconectar", JOptionPane.ERROR_MESSAGE);
            }
        
        
    }
    
    private void executarPreparedStatement(){
        String sql = "INSERT INTO EAD.PODRUTO (ID, DESCRICAO)" + "VALUES (?, ?)";
        
        try{
            String teste = "filhodaputa";
            int testeid = 44;
            PreparedStatement stmtProdutos = con.prepareStatement(sql);
            stmtProdutos.setInt(1, 2000);
            stmtProdutos.setString(2, "DESCRICAO DO PRODUTO 2000");
            stmtProdutos.setInt(1, 5000);
            stmtProdutos.setString(2, "BUCETA DO PRODUTO 5000");
            
            stmtProdutos.setInt(1, testeid);
            stmtProdutos.setString(2, teste);
            
            
            
            int qtdRegistrosInseridos = stmtProdutos.executeUpdate();
            
            String saida = "Quantidade de registros inseridos: " + qtdRegistrosInseridos;
            JOptionPane.showMessageDialog(null, saida, "Registros inseridos com sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao inserir Registro", JOptionPane.ERROR_MESSAGE);
                
            }
    
    }
    
    
    
}
