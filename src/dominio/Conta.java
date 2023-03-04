package dominio;

import java.util.Scanner;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;
    public Conta(int numero, int agencia, Cliente cliente, TipoConta tipoConta) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        if (tipoConta.equals(TipoConta.PESSOA_JURIDICAO)){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite seu cnpj");
            String cnpj = entrada.nextLine();
            if (cnpj.length() > 14 || cnpj.length() < 14){
                System.out.println("Seu cnpj não pode ser menor que 14 digitos");
                System.out.println("Repita seu cnpj");
                cliente.setCnpj(entrada.nextLine());
            }else {
                cliente.setCnpj(cnpj);}
            contaCriada();
        }else {
            contaCriada();
        }
    }
    public Conta(){
    }
    public void contaCriada(){
        System.out.println("Você acabou de criar uma conta");
        System.out.println("---------------------------------------------");
        System.out.println("Segue os dados de sua conta: ");
        System.out.println("Número da conta: "+getNumero());
        System.out.println("Agência da conta: "+getAgencia());
        System.out.println("Seu nome: "+ cliente.getNome());
        if (tipoConta.equals(TipoConta.PESSOA_FISICA)){
            System.out.println("Seu cpf: "+ cliente.getCpf().substring(0, 3)
                    + "." + cliente.getCpf().substring(4, 6)
                    + "." + cliente.getCpf().substring(7, 9) + "-" + cliente.getCpf().substring(10, 11));
        }else {
            System.out.println("Seu cpf: "+ cliente.getCpf().substring(0, 3)
                    + "." + cliente.getCpf().substring(4, 6)
                    + "." + cliente.getCpf().substring(7, 9) + "-" + cliente.getCpf().substring(10, 11));

            System.out.println("Seu cnpj: "+ cliente.getCnpj().substring(0, 2)
                    + "." + cliente.getCnpj().substring(3, 5)
                    + "." + cliente.getCnpj().substring(6, 8) + "/" + cliente.getCnpj().substring(9, 12) + "-" + cliente.getCnpj().substring(13, 14));
        }
        System.out.println("Você é do tipo: "+ tipoConta);
        System.out.println("---------------------------------------------");

    }
    public Cliente getCliente() {
        return cliente;
    }
    public int getNumero() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public TipoConta getTipoConta() {
        return tipoConta;
    }
    public void tranferir(double valor, Cliente cliente){
            cliente.depositar(valor);
            cliente.sacar(valor);
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }else {
            System.out.println("O valor tem que ser maior que 0");
        }
    }
    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
