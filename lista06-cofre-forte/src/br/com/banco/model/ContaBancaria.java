package br.com.banco.model;

public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    private Cliente titular;

    public ContaBancaria(String numeroConta, Cliente titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
        // Toda conta criada deve se registrar na Agencia (RN03)
        Agencia.registrarNovaConta();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Sem setSaldo(): saldo só muda via depositar()/sacar() (RN03)

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        double total = valor + Agencia.TAXA_SAQUE;
        if (saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }
}
