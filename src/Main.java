import net.salesianos.Threads.Consumidor;
import net.salesianos.Threads.Productor;
import net.salesianos.sincronized.StoreEmpanada;

public class Main {
    public static void main(String[] args) {

        StoreEmpanada store = new StoreEmpanada(5);

        Productor productor1 = new Productor(store, 20);
        Productor productor2 = new Productor(store, 20);
        Consumidor consumidor = new Consumidor(store, 40);

        new Thread(productor1, "Productor 1").start();
        new Thread(productor2, "Productor 2").start();
        new Thread(consumidor, "Consumidor").start();
    }
}
