package person;

/**
 *
 * @author EliteBook
 */
class Mahasiswa {

    // Modifier private 
    private String nama;
    private int umur;
    private String prodi;

    // Constructor
    public Mahasiswa(String nama, int umur, String prodi) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
    }

    // Method modifier
    public void tampilkanData() {
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("prodi : " + prodi);
    }

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Naifah", 19, "Pendidikan Informatika");
        mhs1.tampilkanData();
    }
}