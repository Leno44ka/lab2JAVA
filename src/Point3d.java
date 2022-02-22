public class Point3d extends Point2d {
    // координата Z
    private double zCoord;
    // Конструктор инициализации
    public Point3d(double x, double y, double z) {
        setX(x);
        setY(y);
        zCoord = z;
    }
    // Конструктор default
    public Point3d() {
        this(0,0,0);
    }
    // Возвращение координаты Z
    public double getZ() {
        return zCoord;
    }
    // Установка значений координаты Z
    public void setZ(double val) {
        zCoord = val;
    }
    //Метод проверки равенства точек
    public boolean isEqual(Point3d p) {
        return (this.getZ() == p.getZ() && this.getX() == p.getX() && this.getY() == p.getY());
    }
    //Метод вычисления расстояния между точками до 2 знаков после запятой
    public double distanceTo(Point3d p) {
        return Math.sqrt(Math.pow(p.getX() - this.getX(),2) + Math.pow(p.getY() - this.getY(),2) + Math.pow(p.getZ() - this.getZ(),2));
    }
}

