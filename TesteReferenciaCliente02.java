/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author aryan
 */
public class TesteReferenciaCliente02 {
    public static void main(String[] args) {
        Conta c2 = new Conta();// criando nova conta
        Cliente cli2 = new Cliente(); // criando novo cliente
        c2.setObjCliente2(cli2);
        c2.objCliente2.nome = "Pedro Sampaio"; // definindo nome do cliente 2
        System.out.println("Cliente 02:" +c2.getObjCliente2().getNome()); // publicando o nome do cliente 2
     
}
    
}
