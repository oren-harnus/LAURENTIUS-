/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankberaksi;

/**
 *
 * @author ASUS
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Bank {
    private int saldo;

    // Konstruktor dengan parameter saldo
    public Bank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Metode untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Metode untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk mengambil uang sebesar Rp. " + jumlah);
        }
    }

    // Metode untuk mendapatkan saldo saat ini
    public int getSaldo() {
        return saldo;
    }
}

}
