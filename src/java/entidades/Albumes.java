/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guille
 */
@Entity
@Table(name = "albumes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Albumes.findAll", query = "SELECT a FROM Albumes a")
    , @NamedQuery(name = "Albumes.findById", query = "SELECT a FROM Albumes a WHERE a.id = :id")
    , @NamedQuery(name = "Albumes.findByTitulo", query = "SELECT a FROM Albumes a WHERE a.titulo = :titulo")})
public class Albumes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TITULO")
    private String titulo;
    @JoinColumn(name = "AUTOR", referencedColumnName = "id")
    @ManyToOne
    private Grupos autor;

    public Albumes() {
    }

    public Albumes(Integer id) {
        this.id = id;
    }

    public Albumes(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Grupos getAutor() {
        return autor;
    }

    public void setAutor(Grupos autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Albumes)) {
            return false;
        }
        Albumes other = (Albumes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Albumes[ id=" + id + " ]";
    }
    
}
