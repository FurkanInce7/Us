import java.util.Scanner;
public class Us {
    public static void main(String[] args) {
        int k,r ,total=1 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Ussu alinacak sayi: ");
        k= input.nextInt();
        System.out.println("Us olacak sayi: ");
        r = input.nextInt();

        for (int i = 1 ; i <= r ; i++) {
            total *=k ;
        }
        System.out.println("Cevap : "+ total);
    }
}
