package net.salesianos.Threads;

import net.salesianos.sincronized.StoreEmpanada;

public class Consumidor implements Runnable {

    private final StoreEmpanada store;
    private final int cantidad;

    public Consumidor(StoreEmpanada store, int cantidad) {
        this.store = store;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < cantidad; i++) {
                store.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
