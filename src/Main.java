import net.salesianos.Threads.Consumidor;
import net.salesianos.Threads.Productor;
import net.salesianos.sincronized.StoreEmpanada;

public class Main {
    public static void main(String[] args) {

        StoreEmpanada store = new StoreEmpanada(10);

        Productor productor = new Productor(store, 20);
        Consumidor consumidor = new Consumidor(store, 20);

        Thread hiloProductor = new Thread(productor, "Productor");
        Thread hiloConsumidor = new Thread(consumidor, "Consumidor");

        hiloProductor.start();
        hiloConsumidor.start();
    }
}
