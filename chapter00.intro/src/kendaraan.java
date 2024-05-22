interface Kendaraan {
    void Berjalan();

    void Berhenti();
}
class Sepeda implements Kendaraan{

    @Override
    public void Berjalan() {
        System.out.println("01 gas");

    }

    @Override
    public void Berhenti() {
        System.out.println("02 rem");

    }
    void Klakson(){
        System.out.println("popop");
    }
}
class SepedaMotor implements Kendaraan{

    @Override
    public void Berjalan() {
        System.out.println("01 gas");
    }

    @Override
    public void Berhenti() {
        System.out.println("02 stop");

    }
    void Klakson() {
        System.out.println("popop");
    }

}