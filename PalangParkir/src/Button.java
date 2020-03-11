public class Button{
    private TombolDitekan cctv; // interface required
    private TombolDitekan mesinKarcis;
    public Button(){
        cctv=null;
        mesinKarcis=null;
    }
    public void connectTo(TombolDitekan c,TombolDitekan mk) {
        cctv=c;
        mesinKarcis=mk;
    }
    public void buttonPressed() {
        cctv.pressed();
        mesinKarcis.pressed();
    }
}