import java.util.Scanner;
class test1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan Nilai n =");
        int n = input.nextInt();
        int tampung = n %2  ;
        //case1 dan case2//
        // if(tampung == 1){
        //     System.out.println("N adalah Bilangan ganjil");
        // }
        // else{
        //     System.out.println("N adalah Bilangan genap");
        // }

        //case3//
        // if(n > 10 && tampung == 1){
        //     System.out.println("N adalah Bilangan ganjil yang lebih besar dari 10");
        // } 
        // else if(n < 10 && tampung == 1){
        //     System.out.println("N adalah bilangan ganjil yang lebih kecil dari 10");
        // }
        // else if(n > 10 && tampung == 0){
        //     System.out.println("N adalah bilangan genap yang lebih besar dari 10");
        // }
        // else{
        //     System.out.println("N adalah bilangan genap yang lebih kecil dari 10");
        // }

        //case4//
        if(tampung == 1){
            if(n >= 10 && n < 100){
                System.out.println("ganjil dan kurang dari 100");
            } else if(n >= 10 && n > 100){
                System.out.println("ganjil dan lebih dari 100");
            } else{
                System.out.println("ganjil dan kurang dari 10");
            } 
        }
        else{
            if(n >= 10 && n < 100){
                System.out.println("genap dan kurang dari 100");
            } else if(n >= 10 && n > 100){
                System.out.println("genap dan lebih dari 100");
            } else{
                System.out.println("genap dan kurang dari 10");
            }
        }

    }
}