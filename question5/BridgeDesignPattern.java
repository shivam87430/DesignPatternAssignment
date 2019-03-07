package Questions.question5;

interface Color {
    String getColorType();
}

class Red implements Color{

    @Override
    public String getColorType() {
        return "Red";
    }
}

class Blue implements Color{

    @Override
    public String getColorType() {
        return "Blue";
    }
}

class Pink implements Color{

    @Override
    public String getColorType() {
        return "Pink";
    }
}

abstract class Polygon{
    String type;
    Color color;

    public Polygon(String type,Color color){
        this.type=type;
        this.color=color;
    }
}

class Shape extends Polygon{
    String specification;
    public Shape(String type, Color color, String specification) {
        super(type, color);
        this.specification=specification;
    }

    @Override
    public String toString() {
        return specification +" is: "+color.getColorType()+type;
    }
}
public class BridgeDesignPattern {
    public static void main(String[] args) {
        Shape shape=new Shape("Square",new Blue(),"Polygon");
        System.out.println(shape);
        Shape shape1=new Shape("Square",new Red(),"polygon");
        System.out.println(shape1);
        Shape shape2=new Shape("Triangle",new Pink(),"Polygon");
        System.out.println(shape2);
    }

    }

