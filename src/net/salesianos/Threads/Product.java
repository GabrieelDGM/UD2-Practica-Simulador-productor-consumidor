package net.salesianos.Threads;

import net.salesianos.sincronized.StoreEmpanada;

public class Product {
    private final StoreEmpanada store;
    private final int cantidadProducir;

    private final String[] types = {"Queso","Pollo","Pabellon","Carne","Jamon y queso"};

    public Product(StoreEmpanada store, int cantidadProducir) {
        this.store = store;
        this.cantidadProducir = cantidadProducir;
    }
    public void run() {
        try {
            for( int i = 1; i <= cantidadProducir; i++) {
                String type = types[i % types.length];
                Product product = new Product(store, cantidadProducir);
                store.produce(product);

                Thread.sleep(500);
            
            }
            
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
