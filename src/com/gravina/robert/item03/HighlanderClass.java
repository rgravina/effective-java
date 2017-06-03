package com.gravina.robert.item03;

class HighlanderClass {
    private static final HighlanderClass INSTANCE = new HighlanderClass();
    private HighlanderClass() {}
    static HighlanderClass getInstance() { return INSTANCE; } // there can be only one
    Integer howManyCanThereBe() {
        return 1;
    }
}
