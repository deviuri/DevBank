package dominio;

public enum TipoConta{
    PESSOA_FISICA((1),"PESSOA_FISICA"),
    PESSOA_JURIDICAO((2), "PESSOA_JURIDICA"){
    };
    private int valor;
    private String tipo;
    private String cnpj;
    TipoConta(int valor, String tipo, String cnpj){
        this.tipo = tipo;
        this.valor = valor;
        this.cnpj = cnpj;
    }
    TipoConta(int valor, String tipo){
        this.tipo = tipo;
        this.valor = valor;
    }

}
