import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_random = 1;
        int n_tentativa = 0;
        while(num_random != n_tentativa){
            System.out.println("Escolha um número inteiro de 1-100, se for o mesmo que o meu, você ganhará um parabéns");
            n_tentativa = sc.nextInt();
        }
        System.out.println("Parabéns, você acertou!");
    }
}
