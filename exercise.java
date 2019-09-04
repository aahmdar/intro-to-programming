import java.util.Scanner;
class exercise{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan kehadiran = ");
        int kehadiran = input.nextInt();
        double persenKehadiran = (kehadiran*100)/16;
        System.out.println("mengikuti praktikum?");
        boolean praktikum = input.nextBoolean();
        System.out.println("nilai Tugas");
        int nilaiTugas = input.nextInt();
        System.out.println("nilai Kuiz");
        int nilaiKuiz = input.nextInt();
        System.out.println("nilai Mid");
        int nilaiMid = input.nextInt();
        System.out.println("nilai final");
        int nilaiFinal = input.nextInt();
        double totalNilai = (nilaiTugas*0.2 + nilaiKuiz*0.25 + nilaiMid*0.25 + nilaiFinal*0.30);

        if(persenKehadiran >= 80){
            if(praktikum == true){
                if(totalNilai >= 45){
                    System.out.println("anda dinyatakan Lulus, nilai anda = " + totalNilai);
                }else{
                    System.out.println("tidak lulus, " + totalNilai + "nilai kurang dri 45");
                }
            }
            else{
                System.out.println("tidak lulus, tidak ikut praktikum");
            }
        }else{
            System.out.println("Tidak lulus , "+ persenKehadiran + " ,kehadiran di bawah 80%");
        }


    }




}