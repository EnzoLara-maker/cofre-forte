package br.com.banco.main;

import br.com.banco.model.Agencia;
import br.com.banco.model.Cliente;
import br.com.banco.model.ContaBancaria;

public class MainTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("111.222.333-44", "Ana Silva", "ana@email.com");
        Cliente cliente2 = new Cliente("111.222.333-44", "Ana S.", "ana.silva@email.com");

        if (cliente1.equals(cliente2)) {
            System.out.println("Os clientes sao IGUAIS (mesmo CPF).");
        } else {
            System.out.println("Os clientes sao DIFERENTES.");
        }

        ContaBancaria conta = new ContaBancaria("0001-9", cliente1, 50.0);

        boolean sucesso = conta.sacar(50.0);
        System.out.println("Saque de 50.0 realizado com sucesso? " + sucesso);
        System.out.println("Saldo atual: " + conta.getSaldo());

        System.out.println("Banco: " + Agencia.NOME_BANCO);
        System.out.println("Total de contas abertas: " + Agencia.getTotalContasAbertas());
    }
}
