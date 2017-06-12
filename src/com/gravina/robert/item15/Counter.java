package com.gravina.robert.item15;

class Counter {
    private final int count;

    private Counter(int count) {
        this.count = count;
    }

    static Counter valueOf(int count) {
        return new Counter(count);
    }

    int getCount() {
        return count;
    }

    Counter increment() {
        return new Counter(count + 1);
    }

    Counter decrement() {
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
