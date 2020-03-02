/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

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
    }
}
