/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Thanyla
 */
public class Principal {
    public static void main(String[] args) {
        // Utilizando :: não chama a função e sim informa da existencia da função
        ProcessarBoletos  processar = new ProcessarBoletos(LeituraRetorno::lerArquivoBB);
        processar.processar("banco-brasil-1.csv");
        processar.setLerArquivo(LeituraRetorno::lerArquivoBradesco);
        processar.processar("bradesco.csv");
        
        //Exemplo de padrão satrategy dentro das bibliotecas java, no caso na List, no método comparator
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto (1, "234"));
        boletos.add(new Boleto (2, "553"));
        boletos.add(new Boleto (2, "423"));
        boletos.add(new Boleto (4, "545"));
        
        boletos.sort(
                Comparator.comparingInt(Boleto::getId)
                .thenComparing(Boleto::getAgencia)
        );
        System.out.println(boletos);
        
    }
}
