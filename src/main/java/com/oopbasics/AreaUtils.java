package com.oopbasics;

public abstract class AreaUtils {

    int length;
    int width;
    int height;
    boolean is3dFigure;

    public AreaUtils(int length, int width, int height, boolean is3dFigure) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.is3dFigure = is3dFigure;
    }

    public abstract double calculateTriangleArea();

    public double calculateAreaSquare() {
        return length *  length;
    }

    public double calculateAreaRectangle() {
        return length *  width;
    }
}
