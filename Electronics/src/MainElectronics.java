public class MainElectronics {
    public static void main(String[] args) {

        Unitate unitate = new Unitate("Asus", 12, false);
        Laptop laptop = new Laptop("Dell", 8, true);
        Radio radio = new Radio("Kiss FM");

        radio.start();
        radio.changePost("Radio ZU");
        radio.stop();

        unitate.start();
        unitate.stop();

        laptop.start();
        laptop.stop();
    }

}
