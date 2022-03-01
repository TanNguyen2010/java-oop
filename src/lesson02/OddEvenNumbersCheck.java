package lesson02;

import java.util.Scanner;

public class OddEvenNumbersCheck {
    public static void main(String[] args) {
        System.out.println("Đây là ứng dụng kiểm tra số chẵn hay lẻ");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("\tHãy nhập số muốn kiểm tra: ");
        float number = scanner.nextFloat();

        //Cac bước tính để kiểm tra
        float du = number%2;

        //Ket luan
        if (du == 0){
            System.out.println("\t\t\t-->Đây là số chẵn.");
        }else{
            System.out.println("\t\t\t-->Đây là số lẻ.");
        }
    }
}
