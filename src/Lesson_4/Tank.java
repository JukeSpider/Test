package Lesson_4;

public class Tank {
    private int position;

    public void printPosition(){
        System.out.println("The Tank is at " + position + " now.");
    }

    public void goForward(int position){
        this.position += position;
    }

    public void goBackward(int position){
        this.position -= position;
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
}
