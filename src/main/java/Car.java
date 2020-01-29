public class Car {

    private int speed;
    private int turbotime;

    public Car(int speed,int turbotime) {
        this.speed=speed;
        this.turbotime=turbotime;
    }
    public void turbo(){
        int speed=getSpeed()+100;
        setSpeed(speed);
        System.out.println("Car is damn FASZT!!!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

