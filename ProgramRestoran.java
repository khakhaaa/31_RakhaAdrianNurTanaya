package ProjectLatihan;
import java.util.Scanner;

public class ProgramRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;
        int harga = 0;
        int total = 0;
        int uang = 0;
        do{
        System.out.println("Menu Makanan:\n 1. Crispy Chicken 30000\n 2. French Fries 15000\n 3. Beef Burger 50000");
        System.out.println("Silahkan Pesan:");
        int barang = input.nextInt();
        
        switch(barang){
            case 1:
                harga = 30000;
                total += harga;
                break;
            case 2:
                harga = 15000;
                total += harga;
                break;
            case 3:
                harga = 50000;
                total += harga;
                break;
            default:
                harga = 0;
                break;
        }
        
        System.out.println("Pesanan lain?(ya/tidak)");
        String lagi = input.next();
        if(lagi.equalsIgnoreCase("Tidak")){
        status = false;
    }
        }while(status);
        System.out.println("Total biaya pesanan anda Rp "+total);
        System.out.println("Terimakasih atas pesanan Anda!");
        System.out.println("Jumlah yang dibayarkan: ");
        uang = input.nextInt();
        
        if(total == uang){
            System.out.println("Uang anda pas");
        }
        else if(uang > total){
            System.out.println("Kembalian anda :"+(uang-total));
        }
        else if(uang < total){
            System.out.println("Uang anda kurang!");
        }
    }
}
