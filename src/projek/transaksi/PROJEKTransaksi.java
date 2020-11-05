/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.transaksi;

import java.util.Scanner;

/**
 *
 * @author Intan
 */
public class PROJEKTransaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        //judul
        System.out.print("\n TRANSAKSI PEMBELIAN MINUMAN \n");
        //Pilihan menu
        String[] menu = {"", "Es jeruk", "Kopi", "Jus Jambu", "Teh"};
        int[] harga = {0, 2000, 5000, 7000, 5000};
        for(int a=1; a<menu.length; a++){
            System.out.println(a+". "+menu[a]);
            System.out.println("   Harga : "+harga[a]);}
        //pilihan user
        System.out.print("Pilihan Anda : ");
        int pilihan = scan.nextInt();
        boolean running = true;
        while(running){
            System.out.print("Masukkan Uang Anda    : ");
            int uang = scan.nextInt();
            if(uang==harga[pilihan]){
                System.out.println("Silahkan Ambil Pesanan "+menu[pilihan]+" Anda");
                running = false;
            }else if(uang>harga[pilihan]){
                int kembalian = uang-harga[pilihan];
                System.out.println("Silahkan Ambil Pesanan "+menu[pilihan]+" Anda dan Kembalian Sebesar "+kembalian);
                running = false;
            }else{
                System.out.println("Uang Anda Kurang");
                running = true;
            }
        }
    }
    
}
