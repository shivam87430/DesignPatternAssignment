package Questions.question1;

public class SingletonExample {
    static SingletonExample singletonExample;
    String x,y;
    private SingletonExample(){
        this.x="shivam";
        this.y="saxena";
    }

    @Override
    public String toString() {
        return "SingletonExample{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }

    static SingletonExample getInstance(){
        if(singletonExample ==null){
            singletonExample=new SingletonExample();
        }
        return singletonExample;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(SingletonExample.getInstance());
        System.out.println(SingletonExample.getInstance());

    }
}


