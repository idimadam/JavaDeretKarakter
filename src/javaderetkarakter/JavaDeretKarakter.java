/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1segitiga;

/**
 *
 * @author IDIMADAM
 */
import javax.swing.JOptionPane;

public class Tugas1Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Selamat Datang\nUntuk memilih Bentuk Karakter, Silahkan pilih salah satu dari daftar berikut");
        String pil = JOptionPane.showInputDialog("1.Segitiga Siku Kiri Atas\n2.Segitiga Siku Kiri Bawah\n"
                + "3.Segitiga Siku Kanan Atas\n4.Segitiga Siku Kanan Bawah\n5.Segitiga Sama Kaki");
        int pilihan = Integer.parseInt(pil);
        
        String tinggi = JOptionPane.showInputDialog("Masukkan karakter : ");
        int xtinggi = Integer.parseInt(tinggi);
        
        switch(pilihan){
            case 1:
                int c, d;
                
                System.out.print("Hasil Karakter yang ditampilkan\n");
        
                for(c=0;c<xtinggi;c++) {
                        for(d=c;d<xtinggi;d++) {
                    System.out.print("*");
                    }
                    System.out.print("\n"); 
                }
                System.out.println();
                break;
            case 2:
                int a, b;
                
                System.out.print("Hasil Karakter yang ditampilkan");
        
                for(a=0;a<=xtinggi;a++ ) {
                    for(b=0; b<a; b++) {
                    System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.println();
                break;
            case 3:
                for(int h=0; h<xtinggi; h++) {
                    for(int i=0; i<h; i++) {
                    System.out.print(" ");
                    }
                for(int j=0; j<(xtinggi-h); j++) {
                    System.out.print("*");
                }
                System.out.println();
                }
                break;
                }