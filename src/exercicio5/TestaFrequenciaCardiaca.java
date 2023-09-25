package exercicio5;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {
        FrequenciaCardiaca fc = new FrequenciaCardiaca("Wesley", "Dieterich", "1999-09-09");
        System.out.println("Nome completo: " + fc.getNome() + " " + fc.getSobrenome());
        System.out.println("Data de nascimento: " + fc.getDataNascimento());
        System.out.println("Idade: " + fc.getIdade() + " anos");
        System.out.println("Frequência cardíaca máxima: " + fc.fcMaxima());
        System.out.println("Alvo de frequência cardíaca: " + fc.fcAlvo());
    }
}
