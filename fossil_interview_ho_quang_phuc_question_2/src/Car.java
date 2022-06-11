public abstract class Car implements Runnable{
    protected final int wheels = 4;
    protected final int doors = 4;
    protected final int seats = 5;
    protected int maxSpeed;

    public Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("maxSpeed="+this.maxSpeed);
        }
    }
    public void info() {
        System.out.println("wheels="+this.wheels);
        System.out.println("doors="+this.doors);
        System.out.println("seats="+this.seats);
        System.out.println("maxSpeed="+this.maxSpeed);
    }

}
