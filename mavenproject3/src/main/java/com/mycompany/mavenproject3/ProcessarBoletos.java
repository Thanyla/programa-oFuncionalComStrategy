
package com.mycompany.mavenproject3;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Thanyla
 */
public class ProcessarBoletos {
    //Criação de função e utilização de genericos para expecificar o tipo da função
    //Primeiro generico especifica o tipo de entrada e o segundo o retorno 
    private Function<String, List<Boleto>> lerArquivo;
    
    public void processar(String nomeArquivo){
        System.out.println("Iniciando processamento do arquivo");
        List<Boleto> boletos = lerArquivo.apply(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }
    }
}
