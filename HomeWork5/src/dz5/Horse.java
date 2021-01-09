package dz5;

public class Horse extends Animals {

    public Horse (String name){
        super (name);
        maxLengthRun = 1500;
        maxHeightJump = 3;
        maxLengthSwim = 100;
    }

    public Horse (String name, float maxLengthRun, float maxHeightJump, float maxLengthSwim ){
        super(name, maxLengthRun, maxHeightJump,maxLengthSwim);
    }
}
