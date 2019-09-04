import java.util.Scanner;
class LatihanMod{
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        int a = cd.nextInt();
        int b = cd.nextInt();
        int hasil = a % b;
        System.out.println("hasil " + hasil);
    }
}