
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
    
    public ProcessarBoletos(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }

    public void processar(String nomeArquivo){
        System.out.println("Iniciando processamento do arquivo");
        List<Boleto> boletos = lerArquivo.apply(nomeArquivo);
        boletos.forEach(boleto -> System.out.println(boleto));
    }
    
    public void setLerArquivo(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }
}
