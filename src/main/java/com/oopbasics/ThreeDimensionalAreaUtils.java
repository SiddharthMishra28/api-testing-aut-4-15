package com.oopbasics;

public class ThreeDimensionalAreaUtils extends AreaUtils{
    public ThreeDimensionalAreaUtils(int length, int width, int height, boolean is3dFigure) {
        super(length, width, height, is3dFigure);
    }

    @Override
    public double calculateTriangleArea() {
        return 0;
    }

    public double calculateCubeSurfaceArea() {
        return 6 * length * length;
    }

    public static void main(String[] args) {
        ThreeDimensionalAreaUtils utils = new ThreeDimensionalAreaUtils(4,5,7,true);
        utils.calculateAreaRectangle();
    }
}
