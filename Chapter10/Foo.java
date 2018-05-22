package Chapter10;

public class Foo {
    static int x;

    public void go(){
        System.out.print(x);
    }

    public static void main(String[]args){
        Foo myFoo = new Foo();
        myFoo.go();
    }
}

class Foo2{
     int x;

    public static void go(){
        System.out.println(x);
    }

    public static void main(String[]args){
        Foo2 myFoo2 = new Foo2();
        myFoo2.go();
    }

}

class Foo3{
    final int x;

    public void go(){
        System.out.println(x);
    }

    public static void main(String[]args){
        Foo3 myFoo3 = new Foo3();
        myFoo3.go();
    }
}

class Foo4{
    static final int x = 12;

    public void go(){
        System.out.println(x);
    }

    public static void main(String[] args){
        Foo4 myFoo4 = new Foo4();
        myFoo4.go();
    }
}

class Foo5{
    static final int x = 12;

    public void go(final int x){
        System.out.println(x);
    }

    public static void main(String[] args){
        Foo5 myFoo5 = new Foo5();
        myFoo5.go(x);
    }
}

class Foo6{
    int x = 12;

    public static void go(final int x){
        System.out.println(x);
    }

    public static void main(String[]args){
        int x = 12;
        Foo6.go(x);
    }
}
