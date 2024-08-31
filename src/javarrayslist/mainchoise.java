package javarrayslist;

import java.util.ArrayList;
import java.util.Scanner;

public class mainchoise {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("------menu------");
            System.out.println("1. nhap mang");
            System.out.println("2. xuat mang");
            System.out.println("3. so lon thu 2");
            System.out.println("4. xoa so le");
            System.out.print("moi ban nhap : ");
            int luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon) {
                case 1 ->
                    arrayList = list.importData(arrayList);
                case 2 ->
                    list.printData(arrayList);
                case 3 -> {
                    System.out.println("So lon thu 2 la: " + list.Max(arrayList));
                }
                case 4 ->
                    list.deleteOddNumber(arrayList);
                default ->
                    System.out.println("lua chon khong hop le ");
            }
            System.out.println("nhan y de tiep tuc chuong trinh");
            check = scanner.nextLine();
        } while (check.equals("y"));
    }
}
