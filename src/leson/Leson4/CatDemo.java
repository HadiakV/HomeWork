package leson.Leson4;

public class CatDemo {
    public CatDemo() {
    }

    public static void main(String[] args ) {
        Cat myCat = new Cat();

        myCat.name = "Blayk,";
        myCat.color = "Black,";
        myCat.age = 3;

        String message = " My name - " + myCat .name + " color - " + myCat.color + " age - " + myCat.age;

        System.out.println(message);
     /*   Cat myCat2 = new Cat();
        myCat2.name = "Brain";
        myCat2.color = "Read";
        myCat2.age = 13;



        String message2 = " My name " + myCat2 .name + " color - " + myCat2.color + " age - " + myCat2.age;

        System.out.println(message2);*/


    }
}
