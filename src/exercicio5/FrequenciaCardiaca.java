package exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.parse(dataNascimento);
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento);
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
}
