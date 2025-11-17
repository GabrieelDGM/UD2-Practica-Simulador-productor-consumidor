import net.salesianos.Threads.Consumidor;
import net.salesianos.Threads.Productor;
import net.salesianos.sincronized.StoreEmpanada;

public class Main {
    public static void main(String[] args) {

        StoreEmpanada store = new StoreEmpanada(5);

        Productor productor = new Productor(store, 30);
        Consumidor consumidor1 = new Consumidor(store, 15);
        Consumidor consumidor2 = new Consumidor(store, 15);

        new Thread(productor, "Productor").start();
        new Thread(consumidor1, "Consumidor 1").start();
        new Thread(consumidor2, "Consumidor 2").start();
    }
}
