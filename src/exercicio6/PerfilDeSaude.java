package exercicio6;

import java.time.LocalDate;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        LocalDate current = LocalDate.now();
        return current.getYear() - dataNascimento.getYear();
    }
    public int fcMaxima() {
        return 220 - getIdade();
    }
    public String fcAlvo() {
        double freqAlvo1 = fcMaxima() * 0.5;
        double freqAlvo2 = fcMaxima() * 0.85;
        return freqAlvo1 + " - " + freqAlvo2;
    }
    public double getImc() {
        return peso / (altura * altura);
    }
}
