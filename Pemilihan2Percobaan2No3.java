import java.util.Scanner;
public class Pemilihan2Percobaan2No3 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Masukkan sudut 1");
        sudut1 = input03.nextInt();
        System.out.println("Masukkan sudut 2");
        sudut2 = input03.nextInt();
        System.out.println("Masukkan sudut 3");
        sudut3 = input03.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 99) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else 
        System.out.println("Bukan segitiga");
        

    }
}