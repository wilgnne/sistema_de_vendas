/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tampelini
 */
public class Fornecedor extends Cliente {

    //atributos
    private String cnpj;

    @Override
    public String isValid() {
        String clientPart = super.isValid();
        if (clientPart != null && !clientPart.equals("Insira um cpf")) {
            return clientPart;
        }
        

        if (cnpj.equals("  .   .   /    -  ")) {
            return "Insira um cnpj";
        }

        return null;
    }

    //getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
