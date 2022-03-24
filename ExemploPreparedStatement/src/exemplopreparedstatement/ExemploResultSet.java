package exemplopreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ExemploResultSet {

    private Connection con = null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driverJDBC = null;
    
    
    public ExemploResultSet(){
    
        driverJDBC = "org.apache.derby.jdbc.ClientDriver";
        urlConexao = "jdbc:derby://localhost:1527/ead-bd";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        this.recuperarResultSet();
        this.desconectaBanco();
    }
    
    
    private void conectarBanco(){
    try {
        Class.forName(driverJDBC);
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
    
    private void recuperarResultSet(){
    
        String saida ="";
        String sql ="select ID, DESCRICAO from EAD.PODRUTO";
        String teste="filhodaputa";
        
        try{
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet dados = stmt.executeQuery(sql);
            
            if (!dados.next()){
                saida = "nenhum Registro Cadastrado";
            }else {
                saida = "Recuperando pelo indice da coluna";
                saida += "\nCodigo\tDescricao";
                dados.first();
                
                while(!dados.isAfterLast()){
                    saida += "\n" + dados.getInt(1) + "\t" + dados.getString(2);
                    dados.next();
                }
                saida += "\n\nRecuperando pelo Nome da Coluna";
                saida += "\nCodigo\tDescricao";
                dados.first();
                
                while(!dados.isAfterLast()){
                    saida += "\n" + dados.getInt("ID") + "\t" + dados.getString("DESCRICAO");
                    dados.next();
                }
                
            }
            
            JTextArea saidaArea = new JTextArea();
            saidaArea.setText(saida);
            JOptionPane.showMessageDialog(null, saidaArea, "Recuperando com ResultSet", JOptionPane.INFORMATION_MESSAGE);
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao Recuperar Registro", JOptionPane.ERROR_MESSAGE);
                
            }
    
    }

    
}
