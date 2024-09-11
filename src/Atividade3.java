import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 0;
        System.out.println("Digite um número que deseja saber seu fatorial");
        n = sc.nextInt();
        i = n-1;
        do {
            n = n * i;
            i--;
        } while(i != 1);
        System.out.println(n);
    }
}
