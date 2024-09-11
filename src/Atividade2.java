import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número inteiro que deseja saber sua contagem até '0': ");
        num = sc.nextInt();
        while(num!=0){
            System.out.println(num-1);
            num = num-1;
        }
    }
}
