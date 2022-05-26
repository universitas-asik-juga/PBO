//Filename: Mahasiswa.java
//Package: latihan
//Author: Muhammad Teguh Prastyo
//Last update: 26/05/2022

package latihan;

import java.util.Scanner;

public class Mahasiswa {
    //class attribute
    String Nama, Password, NIM;
    
    //setter getter untuk String Nama
    void setNama(String Nama){
        this.Nama = Nama;
    }
    
    String getNama(){
        return this.Nama;
    }
    
    //setter getter untuk String Password
    void setPassword(String Password){
        this.Password = Password;
    }
    
    String getPassword(){
        return this.Password;
    }
    
    //setter getter untuk String NIM
    void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    String getNIM(){
        return this.NIM;
    }
    
    //method daftar
    void daftar(Mahasiswa m){
        //deklarasi objek
        Scanner scan = new Scanner(System.in);
        
        String input;
        
        System.out.println("==Daftar==");
        
        System.out.print("Masukan Nama : ");
        input = scan.nextLine();
        m.setNama(input);
        
        System.out.print("Masukan Password : ");
        input = scan.nextLine();
        m.setPassword(input);
        
        System.out.print("Masukan NIM : ");
        input = scan.nextLine();
        m.setNIM(input);
    }
    
    //method main
    public static void main(String args[]){
        Mahasiswa m = new Mahasiswa();
        m.daftar(m);
        
        System.out.println("Selamat! Nama anda : "+m.getNama()+" telah terdaftar!");
        
        System.out.println("Berikut Password dan NIM anda : ");
        System.out.println("Password : "+m.getPassword());
        System.out.println("NIM : "+m.getNIM());
    }
}
