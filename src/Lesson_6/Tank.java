package Lesson_6;

public class Tank {

    private int x;
    private int y;
    private int dir;
    private int fuel;

    Tank() {
        fuel = 100;
    }

    Tank(int x, int y) {

        fuel = 100;
        this.x = x;
        this.y = y;
    }

    Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void turnRight(){
        dir++;
        if(dir==4){
            dir = 0;
        }
    }

    public void turnLeft(){
        dir--;
        if(dir==-1){
            dir = 3;
        }
    }

    public void goForward(int i){
        if(fuel < Math.abs(i) && i < 0){
            i = -fuel;
            fuel = 0;
        } else if (fuel < Math.abs(i) && i >= 0){
            i = fuel;
            fuel = 0;
        } else{
            fuel -= i;
        }

        if (dir == 0){
            x += i;
        } else if (dir == 1){
            y += i;
        } else if (dir == 2){
            x -= i;
        } else {
            y -= i;
        }
    }

    public void goBackward(int i){
        goForward(-i);
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }
}
