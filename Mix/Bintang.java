import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan simbol = ");
        String a = input.next();

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a);
            }
            System.out.println();
        }

    }
    
}
