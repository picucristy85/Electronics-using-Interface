public class Unitate implements Startable, Stopable{
    String marca;
    int ram;
    boolean on;

    public Unitate(String marca, int ram, boolean on) {
        this.marca = marca;
        this.ram = ram;
        on = false;
    }

    @Override
    public String toString() {
        return "Unitate{" +
                "marca='" + marca + '\'' +
                ", ram=" + ram +
                ", on=" + on +
                '}';
    }

    @Override
    public void start() {
        if (on){
            System.out.println("Unitatea PC este deja pornita!");
        }else{
            System.out.println("Am pornit unitatea PC...");
            this.on=true;
        }
    }

    @Override
    public void stop() {
        if (on){
            System.out.println("Am oprit unitatea PC...");
            on=false;
        }else{
            System.out.println("Unitatea PC este deja oprita...");
        }
    }
}
