package Lesson_5;

public class Tank {
    private int positionX;
    private int positionY;
    private int compass;

    public void printPosition(){
        System.out.println("The Tank is at " + positionX + ", " + positionY + " now.");
    }

    public void turnRight(){
        compass++;
        if (compass == 4){
            compass = 0;
        }
    }

    public void turnLeft(){
        compass--;
        if (compass == -4){
            compass = 0;
        }
    }

    private void makeSwitch(int distance){
        int i = 0;
        if (compass<0){
            i = compass + 4;
        } else {
            i = compass;
        }

        switch (i){
        case 0 : positionX += distance;
            break;

        case 1 : positionY += distance;
            break;

        case 2 : positionX -= distance;
            break;

        default : positionY -= distance;
        }
    }

    public void goForward(int distance){
        makeSwitch(distance);
    }

    public void goBackward(int distance){
        makeSwitch(-distance);
    }
}
