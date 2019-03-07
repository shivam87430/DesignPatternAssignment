package Questions.question6;

interface Pizza {
    String info();
}


class Onion implements Pizza {
    int onion_quantity;

    public Onion(int onion_quantity) {
        this.onion_quantity = onion_quantity;
    }

    public int getOnion_quantity() {
        return onion_quantity;
    }

    public void setOnion_quantity(int onion_quantity) {
        this.onion_quantity = onion_quantity;
    }

    @Override
    public String info() {
        return "A pizza is ready with " + onion_quantity + "g quatity of onion";
    }
}


class Tomato implements Pizza {
    int tomato_quatity;

    public Tomato(int tomato_quatity) {
        this.tomato_quatity = tomato_quatity;
    }

    public int getTomato_quatity() {
        return tomato_quatity;
    }

    public void setTomato_quatity(int tomato_quatity) {
        this.tomato_quatity = tomato_quatity;
    }

    @Override
    public String info() {
        return "A pizza is ready with " + tomato_quatity + "g quantity of tomato";
    }
}


class Toppings implements Pizza {
    private Pizza pizza;
    private String Toppings_types;


    public Toppings(Pizza pizza, String cheese_types) {
        this.pizza = pizza;
        this.Toppings_types = cheese_types;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getToppings_types() {
        return Toppings_types;
    }

    public void setToppings_types(String toppings_types) {
        this.Toppings_types = toppings_types;
    }

    @Override
    public String info() {
        return pizza.info() + " and toppings of " + Toppings_types;
    }
}

class CheeseQuantity implements Pizza {
    Pizza pizza;
    int cheese_quantity;

    public CheeseQuantity(Pizza pizza, int cheese_quantity) {
        this.cheese_quantity = cheese_quantity;
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCheese_quantity() {
        return cheese_quantity;
    }

    public void setCheese_quantity(int cheese_quantity) {
        this.cheese_quantity = cheese_quantity;
    }

    @Override
    public String info() {
        return pizza.info() + " and having Toppings quantity " + cheese_quantity + "g";
    }
}

public class DecoratePatternExample {
    public static void main(String[] args) {

        Onion onion = new Onion(23);
        System.out.println(onion.info());

        Toppings toppings = new Toppings(new Tomato(40), "Mozrilla");
        System.out.println(toppings.info());

        CheeseQuantity cheeseQuantity = new CheeseQuantity(new Onion(21), 23);
        System.out.println(cheeseQuantity.info());
    }
}
