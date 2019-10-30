public class QuizAlgo {
    static int kali, bagi, tambah, kurang, hasil;

    public static int kali(int a, int b){
        hasil = a * b;
        return hasil;
    }
    public static int bagi(int a, int b){
        hasil = a / b;
        return hasil;
    }
    public static int tambah(int a, int b){
        hasil = a + b;
        return hasil;
    }
    public static int kurang(int a, int b){
        hasil = a - b;
        return hasil;
    }
    public static void TampilData(){
        kali = kali(3, 4);
        bagi = bagi(10, 5);
        tambah = tambah(2, 5);
        kurang = kurang(5, 3);
        System.out.println("Hasil kali: " + kali);
        System.out.println("Hasil bagi: " + bagi);
        System.out.println("Hasil tambah: " + tambah);
        System.out.println("Hasil kurang: " + kurang);
    }
    public static void main(String[] args){
        TampilData();
    }
}
