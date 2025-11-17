package net.salesianos.Threads;

import net.salesianos.sincronized.Product;
import net.salesianos.sincronized.StoreEmpanada;

public class Product implements Runnable {
    private final StoreEmpanada store;
    private final int cantidadProducir;

    private final String[] types = { "Queso", "Pollo", "Pabellon", "Carne", "Jamon y queso" };

    public Product(StoreEmpanada store, int cantidadProducir) {
        this.store = store;
        this.cantidadProducir = cantidadProducir;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= cantidadProducir; i++) {
                String type = types[i % types.length];
                store.produce(new Product(store, 1));

                Thread.sleep(500);

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
