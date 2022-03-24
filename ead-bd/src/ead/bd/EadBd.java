package ead.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class EadBd {


    private Connection con = null;
    private String usuario = null;
    private String senha = null;
    private String urlConecxao = null;
    
    public EadBd(){
    
        urlConecxao = "jdbc:derby://localhost:1527/ead-bd";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        this.desconectarBanco();
        
    }
    

   
    
    private void conectarBanco(){
        String saida ="";
        try {
            con = DriverManager.getConnection(urlConecxao, usuario, senha);
            
            saida += "informações de conecxão";
            saida += "\nFabricante SGDB: " + con.getMetaData().getDatabaseProductName();
            saida += "\nVersão SGDB: " + con.getMetaData().getDatabaseProductVersion();
            saida += "\nDriver SGDB: " + con.getMetaData().getDriverName();
            saida += "\nVersão Drive: " + con.getMetaData().getDriverVersion();
            saida += "\nUrl de conecxão" + con.getMetaData().getURL();
            saida += "\nUsuario: " + con.getMetaData().getUserName();
            
            
            JTextArea saidaArea = new JTextArea();
            saidaArea.setText(saida);
            
            JOptionPane.showMessageDialog(null, saidaArea, "Conecxão realizada com sucesso.", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao conectar no banco", JOptionPane.ERROR_MESSAGE);
        }
    
    
    }
    
    private void desconectarBanco(){
        try{
            if (!con.isClosed()){
                JOptionPane.showMessageDialog(null,"Desconectado com sucesso");
                con.close();
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao desconectar.", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
}


