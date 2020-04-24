package tugas.modul.pkg4.aja;
import java.util.Scanner;

public class TugasModul4Aja {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int kerjaan,y,z,gaji,umur;
        float ipk;
        NewClass NewClass = new NewClass();
        NewClass.nama("Kelompok 65");
        NewClass.aplikasi();
        System.out.print ("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print ("Masukkan umur : ");
        umur = input.nextInt();
        System.out.print ("Masukkan ipk gausa pake koma: ");
        ipk = input.nextFloat();
        System.out.println("Mau daftar jadi apaan?");
        System.out.println ("pilihan : \n 1. Office boy\n 2. Manager\n 3. Direktur" );
        System.out.print ("Masukkan Pilihan : ");   
        kerjaan = input.nextInt(); 
        
        System.out.println ("\n\t Hasilnya");
        System.out.println ("Nama \t: "+nama);
        System.out.println ("umur \t: "+umur);
        System.out.println ("ipk \t: "+ipk);
       
        switch (kerjaan) {
            case 1:
                if (umur >= 18) {
                System.out.println("Anda boleh bekerja di sini");
                z=1;
            } else {
                System.out.println("Anda tidak diterima");
                z=0;
            }
                break;
            case 2:
                if (umur >= 18) {
                if (ipk >= 350) {
                System.out.println("Anda boleh bekerja di sini");
                z=1;
            } else {
                System.out.println("ga keterima lu");
                z=0;
            }
            } else {
                System.out.println("Anda tidak diterima");
                z=0;
            }
                break;
            case 3:
                if (umur >= 18) {
                if (ipk == 400) {
                System.out.println("Anda boleh bekerja di sini");
                z=1;
            } else {
                System.out.println("ga keterima lu");
                z=0;
            }
            } else {
                System.out.println("Anda tidak diterima");
                z=0;
            }
                break;
            default:
                System.out.println("berani-beraninya anda");
                z=0;
                break;
        }
        if(z==1){
            System.out.println("\n1.OB\n2.Manager\n3.Direktur");
            System.out.print ("Lu keterima di mana? : ");
            y = input.nextInt();
            gaji = 0;
            
            for (int i = 1; i <= y; i++) {
                if (i % 3 == 0) {
                    gaji += 100000;
                } else {
                    gaji += 50000;
                }
            }
            System.out.print ("Gaji anda: Rp"+gaji);
            System.out.println ("per hari");
        }
        else{
            System.out.println("sampai jumpa");
        }
    }
}

    
    

