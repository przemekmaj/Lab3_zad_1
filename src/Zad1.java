import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        enum LiczbyEnum{
            Jeden, Dwa, Trzy, Cztery, Piec, Szesc
        }

        enum StatusEnum{
            KONTYNUUJEMY, KONIEC
        }

        boolean x = true;
        while(x){
            switch (scanner.nextInt()) {
                case 0 -> {
                    System.out.println(StatusEnum.KONIEC);
                    x = false;
                }
                case 1 -> {
                    System.out.println(LiczbyEnum.Jeden);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
                case 2 -> {
                    System.out.println(LiczbyEnum.Dwa);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
                case 3 -> {
                    System.out.println(LiczbyEnum.Trzy);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
                case 4 -> {
                    System.out.println(LiczbyEnum.Cztery);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
                case 5 -> {
                    System.out.println(LiczbyEnum.Piec);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
                case 6 -> {
                    System.out.println(LiczbyEnum.Szesc);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
                default -> {
                    System.out.println("Dla podanej liczby nie ma enuma.");
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }
            }
        }
    }
}
