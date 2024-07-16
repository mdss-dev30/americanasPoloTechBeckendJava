package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.repository;

import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.modelo.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRepository {
    List<Carro> carros = new ArrayList<>();

    public void save(Carro carro){
        carros.add(carro);
    }

    public List<Carro> findAll(){
        return carros;
    }
}
