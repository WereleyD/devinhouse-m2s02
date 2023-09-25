package exercicio6;

public class TestarPerfilDeSaude {
    public static void main(String[] args) {
        PerfilDeSaude ps = new PerfilDeSaude("Wesley", "Dieterich", "Masculino", "1999-09-09", 1.82, 80.0);
        System.out.println("Nome Completo: " + ps.getNome() + " " + ps.getSobrenome());
        System.out.println("Sexo: " + ps.getSexo());
        System.out.println("Data de nascimento: " + ps.getDataNascimento());
        System.out.println("Idade: " + ps.getIdade() + " anos");
        System.out.println("Frequência cardíaca máxima: " + ps.fcMaxima());
        System.out.println("Alvo de frequência cardíaca: " + ps.fcAlvo());
        System.out.printf("IMC: %.2f", ps.getImc());
    }
}
