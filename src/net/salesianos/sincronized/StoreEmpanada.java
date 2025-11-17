package net.salesianos.sincronized;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StoreEmpanada {
    private final Queue<Product> store = new LinkedList<>();
    private final int capacity;

    public StoreEmpanada(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void produce(Product product) throws InterruptedException {
        while (store.size() == capacity) {
            wait();
        }
        store.add(product);
        System.out.println("Produced: " + product);
        notifyAll();
    }


}