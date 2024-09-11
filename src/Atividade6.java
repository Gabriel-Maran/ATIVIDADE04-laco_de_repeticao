import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double num_random = 0;
        double soma = 0;
        System.out.println("Digite um número inteiro: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Informe outro número: ");
            num_random = sc.nextDouble();
            soma = soma + num_random;
        }
        System.out.println("A media dos número digitados a partir do segundo número é: "+soma/n);
    }
}
