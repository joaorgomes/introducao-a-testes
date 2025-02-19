package br.edu.ifpb.testeunitario.service;

import java.util.function.BooleanSupplier;

import org.springframework.stereotype.Service;

@Service
public class ExemploService {
    public int somaValores(int x, int y) {
        return x + y;
    }

    public boolean verificarSeMaiorQue(int i, int j) {
        if (i > j) {
            return true;
        }
        return false;
    }

    public Object verificarNulo(Object object) {
        return object;
    }
    public void checarTimeout() throws InterruptedException{
        System.out.println("indo dormir por 5 segundos");
        Thread.sleep(5000);
        System.err.println("acordei");

    }

}
