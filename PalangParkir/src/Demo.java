public class Demo {
    public static void main(String [] args){
        Palang palang = new Palang();
        MesinKarcis mesinKarcis = new MesinKarcis();
        Kamera cctv = new Kamera();
        Button button = new Button();
        mesinKarcis.palangNaik(palang);
        button.connectTo(cctv,mesinKarcis);
        button.buttonPressed();
        mesinKarcis.tiketDiambil();
    }
}