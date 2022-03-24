package estudojpa;

import estudojpa.entidades.Cidades;
import estudojpa.entidades.Estados1;
import estudojpa.entidades.Governador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class EstudoJPA {

    private static final String
            NOME_UNIDADE_PERSISTENCIA = "EstudoJPAPU";
    
    public static void main(String[] args) {
        
        String saida = "";
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(NOME_UNIDADE_PERSISTENCIA);
        EntityManager manager = factory.createEntityManager();
        
        Cidades cidLondrina = new Cidades();
        cidLondrina.setNome("Sao Paulo");
        
        Cidades cidMaringa = new Cidades();
        cidMaringa.setNome("Maringa");
        
        Governador gov = new Governador();
        gov.setNome("Beto Richa");
        
        
        
        Estados1 ufPR = new Estados1();
        
        ufPR.setUnidade_federativa("PR");
        ufPR.setGovernador(gov);
        ufPR.setNome("Parana");
        ufPR.getCidades().add(cidMaringa);
        ufPR.getCidades().add(cidLondrina);
        
        manager.getTransaction().begin();
        manager.persist(ufPR);
        manager.getTransaction().commit();
        
        saida += "Dados do Estado: ";
        saida += "\nID: " + ufPR.getId();
        saida += "\nNome: " + ufPR.getNome();
        saida += "\nUF: " + ufPR.getUnidade_federativa();
        saida += "\nID Governador: " + ufPR.getGovernador().getId();
        saida += "\nNome Governando: " + ufPR.getGovernador().getNome();
        
        List<Cidades> listaCidades = ufPR.getCidades();
        
        
        for(int i = 0;i < listaCidades.size(); i++){
            Cidades Cidades = listaCidades.get(i);
            
            saida += "\nID: " + Cidades.getId() + "- Nome: " + Cidades.getNome();
            
        }
        
        manager.close();
        factory.close();
        
        JOptionPane.showMessageDialog(null, saida, "Estudo JPA", JOptionPane.INFORMATION_MESSAGE);
        
     

    }
    
}
