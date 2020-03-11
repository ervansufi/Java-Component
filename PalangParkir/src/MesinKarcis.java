import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MesinKarcis implements TombolDitekan {
    private KarcisDiambil tiket;
    private boolean ditekan;
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date masukKendaraan = new Date();
    // constructor
    public MesinKarcis(){
        ditekan = false;
    }
    // mengeluarkan struk karcis
    public void keluarKarcis(){
        System.out.println("+------------------------------------------------+");
        System.out.println("|              ~~ Karcis Parkir ~~               |");
        System.out.println("| Tanggal masuk kendaraan : " + df.format(masukKendaraan)+"    |");

        System.out.println("+------------------------------------------------+");
    }
    public void palangNaik(KarcisDiambil palangNaik) {
        tiket = palangNaik;
    }
    public void pressed() {
        ditekan = true;
        if (ditekan!=false) {
            keluarKarcis();
        }
    }
    public void tiketDiambil(){
        if(tiket!=null){
            tiket.palangNaik();
        }
    }
}