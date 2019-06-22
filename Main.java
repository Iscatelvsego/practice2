package test;

class A{
    int i;
    {i=5;}
    void a(){
        System.out.println("Bicycle.ride() "+i);
    }

}

public class Main {

    public static void main(String args[]) {
        System.out.println("Bicycle.ride()");
        A a1 = new A();
        a1.a();
    }
}


    }


