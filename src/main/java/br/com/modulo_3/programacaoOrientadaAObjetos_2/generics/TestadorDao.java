package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics;

import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.dao.AnimalDao;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.dao.BolaDao;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.dao.CanetaDao;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.dao.DeleteAll;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Animal;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Bola;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Cachorro;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Caneta;

import java.util.UUID;

public class TestadorDao {

    public static void main(String[] args) {

        AnimalDao animalDao = new AnimalDao();
        BolaDao bolaDao = new BolaDao(new DeleteAll());
        CanetaDao canetaDao = new CanetaDao();
        
        animalDao.create(new Cachorro());
        bolaDao.create(new Bola());
        canetaDao.create(new Caneta());
        
        
        // não precisa realizar o casting
        Animal animal = animalDao.findById(UUID.randomUUID().toString());
        Bola bola = bolaDao.findById(1000L);
        Caneta caneta = canetaDao.findById(1);


    }
    
    
}
