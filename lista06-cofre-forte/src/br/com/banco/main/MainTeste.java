package br.com.banco.main;

import br.com.banco.model.Agencia;
import br.com.banco.model.Cliente;
import br.com.banco.model.ContaBancaria;

public class MainTeste {

    public static void main(String[] args) {

        // 1. Dois clientes diferentes, mesmo CPF
        Cliente cliente1 = new Cliente("111.222.333-44", "Ana Silva", "ana@email.com");
        Cliente cliente2 = new Cliente("111.222.333-44", "Ana S.", "ana.silva@email.com");

        // 2. Teste de igualdade (RN02)
        if (cliente1.equals(cliente2)) {
            System.out.println("Os clientes sao IGUAIS (mesmo CPF).");
        } else {
            System.out.println("Os clientes sao DIFERENTES.");
        }

        // 3. Conta com saldo de 50.0
        ContaBancaria conta = new ContaBancaria("0001-9", cliente1, 50.0);

        // 4. Saque de 50.0 deve falhar (falta cobrir a taxa)
        boolean sucesso = conta.sacar(50.0);
        System.out.println("Saque de 50.0 realizado com sucesso? " + sucesso);
        System.out.println("Saldo atual: " + conta.getSaldo());

        // 5. Total de contas abertas
        System.out.println("Banco: " + Agencia.NOME_BANCO);
        System.out.println("Total de contas abertas: " + Agencia.getTotalContasAbertas());
    }
}
