package Tugas3SDA;

import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;

public class Tugas3SDA {
	public static void main(String[] args) {
		
		LinkedList<String> Nim = new LinkedList<>();
		LinkedList<String> Nama = new LinkedList<>();
		LinkedList<String> Alamat = new LinkedList<>();
		
		//Data Mahasiswa
			System.out.println("Data Mahasiswa");
			Nim.add("2111523016");
			Nim.add("2111521024");
			Nim.add("2111523012");
			Nim.add("2111521014");
			Nim.add("2111522018");
			
			Nama.add("Aldo Agustio");
			Nama.add("Fikran Shadiq El Yafit");
			Nama.add("Rasyid Nugrahesa Riqua");
			Nama.add("Iqbal Firmansyah");
			Nama.add("Putra Ilham");
			
			Alamat.add("PAINAN");
			Alamat.add("PAINAN");
			Alamat.add("PADANG");
			Alamat.add("PASAMAN");
			Alamat.add("SOLOK");
	        
			System.out.println("Output NIM : "+Nim+" Ukuran : "+Nim.size());
	        System.out.println("Output Nama : "+Nama+" Ukuran : "+Nama.size());
	        System.out.println("Output Alamat : "+Alamat+" Ukuran : "+Alamat.size());
	        System.out.println("=============================\n");
	        
	        //
	        
	        System.out.println("Menyisipkan data");
	        System.out.println("Data awal NIM : "+Nim+" Ukuran : "+Nim.size());
	        Nim.add(1, "2111523016");
	        Nim.add(2, "2111521024");
	        Nim.add(3, "2111523012");
	        Nim.add(4, "2111521014");
	        Nim.add(4, "2111522018");
	        
	        System.out.println("Output NIM : "+Nim+" Ukuran : "+Nim.size());
	        System.out.println("=============================\n");
	        
	        //Mengganti data
	        System.out.println("Mengganti data");
	        System.out.println("Data awal nama : "+Nama+" Ukuran"+Nama.size());
	        Nama.set(0, "Aldo Agustio");
	        Nama.set(2, "Rasyid Nugrahesa Riqua");
	        Nama.set(4, "Putra Ilham");

	        System.out.println("Output nama : "+Nama+" Ukuran : "+Nama.size());
	        System.out.println("=============================\n");
	        
	      //Menghapus data
	        System.out.println("Menghapus data");
	        //First dan Last
	        System.out.println("Data awal Alamat : "+Alamat+" Ukuran : "+Alamat.size());
	        Alamat.removeFirst();
	        Alamat.removeLast();

	        System.out.println("Output Alamat : "+Alamat+" Ukuran : "+Alamat.size());
	        
	        System.out.println("\nData awal NIM : "+Nim+" Ukuran : "+Nim.size());
	        Nim.remove(2);
	        Nim.remove(5);

	        System.out.println("Output NIM : "+Nim+" Ukuran : "+Nim.size());

	        //Hapus semua di tambahkan
	        System.out.println("\nData awal NIM : "+Nim+" Ukuran : "+Nim.size());
	        Nim.clear();

	        System.out.println("Output NIM : "+Nim+" Ukuran : "+Nim.size());
	        System.out.println("=============================\n");

	        //linkedlist kosong
	        System.out.println("Cek tambahkan linkedlist");
	        //Cek LinkedList Nama
	        Boolean cekNama = Nama.isEmpty();
	        if (cekNama) {
	            System.out.println("Tambahkan LinkedList Nama Kosong");
	        }else{
	            System.out.println("LinkedList Nama memiliki "+Nama.size()+" Tambahkan");
	        }

	        //LinkedList NIM
	        Boolean cekNim = Nim.isEmpty();
	        if (cekNim) {
	            System.out.println("Elemen LinkedList NIM Kosong");
	        } else {
	            System.out.println("LinkedList NIM memiliki "+Nim.size()+" Tambahkan");
	        }

	        //LinkedList Alamat
	        Boolean cekAlamat = Alamat.isEmpty();
	        if (cekAlamat) {
	            System.out.println("Tambahkan LinkedList Alamat Kosong");
	        } else {
	            System.out.println("LinkedList Alamat memiliki "+Alamat.size()+" Tambahkan");
	        }
	        System.out.println("=============================\n");

	        //Mengambil Tambahkan dalam LinkedList
	        System.out.println("===Ambil Nama Lengkap===");
	        //
	        System.out.println("Nama saat ini adalah : "+Nama+" Ukuran : "+Nama.size());
	        System.out.println("Nama 0 adalah : "+Nama.get(0));
	        System.out.println("Nama 1 adalah : "+Nama.get(2));
	        System.out.println("Nama 2 adalah : "+Nama.get(3));
	        System.out.println("Nama 3 adalah : "+Nama.get(4));

	        //First dan Last
	        System.out.println("\nTambahkan nama saat ini adalah : "+Nama+" Ukuran : "+Nama.size());
	        System.out.println("Tambahkan nama pada index awal adalah : "+Nama.getFirst());
	        System.out.println("Tambahkan nama pada index awal adalah : "+Nama.getLast());

	        System.out.println("=============================\n");
	        
	        //Push dan Pop
	        System.out.println("Fungsi Pop dan Push");
	        System.out.println("Tambahkan nama saat ini adalah : "+Nama+" Ukuran : "+Nama.size());
	        
	        do {  
	            Scanner input = new Scanner(System.in);
	            
	                //Masukan data yang akan di operasi
	                System.out.printf("Masukan Tambahkan(Nama) yang akan dioperasi pada LinkedList : ");
	                String tempData = input.nextLine();

	                //Membuat pilihan menu dan membuat fungsi pop dan push
	                Scanner pilih = new Scanner(System.in);
	                System.out.println("====Pilih Fungsi===");
	                System.out.println("1. Fungsi Pop");
	                System.out.println("2. Fungsi Push");
	                System.out.println("3. Exit");
	                System.out.println("===================");

	                System.out.printf("Menu pilih : ");
	                int menu = pilih.nextInt();
	                switch (menu) {
	                    case 1:
	                        System.out.printf("Pada index ke : ");
	                        int indexData = input.nextInt();

	                        Nama.add(indexData, tempData);
	                        System.out.println("data saya menjadi : "+Nama);
	                        break;
	            
	                    case 2:
	                        Nama.remove(tempData);
	                        System.out.println("data saya menjadi : "+Nama);
	                        break;

	                    case 3:
	                        System.exit(0);
	                    default:
	                        break;
	                }  
	            System.out.println("=============================\n");
	        } while (true);
	}
}
