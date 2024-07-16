package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.dao;

public interface Dao<T, K> {

    T create(T objectDao);

    T findById(K id);

    void update(T objectDao);

    boolean delete(K id);

}
