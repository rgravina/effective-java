package com.gravina.robert.item15;

public class Counter {
    private final int count;

    public Counter() {
        count = 0;
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Counter increment() {
        return new Counter(count + 1);
    }

    public Counter decrement() {
        return new Counter(count - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Counter counter = (Counter) o;

        return count == counter.count;
    }

    @Override
    public int hashCode() {
        return count;
    }
}
