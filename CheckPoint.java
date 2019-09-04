import java.util.Scanner;
class CheckPoint{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka x =");
        int x = input.nextInt();
        System.out.println("masukkan angka y =");
        int y = input.nextInt();

        //case5//
        if(y %x == 0){
            System.out.println("x kelipatan y");
        }
        else{
            System.out.println("x bukan kelipatan y");
        }

        //System.out.println("masukkan angka z =");
        //int z = input.nextInt();
        // double tampung = (x + y + z)/3;
        // if(x > y && x > z ){
        //     System.out.println(x + " angka Terbesar");
        //     if(y > z){
        //         System.out.println(z + " angka terkecil");
        //     }
        //     if(z > y){
        //         System.out.println(y + " angka terkecil");
        //     }
        //     System.out.println("rata-ratanya = " + tampung);
        // }
        // else if(y > x && y > z){
        //     System.out.println(y + " angka Terbesar");
        //     if(x > z){
        //         System.out.println(z + " angka terkecil");
        //     }
        //     if(z > x){
        //         System.out.println(x + " angka terkecil");
        //     }
        //     System.out.println("rata-ratanya = " + tampung);
        // }
        // else if(z > x && z > y){
        //     System.out.println(z + " angka Terbesar");
        //     if(y > x){
        //         System.out.println(x + " angka terkecil");
        //     }
        //     if(x > y){
        //         System.out.println(y + " angka terkecil");
        //     }
        //     System.out.println("rata-ratanya = " + tampung);
        // }


        // int flag,pangkat,jumlah;
        // flag = 0;
        // pangkat = 5;
        // jumlah = 1;
        // while(flag < 5){
        //     jumlah *= pangkat;
        //     flag++;
        //     System.out.println(jumlah);
    }
}
