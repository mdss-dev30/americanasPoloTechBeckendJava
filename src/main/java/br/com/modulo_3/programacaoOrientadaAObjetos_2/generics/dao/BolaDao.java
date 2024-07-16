package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.dao;


import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Bola;

public class BolaDao extends AbstractDao<Bola, Long> implements DeleteAllDao {

    // Utiliza da composição para ganhar os comportamentos de quem implementar DeleteAllDao
    private final DeleteAllDao deleteAllDao;

    public BolaDao(DeleteAllDao deleteAllDao) {
        this.deleteAllDao = deleteAllDao;
    }


    @Override
    public void deleteAll() {
        // delega a execução do método deleteAll para o objeto adicionado via composição
        deleteAllDao.deleteAll();
    }
}
