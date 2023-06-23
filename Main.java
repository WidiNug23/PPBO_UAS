// Class Induk/Kelas Super
class Manusia {
    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }

    public void sapa() {
        System.out.println("Halo, nama saya " + nama);
    }
}

// Class Anak/Kelas Sub dengan menggunakan pewarisan dan overriding
class Mahasiswa extends Manusia {
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }
// Menggunakan get
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("NIM: " + nim);
    }

    @Override
    public void sapa() {
        System.out.println("Halo, nama saya " + getNama() + " (mahasiswa)");
    }
}

// Class lain yang menggunakan polymorphism
class Pembicara {
    public void sapa(Manusia manusia) {
        manusia.sapa();
    }
}

public class Main {
    public static void main(String[] args) {
        // Menggunakan try catch
        try {
            // Membuat objek manusia dan mahasiswa
            Manusia manusia = new Manusia("Widi");
            Mahasiswa mahasiswa = new Mahasiswa("Widi Suryo Nugroho", "V3922047");

            // Memanggil metode info() dan sapa() dari objek manusia dan mahasiswa
            manusia.info(); // Output: Nama: Widi
            manusia.sapa(); // Output: Halo, nama saya Widi

            mahasiswa.info(); // Output: Nama: Widi Suryo Nugroho
            //         NIM: V3922047
            mahasiswa.sapa(); // Output: Halo, nama saya Widi Suryo Nugroho (mahasiswa)

            System.out.println();

            // Menggunakan polymorphism dengan objek manusia dan mahasiswa
            Pembicara pembicara = new Pembicara();
            pembicara.sapa(manusia); // Output: Halo, nama saya Widi
            pembicara.sapa(mahasiswa); // Output: Halo, nama saya Widi Suryo Nugroho (mahasiswa)
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
