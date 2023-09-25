package exercicio4;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura fat = new Fatura("0123", "Placa de Vídeo", 6, 2290.90);
        System.out.println("Número: " + fat.getNumero());
        System.out.println("Descrição: " + fat.getDescricao());
        System.out.println("Preço: " + fat.getPreco());
        System.out.println("Quantidade :" + fat.getQuantidade());
        System.out.printf("Valor da Fatura: %.2f", fat.getValorFatura());
    }
}
