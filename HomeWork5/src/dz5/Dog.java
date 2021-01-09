package dz5;

public class Dog extends Animals {

    public Dog (String name){
        super (name);
        maxLengthRun = 500;
        maxHeightJump = 0.5f;
        maxLengthSwim = 10;
    }

    public Dog (String name, float maxLengthRun, float maxHeightJump, float maxLengthSwim ){
        super(name, maxLengthRun, maxHeightJump,maxLengthSwim);
    }

}
