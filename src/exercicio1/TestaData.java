package exercicio1;


import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {
        Data data = new Data(19, 9, 1965);
        System.out.println("Dia: " + data.getDia());
        System.out.println("Mês: " + data.getMes());
        System.out.println("Ano: " + data.getAno());

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        data.setDia(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite um mês: ");
        data.setMes(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite um ano: ");
        data.setAno(Integer.parseInt(sc.nextLine()));

        System.out.println(data.exibirData());
    }
}