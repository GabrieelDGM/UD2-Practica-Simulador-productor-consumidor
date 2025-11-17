package net.salesianos.synchronized;

public class Product {

    private final String tipo;

    public Product(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Empanada (" + tipo + ")";
    }
}
