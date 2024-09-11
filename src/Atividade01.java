import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        double n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número que deseja saber sua tabuada do 1-10: ");
        n = sc.nextDouble();
        for(int i = 1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
