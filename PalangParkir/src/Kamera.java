public class Kamera implements TombolDitekan {
    private boolean ditekan;
    public Kamera(){
        ditekan = false;
    }

    public void getKendaraanInfo(){
        System.out.println("Info mengenai kendaraan telah diambil");
    }
    // ketika tombol di tekan maka mencatat info dari kendaraan tersebut
    public void pressed() {
        ditekan = true;
        if (ditekan!=false) {
            getKendaraanInfo();
        }
    }
}