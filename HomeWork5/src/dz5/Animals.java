package dz5;

import java.util.Random;

public abstract class Animals {

    protected String name;
    protected float maxLengthRun;
    protected float maxLengthSwim;
    protected float maxHeightJump;
    private final Random random = new Random();


    public Animals (String name){
        this.name = name;
    }

    public Animals (String name, float maxLengthRun, float maxHeightJump, float maxLengthSwim){
        this.name = name;
        this.maxHeightJump = maxHeightJump * random.nextFloat() + maxHeightJump/2;
        this.maxLengthRun = maxLengthRun * random.nextFloat() + maxLengthRun/3;
        this.maxLengthSwim = maxLengthSwim * random.nextFloat() + maxLengthSwim/4;
    }

    public Animals (String name, float maxLengthRun, float maxHeightJump){
        this.name = name;
        this.maxHeightJump = maxHeightJump;
        this.maxLengthRun = maxLengthRun;
    }

    public float getMaxHeightJump() {
        return maxHeightJump;
    }

    public float getMaxLengthRun() {
        return maxLengthRun;
    }

    public float getMaxLengthSwim() {
        return maxLengthSwim;
    }

    public String run (float length){
        if(maxLengthRun >= length) {
            return(name + " пробежал " + length);
        } else {
            return("У " + name + " не хватит сил пробежать " + length);
        }
    }


    public String swim (float length){
        if(maxLengthSwim >= length) {
            return(name + " проплыл " + length);
        } else {
            return("У " + name + " не хватит сил проплыть " + length);
        }
    }

    public String jump (float height){
        if(maxHeightJump >= height) {
            return(name + " порыгнул на " + height);
        } else {
            return("У " + name + " не хватит сил прыгнуть на " + height);
        }
    }



}
