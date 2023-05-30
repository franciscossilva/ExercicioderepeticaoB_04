import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int quantidade = input.nextInt();

        int soma = 0;
        int contador = 1;
        while (contador <= quantidade) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = input.nextInt();
            soma += numero;
            contador++;
        }

        double media = (double) soma / quantidade;
        System.out.println("A média é: " + media);
    }
}