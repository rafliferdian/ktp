/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Ktp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        String provinsi, tempat, nik, nama, kota, tanggal, kelamin, golDarah, alamat, rt, rw, kel, kec, agama, status, pekerjaan;
        //tampilan untuk user
        System.out.println("Masukkan data diri : \n");
        System.out.print("Provinsi saat ini : ");
        provinsi = input.nextLine();
        System.out.print("Kota saat ini : ");
        tempat = input.nextLine();
        System.out.print("NIK : ");
        nik = input.nextLine();
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Kota Kelahiran : ");
        kota = input.nextLine();
        System.out.print("Tanggal Lahir (dd-mm-yyyy) : ");
        tanggal = input.nextLine();
        System.out.print("Agama : ");
        agama = input.nextLine();
        System.out.print("Jenis Kelamin : ");
        kelamin = input.nextLine();
        System.out.print("Golongan Darah : ");
        golDarah = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        System.out.print("RT (000) : ");
        rt = input.nextLine();
        System.out.print("RW (000) : ");
        rw = input.nextLine();
        System.out.print("Kelurahan : ");
        kel = input.nextLine();
        System.out.print("Kecamatan : ");
        kec = input.nextLine();
        System.out.print("Status Perkawinan : ");
        status = input.nextLine();
        System.out.print("Pekerjaan : ");
        pekerjaan = input.nextLine();
        
        //output
        System.out.println("\n---------------------------------------------------------");
        System.out.println("\n                  PROVINSI "+provinsi.toUpperCase());
        System.out.println("                    KOTA "+tempat.toUpperCase());
        System.out.println("NIK                 : "+nik);
        System.out.println("Nama                : "+nama.toUpperCase());
        System.out.println("Tempat/Tgl Lahir    : "+kota.toUpperCase()+", "+tanggal);
        System.out.println("Jenis Kelamin       : "+kelamin.toUpperCase()+"    Gol. Darah  : "+golDarah.toUpperCase());
        System.out.println("Alamat              : "+alamat.toUpperCase());
        System.out.println("    RT/RW           : "+rt+"/"+rw);
        System.out.println("    Kel/Desa        : "+kel.toUpperCase());
        System.out.println("    Kecamatan       : "+kec.toUpperCase());
        System.out.println("Agama               : "+agama.toUpperCase());
        System.out.println("Status Perkawinan   : "+status.toUpperCase());
        System.out.println("Pekerjaan           : "+pekerjaan.toUpperCase());
        System.out.println("Kewarganegaraan     : WNI");
        System.out.println("Berlaku Hingga      : SEUMUR HIDUP");
        }
    }
