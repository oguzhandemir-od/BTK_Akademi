import matematik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınız: ");

        String isim=scanner.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem=new DortIslem();
        dortIslem.Topla(5,6);

        Logaritma logaritma=new Logaritma();

    }
}