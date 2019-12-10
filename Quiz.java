import java.util.Scanner;
import java.lang.*;

class Quiz {
    public static void tamplian5Kali() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = keyboard.nextLine();

        for(int i = 0; i <= 5; i++){
            System.out.println((i + 1) + ". " + kata);
        }
    }
    
    public static float luasLingkaran(float x){
        float pi = 22/7;
        return pi * (x * x);
    }

    public static void gradeNilai(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = keyboard.nextInt();
        System.out.println("Nilai: ");
        if(nilai >= 90){
            System.out.println("A");
        } else if(nilai >= 80){
            System.out.println("B");
        } else if(nilai >= 60){
            System.out.println("C");
        } else if(nilai >=50){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
    public static void main(String[] args) {
        char ulang = 'y';
        while(ulang != 'n'){
        System.out.println();
        System.out.println("**********MENU UTAMA**********");
        System.out.println("==============================");
        System.out.println("1. Menampilkan Tulisan 5 kali");
        System.out.println("2. Mencari Luas Lingkaran");
        System.out.println("3. Menentukan Nilai Huruf");
        System.out.println("4. Selesai");
        System.out.println("==============================");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pilihan [1/2/3/4]");
        int myint = keyboard.nextInt();

        if(myint == 1){
            tamplian5Kali();
        }
        else if(myint == 2){
            System.out.println("Masukkan nilai jari-jari: ");
            float jari = keyboard.nextFloat();
            System.out.println("jari-jari= " + jari + "\n" + "Luas Lingkaran= " + luasLingkaran(jari));
        }
        else if(myint == 3){
            gradeNilai();
        }
        else if(myint == 4){
            System.out.println("==Selesai==");
            System.exit(0);
        }
            Scanner test = new Scanner(System.in);
            System.out.println("Continue(y/n)");
            ulang = test.next().charAt(0);
        }
        
    }
}