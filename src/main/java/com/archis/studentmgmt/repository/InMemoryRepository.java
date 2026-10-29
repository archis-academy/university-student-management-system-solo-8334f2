package com.archis.studentmgmt.repository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository<T> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> findAll() {
        return List.copyOf(items);
    }

    public void clear() {
        items.clear();
    }
}