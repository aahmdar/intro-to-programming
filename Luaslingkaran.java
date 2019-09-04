import java.util.Scanner;
class Luaslingkaran{
    public static void main(String[] args) {
    Scanner cd = new Scanner(System.in);
    System.out.println("masukkan jari-jari= ");
    double jari = cd.nextDouble();
    double luas = Math.PI * Math.pow(jari, 2);
    //double keliling = 2 * Math.PI * jari;
    System.out.println("luas lingkaran adalah " + luas);
    //System.out.println("keliling lingkaran adalah "+ keliling);
    // System.out.printf("%.3f\n",luas); //format float
    //System.out.printf("%.3f\n",keliling);
    }
}