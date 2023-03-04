package main;

import dominio.Cliente;
import dominio.Conta;
import dominio.TipoConta;

public class executaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Iuri Martins", "12345678945");
        Conta conta = new Conta(4561, 4587, cliente, TipoConta.PESSOA_FISICA);
    }
}
