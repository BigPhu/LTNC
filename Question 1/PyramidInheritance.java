public class PyramidInheritance extends Triangle {
    private double pyramidHeight;

    public PyramidInheritance(double base, double height, double pyramidHeight) {
        super(base, height);
        this.pyramidHeight = pyramidHeight;
    }

    public double getPyramidHeight() {
        return this.pyramidHeight;
    }

    public double getVolume() {
        return ((1.0 / 3.0) * this.getArea() * this.pyramidHeight);
    }
}
