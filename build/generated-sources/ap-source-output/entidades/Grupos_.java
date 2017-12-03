package entidades;

import entidades.Albumes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-03T17:41:56")
@StaticMetamodel(Grupos.class)
public class Grupos_ { 

    public static volatile SingularAttribute<Grupos, Integer> id;
    public static volatile SingularAttribute<Grupos, String> nombre;
    public static volatile CollectionAttribute<Grupos, Albumes> albumesCollection;

}