package AutomationTask3;

public class Circle {
    int radius;
    Circle(){
        this.radius=0;
    }

    Circle(int radius){
        this.radius=radius;
    }
    public double calculate(){
         double Circumference = 2*3.14*radius;
        return Circumference;
    }
    public static void main(String[] a){
        Circle cir=new Circle();
        cir.calculate();
        System.out.println("The circumference of the circle is "+ cir.calculate());
        Circle cir2=new Circle(5);
        cir2.calculate();
        System.out.println("The circumference of the circle is "+ cir2.calculate());
    }
}
