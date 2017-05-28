package com.gravina.robert.item02;

class Color {
    private final int red;
    private final int green;
    private final int blue;

    static class Builder {
        private int red;
        private int green;
        private int blue;

        Builder red(int dec) {
            red = dec;
            return this;
        }
        Builder green(int dec) {
            green = dec;
            return this;
        }
        Builder blue(int dec) {
            blue = dec;
            return this;
        }

        Color build() {
            return new Color(this);
        }
    }

    private Color(Builder builder) {
        this.red = builder.red;
        this.green = builder.green;
        this.blue = builder.blue;
    }

    String toHex() {
        return "000000";
    }
}
