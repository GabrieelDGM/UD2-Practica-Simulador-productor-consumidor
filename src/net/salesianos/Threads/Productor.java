package net.salesianos.Threads;

import net.salesianos.sincronized.Product;
import net.salesianos.sincronized.StoreEmpanada;

public class Productor implements Runnable {
    private final StoreEmpanada store;
    private final int cantidad;
    private String[] types ={"Queso","Pollo","Pabellon","Carne","Jamon y queso"};
    public Productor(StoreEmpanada store, int cantidad) {
        this.store = store;
        this.cantidad = cantidad;
    }
     @Override
    public void run() {
        try {
            for (int i = 0; i < cantidad; i++) {
                String types = types[(int)(Math.random() * tipos.length)];
                Product empanada = new Product(tipo);
                store.produce(empanada);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}



