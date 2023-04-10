/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tp4banque.ejb;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import mg.itu.tp4banque.entities.CompteBancaire;

/**
 *
 * @author tomik
 */
@DataSourceDefinition(
        className = "com.mysql.cj.jdbc.MysqlDataSource",
        name = "java:app/jdbc/banque",
        serverName = "localhost",
        portNumber = 3306,
        user = "root",
        password = "mysql008",
        databaseName = "banque",
        properties = {
            "useSSL=false",
            "allowPublicKeyRetrieval=true"
        }
)
@Stateless
public class GestionnaireCompte {

    @PersistenceContext(unitName = "banquePU")
    private EntityManager em;

    public void persist(CompteBancaire compteBancaire) {
        em.persist(compteBancaire);
    }

    public List<CompteBancaire> getAllCompteBancaire() {
        Query query = em.createQuery("select e from CompteBancaire e");
        return query.getResultList();
    }
    
    public Long count(){
        String rqt = "select count(c) from CompteBancaire c";
        Query query = em.createQuery(rqt);
        return (Long) query.getSingleResult();        
    }
    
    public CompteBancaire findCompte(int id){
        return em.find(CompteBancaire.class, id);
    }
}
