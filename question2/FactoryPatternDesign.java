package Questions.question2;

interface Types {
    void isType();
}

class Triangle implements Types {

    @Override
    public void isType() {
        System.out.println("This is a Triangle");
    }
}

class Quadilateral implements Types {

    @Override
    public void isType() {
        System.out.println("This is a quadilateral");
    }
}

class Pentagon implements Types {

    @Override
    public void isType() {
        System.out.println("This is a pentagon");
    }
}

class Hexagon implements Types {

    @Override
    public void isType() {
        System.out.println("This is a Hexagon");
    }
}

class Polygon{
    Types types;

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }
}


class FactoryObject{
    static Polygon getPolygonObject(int sides){
    Polygon polygon=new Polygon();
    switch (sides) {
        case 3: polygon.setTypes(new Triangle());
            break;
        case 4: polygon.setTypes(new Quadilateral());
            break;
        case 5: polygon.setTypes(new Pentagon());
            break;
        case 6: polygon.setTypes(new Hexagon());
            break;
    }
    return polygon;
    }

}
public class FactoryPatternDesign {
    public static void main(String[] args) {
        Polygon triangle=FactoryObject.getPolygonObject(3);
        triangle.getTypes().isType();
        Polygon quadilateral=FactoryObject.getPolygonObject(4);
        quadilateral.getTypes().isType();
        Polygon pentagon=FactoryObject.getPolygonObject(5);
        pentagon.getTypes().isType();
        Polygon Heaxagon=FactoryObject.getPolygonObject(6);
        Heaxagon.getTypes().isType();
    }

}
