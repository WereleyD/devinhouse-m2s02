package exercicio3;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(15.5, 10.9);
        System.out.println("Comprimento: " + ret.getComprimento());
        System.out.println("Largura: " + ret.getLargura());
        System.out.printf("Área: %.2f\n", ret.getArea());
        System.out.println("Perímetro: " + ret.getPerimetro());

        ret.setComprimento(10);
        ret.setLargura(19.5);
        System.out.println(ret.getComprimento());
        System.out.println(ret.getLargura());
    }
}
