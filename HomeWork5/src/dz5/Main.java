package dz5;

public class Main {
    public static void main (String[] args){

        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2", 0.5f, 50);
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2", 1, 1, 1);
        Bird bird1 = new Bird("bird1");
        Bird bird2 = new Bird("bird2", 1, 1);
        Horse horse1 = new Horse ("horse1");
        Horse horse2 = new Horse ("horse2", 1, 1, 1);

        Animals[] animals = {cat1, cat2, dog1, dog2, bird1, bird2, horse1, horse2};

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].run(1));
            System.out.println(animals[i].jump(50));
            System.out.println(animals[i].swim(50));
        }

    }
}
