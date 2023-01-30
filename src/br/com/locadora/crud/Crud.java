package br.com.locadora.crud;

import java.util.List;

import br.com.locadora.interfaces.ICrud;

public class Crud {

    public <T extends ICrud> void inserir(T obj, List<? super T> lista) {
        lista.add(obj);
    }

    // public void ler(int id, List<? extends ICrud> lista) {
    //     for(ICrud elemento : lista) {
    //         if(elemento.getId() == id) {
    //             System.out.println(elemento.toString());
    //         }
    //     }
    // }
    
    public <T extends ICrud> T ler(int id, List<T> lista) {
        for(T elemento : lista) {
            if(elemento.getId() == id) {
                return elemento;
            }
        }
        return null;
    }

    public <T extends ICrud, S extends T> void atualizar(S atualizado, List<T> lista) {
        int index;
        for(index = 0; index < lista.size(); index++) {
            if(lista.get(index).getId() == atualizado.getId()) {
                break;
            }
        }
        if(index != lista.size()) {
            lista.remove(index);
            lista.add(index, atualizado);
        }
    }

    public void deletar(int id, List<? extends ICrud> lista) {
        int index;
        for(index = 0; index < lista.size(); index++) {
            if(lista.get(index).getId() == id) {
                break;
            }
        }
        lista.remove(index);
    }
}
