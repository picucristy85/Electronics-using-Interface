public class Laptop implements Startable, Stopable{
    String marca;
    int ram;
    boolean on;

    public Laptop(String marca, int ram, boolean on) {
        this.marca = marca;
        this.ram = ram;
        this.on = on;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "marca='" + marca + '\'' +
                ", ram=" + ram +
                ", on=" + on +
                '}';
    }

    @Override
    public void start() {
        if (on){
            System.out.println("Laptopul este deja pornit!");
        }else{
            System.out.println("Am pornit laptopul...");
            this.on=true;
        }
    }

    @Override
    public void stop() {
        if (on){
            System.out.println("Am oprit laptopul...");
            this.on=false;
        }else{
            System.out.println("Laptopul este deja oprit...");
        }

    }
}
