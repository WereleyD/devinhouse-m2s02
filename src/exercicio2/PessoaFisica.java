package exercicio2;

public class PessoaFisica {
    private String cpf;
    private String nome;
    public PessoaFisica(String cpf, String nome) {
        if(cpf.length() == 11) {
            this.cpf = cpf;
            this.nome = nome;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
