
package com.mycompany.mavenproject3;

/**
 *
 * @author Thanyla
 */
public class Boleto {
    private int id;
    private String agencia;

    public Boleto(int id, String agencia) {
        this.id = id;
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", agencia=" + agencia + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    
}
