import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        int id = -1;
        Scanner sc = new Scanner(System.in);
        while(id<0){
            System.out.println("Digite uma idade: ");
            id = sc.nextInt();
        }
    }
}
