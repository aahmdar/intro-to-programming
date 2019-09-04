import java.util.Scanner;
class test{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan alas");
    int alas = input.nextInt();
    System.out.println("masukkan tinggi");
    int tinggi = input.nextInt();
    int hasil;
    hasil = (alas * tinggi)/2;
    System.out.println(hasil + " = luas segitiga"); 
    }
}