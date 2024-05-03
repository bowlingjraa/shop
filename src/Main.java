import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) {
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;
        int menu5 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rub a rai dee kaaaa");
        System.out.println("1.ชีสเค้ก\n 2.ชาไทย\n 3.ไก่ย่าง\n 4.น้ำเปล่า\n 5.ช็อคโกแลต");
        for (int menuNumber = scanner.nextInt(); menuNumber != 5; ) {
            if (menuNumber == 1) {
                menu1 = menu1 + 1;
            } else if (menuNumber == 2) {
                menu2 = menu2 + 1;
            } else if (menuNumber == 3) {
                menu3 = menu3 + 1;
            } else if (menuNumber == 4) {
                menu3 = menu4 + 1;
            }
            System.out.println("1.ชีสเค้ก\n 2.ชาไทย\n 3.ไก่ย่าง\n 4.น้ำเปล่า\n 5.ช็อคโกแลต");
            menuNumber = scanner.nextInt();
        }
    }
}