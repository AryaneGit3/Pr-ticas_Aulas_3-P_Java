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
public class TesteReferenciaCliente {
    public static void main(String[] args) {
        Conta c1 = new Conta(); // criando nova conta
       
        c1.getObjCliente().setNome("Paola Dias");
        System.out.println("Nome:"+c1.getObjCliente().getNome()); // coloquei o get pq objCliente esta como private
        c1.deposita(500);
        
    }
    
}
