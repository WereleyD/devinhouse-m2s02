package exercicio2;

public class TestaPessoaFisica {
    public static void main(String[] args) {
        PessoaFisica pf  = new PessoaFisica("04304335065", "Wesley Valmir Dieterich");

        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Nome: " + pf.getNome());
    }
}
