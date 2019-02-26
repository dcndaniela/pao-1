import java.util.Scanner;//un fel de include;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Hello! Say something");
        //int a = 5, b = 10;
        //int sum = a + b;
      //  System.out.println("Suma numerelor " + a + " si " + b + " este: " + sum); // + concateneaza stringuri
        Scanner scanner= new Scanner(System.in); // se creeaza obiectul scanner
     String ceAmCititDinConsola= scanner.nextLine();//cu nextLine citesc toata linia pana la Enter
     System.out.println("Am citit:"+ceAmCititDinConsola);


    //citim actiuni: 0-exit, 1-suma, 2-diferenta

    System.out.println("citim actiuni:0-exit, 1-suma, 2-diferenta");
            int CeAmCititDinScanner=scanner.nextInt();
            if(CeAmCititDinScanner==0)
                System.out.println("am citit exit");
            else
                System.out.println("Am citit altceva");





    }
}
