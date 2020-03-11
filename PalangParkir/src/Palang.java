public class Palang implements KarcisDiambil {
    private boolean diambil;
    public Palang(){
        diambil = false;
    }
    public void naikPalang(){
        System.out.println("Palang telah dinaikkan!");
    }
    // ketika karcis diambil maka akan memanggil method naikpalang
    public void palangNaik() {
        diambil = true;
        if (diambil!=false) {
            naikPalang();
        }
    }
}