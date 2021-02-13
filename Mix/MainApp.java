public class MainApp{
    public static void main(String [] args){
        Employee employee = new Employee();

        int a = 4;
        double konversi = a;

        if (a == 5){
            System.out.println("Perulangan Pertama");
            for (int b = 0; b < 5; b++ ){
                System.out.println("Perulangan didalam percabangan pertama");
            }
        }else if(a == 4){
           for (int c = 0; c < 5; c++){
            System.out.println("Perulangan didalam percabangan kedua");
           }
        }else{
            System.out.println("default percabangan");
        }

        System.out.println(a);
        System.out.println(konversi);
       
        employee.fungsi("Hello World!");


    }
}