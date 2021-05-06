public class node{
    String nim, nama, jurusan, prodi;
    double ipk;
    node prev, next;

    node(node prev, String nim, String nama, String jurusan, String prodi, double ipk, node next){
        this.prev = prev;
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.next = next;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }
}