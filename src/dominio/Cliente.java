package dominio;

public class Cliente extends Conta{

    private String nome;
    private String cpf;
    private String cnpj;

    public Cliente(String nome, String cpf) {
        if (cpf.length() < 11 || cpf.length() > 11){
            System.out.println("Digite apenas os 11 números de seu cpf");
        }else {
            this.cpf = cpf;
        }
        this.nome = nome;
    }
    public Cliente(){
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
