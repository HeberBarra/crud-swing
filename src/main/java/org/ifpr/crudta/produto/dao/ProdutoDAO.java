package org.ifpr.crudta.produto.dao;

import jakarta.persistence.Query;
import org.ifpr.crudta.banco.GenericDAO;
import org.ifpr.crudta.produto.Produto;

import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }

    @SuppressWarnings("unchecked")
    public List<Produto> listLastTwenty() {
        entityManager.clear();
        String hql = "from Produto p order by p.id desc";
        Query queryList = entityManager.createQuery(hql);
        queryList.setMaxResults(20);
        return queryList.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Produto> searchByName(String name) {
        String hql = "from Produto p where p.nome like concat('%', :nome, '%') order by p.nome asc";
        Query querySearch = entityManager.createQuery(hql);
        querySearch.setParameter(":nome", name);
        return querySearch.getResultList();
    }

}
