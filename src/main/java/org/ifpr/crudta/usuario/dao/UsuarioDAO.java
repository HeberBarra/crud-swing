package org.ifpr.crudta.usuario.dao;

import jakarta.persistence.Query;
import org.ifpr.crudta.banco.GenericDAO;
import org.ifpr.crudta.usuario.Usuario;

import java.util.List;

public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> listLastTwenty() {
        String hqlList = "from Usuario u order by u.id desc";
        Query query = entityManager.createQuery(hqlList);
        query.setMaxResults(20);
        return query.getResultList();
    }

}
