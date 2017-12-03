/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entidades.Grupos;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.ejb.Stateless;


/**
 *
 * @author guille
 */
@Stateless
public class NewSessionBean {
    
    @PersistenceUnit
    EntityManagerFactory emf;
    
    public List findAll(){ 
    return emf.createEntityManager().createNamedQuery("Albumes.findAll").getResultList();
    }
    
    public List findAllGrupos(){ 
    return emf.createEntityManager().createNamedQuery("Grupos.findAll").getResultList();
    }
    
    public void insertGrupos(Grupos gru){
        emf.createEntityManager().persist(gru);
    }
    
    public void deleteGrupos(String id){
        System.out.println(id);
        List g = emf.createEntityManager().createNamedQuery("Grupos.findById").setParameter("id", id).getResultList();
        emf.createEntityManager().remove(g.get(0));
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
