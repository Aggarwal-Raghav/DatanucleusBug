package com.github.raghav;

import java.util.Collection;
import java.util.HashSet;

public class Product {
    int id = 0;
    String name = null;
    String description = null;
    Collection suppliers = new HashSet();

    public Product(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.description = desc;
    }

    public void addSupplier(Person supplier) {
        suppliers.add(supplier);
    }

    public void removeSupplier(Person supplier) {
        suppliers.remove(supplier);
    }

    public Collection getSuppliers() {
        return suppliers;
    }

    public int getNumberOfSuppliers() {
        return suppliers.size();
    }

    public String toString() {
        return "Product : " + name + " [" + description + "] - " + suppliers.size() + " suppliers";
    }
}
