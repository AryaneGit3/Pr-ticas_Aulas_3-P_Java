/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;


/**
 *
 * @author aryan
 */
public class TesteTransfere {
    public static void main(String[] args){
    Conta minhaConta = new Conta();
    Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor para depósito para minha conta:");
        minhaConta.deposita(entrada.nextDouble());
        
        Conta outraConta = new Conta();
        System.out.println("Digite um valor para deposito outra conta:");
        outraConta.deposita(entrada.nextDouble());
        
        System.out.println("Digite um valor para transferencia outra conta:");
        minhaConta.transfere(outraConta, entrada.nextDouble());
        System.out.println("Saldo da minha conta:" +minhaConta.getSaldo());
        System.out.println("Saldo outra conta:" +outraConta.getSaldo());
    
} // fim public static
} // fim public void
    

