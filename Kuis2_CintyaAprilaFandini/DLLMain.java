import java.util.Scanner;
public class DLLMain {
    static void menu() {
        System.out.println("|==================================================================|");
        System.out.println("|==================SISTEM PENGOLAHAN DATA MAHASISWA================|");
        System.out.println("|==================================================================|");
        System.out.println("|1. Tambah Data Mahasiswa                                          |");
        System.out.println("|2. Tambah Data Mahasiswa Awal                                     |");
        System.out.println("|3. Tambah Data Mahasiswa Akhir                                    |");
        System.out.println("|4. Hapus Data Mahasiswa                                           |");
        System.out.println("|5. Hapus Data Mahasiswa Awal                                      |");
        System.out.println("|6. Hapus Data Mahasiswa Akhir                                     |");
        System.out.println("|7. Cetak                                                          |");
        System.out.println("|8. Temukan Data Mahasiswa Urutan Pertama                          |");
        System.out.println("|9. Cari Data Mahasiswa (Melalui NIM)                              |");
        System.out.println("|10. Urut Data Mahasiswa(Melalui IPK)                              |");
        System.out.println("|==================================================================|");
        System.out.print("Masukkan Menu Pilihan Anda : ");
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DLL doubleLinked = new DLL ();
        int pilihan;
        do {
            menu();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1: {
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM     : ");
                    String nim = sc.next();
                    System.out.print("Nama    : ");
                    String nama = sc.next();
                    System.out.print("Jurusan : ");
                    String jurusan = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    sc.nextLine();
                    System.out.print("IPK     : ");
                    double ipk=sc.nextDouble();
                    System.out.print("Data Mahasiswa Akan Dimasukkan Pada Urutan Ke-");
                    int ind=sc.nextInt();
                    doubleLinked.add(nim,nama,jurusan, prodi, ipk,ind);
                    break;
                }
                case 2: {
                    System.out.println("Masukkan data Awal");
                    System.out.print("NIM  : ");
                    String induk = sc.next();
                    System.out.print("Nama : ");
                    String name = sc.next();
                    System.out.print("Jurusan : ");
                    String jn = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Prodi   : ");
                    String pi = sc.next();
                    sc.nextLine();
                    System.out.print("IPK  : ");
                    double indeksP=sc.nextDouble();
                    doubleLinked.addFirst(induk,name,jn,pi,indeksP);
                    break;
                }
                case 3: {
                    System.out.println(" Masukkan Data Mahasiswa Akhir");
                    System.out.print("NIM              : ");
                    String ni=sc.next();
                    System.out.print("Nama             : ");
                    String n = sc.next();
                    System.out.print("Jurusan          : ");
                    String jrn = sc.next();
                    sc.nextLine();
                    System.out.print("Prodi            : ");
                    String pd = sc.next();
                    sc.nextLine();
                    System.out.print("IPK              : ");
                    double ip=sc.nextDouble();
                    doubleLinked.addLast(ni,n,jrn,pd,ip);
                    break;
                }
                case 4: {
                    System.out.println("Hapus Data Tertentu");
                    System.out.println("Data Yang Di Hapus : ");
                    int idx = input.nextInt();
                    doubleLinked.remove(idx);
                    break;
                }
                case 5: {
                    System.out.println("Hapus Data Pertama");
                    doubleLinked.removeFirst();
                    System.out.println("Data Pertama Berhasil Dihapus");
                    break;
                }
                case 6: {
                    System.out.println("Hapus Data Terakhir");
                    doubleLinked.removeLast();
                    System.out.println("Data Terakhir Berhasil Dihapus");
                    break;
                }
                case 7: {
                    System.out.println("Cetak Data");
                    doubleLinked.print();
                    break;
                }
                case 8 : 
                    System.out.println("Data Mahasiswa Urutan Pertama");
                    doubleLinked.getFirst();
                    break;
                case 9: {
                    System.out.println("Cari Data");
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = sc.nextLine();
                    doubleLinked.search(nim);
                    break;
                }
                case 10: {
                    System.out.println("Data Setelah Diurutkan");
                    doubleLinked.sorting();
                    break;
                }
                
            }
            System.out.println("");
        } while (pilihan != 10);
    }  
}
