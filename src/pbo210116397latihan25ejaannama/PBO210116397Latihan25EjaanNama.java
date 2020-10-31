/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Ejaan Nama
 */
package pbo210116397latihan25ejaannama;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nameFront;
        int i = 0;
        int j = 1;
        
        Scanner name = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja\t : ");
        nameFront = name.next();
        String[] frontName = nameFront.split("");
        
        System.out.println("");
        System.out.println("Ejaan untuk " + nameFront + " adalah : ");
        while (i < frontName.length){
            System.out.println("Huruf ke-" + j + " : " + frontName[i]);
            j = j + 1;
            i = i + 1;
                    }
    }
    
}
