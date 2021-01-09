package dz5;

public class Bird extends Animals {

    public Bird (String name){
        super (name);
        maxLengthRun = 5;
        maxHeightJump = 0.2f;
    }

    public Bird (String name, float maxLengthRun, float maxHeightJump){
        super(name, maxLengthRun, maxHeightJump);
    }

    @Override
    public String swim (float length){
        return("Птицы не плавают!");
    }
}
