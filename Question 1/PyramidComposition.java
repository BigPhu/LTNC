public class PyramidComposition {
    private Triangle baseTriangle;
    private double pyramidHeight;

    public PyramidComposition(Triangle baseTriangle, double pyramidHeight) {
        this.baseTriangle = baseTriangle;
        this.pyramidHeight = pyramidHeight;
    }

    public double getPyramidHeight() {
        return this.pyramidHeight;
    }

    public double getVolume() {
        return ((1.0 / 3.0) * this.baseTriangle.getArea() * this.pyramidHeight);
    }
}
