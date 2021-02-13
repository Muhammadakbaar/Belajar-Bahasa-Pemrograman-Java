import java.util.Scanner;

public class Percabangan {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka = ");
        int a = input.nextInt();
        if (a <= 5){
            for (int i = 0; i < 5; i++){
                System.out.println(i);
            }
        }
        else if (a == 10){
            System.out.println("Nilai b = " + a);
        }else{
            System.out.println("Nilai dua-duanya salah");
        }
    }
    
}
