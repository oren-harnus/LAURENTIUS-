/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementasi.dari.antarmuka.ac;

/**
 *
 * @author ASUS
 */
public class ImplementasiDariAntarmukaAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class ACImpl implements AC {
    Override
    public void matikanAC() {
        System.out.println("AC dimatikan");
    }

    Override
    public void hidupkanAC() {
        System.out.println("AC dihidupkan");
    }

    Override
    public void dinginkanAC() {
        System.out.println("AC didinginkan");
    }

    Override
    public void panaskanAC() {
        System.out.println("AC dipanaskan");
    }
}

}
