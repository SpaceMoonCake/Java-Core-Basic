package dz5;

public class Cat extends Animals {


    public Cat (String name){
        super(name);
        maxLengthRun = 200;
        maxHeightJump = 2;
    }

    public Cat (String name, float maxLengthRun, float maxHeightJump){
        super(name, maxLengthRun, maxHeightJump);
    }

    @Override
    public String swim (float length){
        return("Эй! Я кот и не умею плавать!");
    }
}
