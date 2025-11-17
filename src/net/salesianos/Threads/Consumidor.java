package net.salesianos.Threads;

import net.salesianos.sincronized.Product;
import net.salesianos.sincronized.StoreEmpanada;

public class Consumidor implements Runnable {
    private final StoreEmpanada store;
    private final int cantidadConsumir;

    public Consumidor(StoreEmpanada store, int cantidadConsumir) {
        this.store = store;
        this.cantidadConsumir = cantidadConsumir;
    }

    @Override
    public void run() {
        try {
            for(int i = 1; <= cantidadConsumir; i++)
            product emp = store.consume();
                System.out.println("El cliente consumio " + emp);
                Thread.sleep(1000);


        } catch (interruptedException e) {
            Thread.currentThread().interrupt();
        }

}
}
