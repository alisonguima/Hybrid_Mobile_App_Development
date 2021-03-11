package br.com.fiap.transicaojavaparakotlin;

public class PessoaJava {

    private String nome;
    private String email;

    public PessoaJava() { }

    public PessoaJava(String nome, String email) {
        this.nome = nome;
        this.email = email;

        Pessoa pessoa = new Pessoa("Alison", "teste123@fulano.com");
        pessoa.setNome("teste1@beltrano.com");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
