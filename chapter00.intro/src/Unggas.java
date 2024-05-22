class Unggas {
    public String warna;
    public void Berjalan()
    {
        System.out.println("Berjalan Menggunakan kaki");
    }
    public void Terbang()
    {
        System.out.println("Terbang Menggunakan Sayap");
    }
    public void Suara()
    {
        System.out.println("Dan Bersuara merdu");
    }

}
class Terbang extends Unggas{
    public void Terbang () {
        System.out.println("Terbang menggunakan sayap");
    }
}
class TidakTerbang extends Unggas{
    public void Terbang (){
        System.out.println("Loncat");
    }

}
