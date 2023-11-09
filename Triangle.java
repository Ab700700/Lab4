public class Triangle extends Shape{
    private double height ;
    private  double base;

    public  double getHeight(){
        return height;
    }

    public double getBase(){
        return base;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public  void setBase(double base){
        this.base = base;
    }

    public Triangle(double height, double base){
        this.base = base;
        this.height= height;
    }

    public double calculateArea() {
        return (height*base)/2;
    }

    public double calculateCircumference() {
        double c = Math.pow(base,2)+Math.pow(height,2);

        return base+height+Math.sqrt(c);
    }
}
