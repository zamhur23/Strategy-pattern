class Main{
    public static void main(String[] args) {

        System.out.println("pinguin");
        TidakTerbang penguin = new TidakTerbang();
        penguin.warna = "hitam,putih";
        penguin.Berjalan();
        penguin.Terbang();
        penguin.Suara();
        System.out.println(penguin.warna);

        System.out.println();

        // Deklarasi dan inisialisasi objek merpati dari kelas Unggas
        Unggas merpati = new Unggas();

// Menampilkan informasi objek merpati
        System.out.println("Objek merpati");

// Memanggil metode Berjalan dari objek merpati
        merpati.Berjalan();

// Mengatur warna objek merpati
        merpati.warna = "oren";

// Memanggil metode Suara dari objek merpati
        merpati.Suara();

// Menampilkan informasi warna objek merpati
        System.out.println("Berwarna " + merpati.warna);

// Memanggil metode Terbang dari objek merpati
        merpati.Terbang();

        // Deklarasi dan inisialisasi objek mahasiswa dari kelas Mhs
        Mhs mahasiswa = new Mhs();

// Menampilkan informasi mahasiswa
        System.out.println("Data mahasiswa");

        mahasiswa.nama = "ZAMHUR";
        mahasiswa.NIM = "2022573010056";
        mahasiswa.email = "zamhur4545@gmail.com";
        mahasiswa.jeniskelamin = "Pria"; // Ganti "Jenis Kelamin" menjadi "jenisKelamin"
        mahasiswa.alamat = "Bireun";

// Menampilkan informasi mahasiswa
        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.NIM);
        System.out.println("Email: " + mahasiswa.email);
        System.out.println("Jenis Kelamin: " + mahasiswa.jeniskelamin);
        System.out.println("Alamat: " + mahasiswa.alamat);
        System.out.println();


        // Deklarasi dan inisialisasi objek dosen dari kelas Dosen
        Dosen dosen = new Dosen();

// Menampilkan informasi dosen
        System.out.println("Data dosen");

// Mengatur nilai atribut dosen
        dosen.nama = "Muhammad Reza";
        dosen.NIP = "11112887448983";
        dosen.email = "Reza@pnl.ac.id";
        dosen.jeniskelamin = "Pria";
        dosen.alamat = "Aceh";

// Menampilkan informasi dosen
        System.out.println("Nama: " + dosen.nama);
        System.out.println("NIP: " + dosen.NIP);
        System.out.println("Email: " + dosen.email);
        System.out.println("Jenis_Kelamin: " + dosen.jeniskelamin);
        System.out.println("Alamat: " + dosen.alamat);
        System.out.println();


        Sepeda Sepeda = new Sepeda();
        Sepeda.Berjalan();
        Sepeda.Berhenti();
        Sepeda.Klakson();

        SepedaMotor SepedaMotor = new SepedaMotor();
        SepedaMotor.Berjalan();
        SepedaMotor.Berhenti();
        SepedaMotor.Klakson();

        // Abstract
        Employee empBaru = new NewEmployee();
        empBaru.printInfo();
        empBaru.companyInfo();

        Employee empLama = new OldEmployee();
        empLama.printInfo();
        empLama.companyInfo();


        // Example of choosing between interface and abstract
        System.out.println("Example of choosing between interface and abstract");
        System.out.println("---------------------------------------------------");
        System.out.println("------Abstract------");
        ShapeAbstract bulat = new Circle(2);
        Rectangle pp = new Rectangle(2,5);
        bulat.calculateArea();
        pp.calculateArea();
        bulat.draw();
        pp.draw();

        System.out.println("------Interface------");
        Bulat bulat2 = new Bulat(2);
        PersegiPanjang pp2 = new PersegiPanjang(2,5);
        bulat2.calculateArea();
        pp.calculateArea();
        bulat2.draw();
        pp2.draw();


    }
}




