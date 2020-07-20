package com.RaboAndCap.tutorials;

public class Rectangle {

    private int height, width;
    private String color = "no color";

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return height + " is the height |" + calculateCircumference() + " is the circumference |" + width + " is the width |" + calculateSurface() + " is the surface |" + color + " is the color|";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateSurface() {
        return width * height;
    }
    public int calculateCircumference() {
        return 2 * width * height;
    }
}
