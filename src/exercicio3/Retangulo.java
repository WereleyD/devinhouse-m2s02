package exercicio3;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        if(comprimento > 0 && largura > 0 && comprimento < 20 && largura < 20) {
            this.comprimento = comprimento;
            this.largura = largura;
        } else {
            System.out.println("Largura ou comprimento inválidos.");
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if(comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Comprimento inválido.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura > 0 && largura < 20) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida.");
        }
    }
    public double getPerimetro () {
        return 2 * (comprimento + largura);
    }
    public double getArea () {
        return comprimento * largura;
    }
}
