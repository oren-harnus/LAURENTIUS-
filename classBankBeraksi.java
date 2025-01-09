/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author ASUS
 */
public class classBankBeraksi {
    public class BankBeraksi {
    public static void main(String[] args) {
        // Tetapkan saldo awal lewat konstruktor Rp. 100000
        Bank bank = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");

        // Tampilkan saldo saat ini
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        // Simpan uang Rp. 500000
        bank.simpanUang(500000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        // Ambil uang Rp. 150000
        bank.ambilUang(150000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}
}
