public class Car {

    private int speed;
    private int turbotime;
    private String make;
    private String registration;

    public Car(int speed,int turbotime,String make, String registration) {
        this.speed=speed;
        this.turbotime=turbotime;
        this.make = make;
        this.registration = registration;
    }
    public void turbo(){
        int speed=getSpeed()+100;
        setSpeed(speed);
        System.out.println("Car is damn FASZT!!!");
    }
    public void drivecarefull(){
        System.out.println("Car is Carefull");
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

