public abstract class Car implements Runnable{
    protected final int wheels = 4;
    protected final int doors = 4;
    protected final int seats = 5;
    protected int maxSpeed;
    static int print = 100;
    static Object lock = new Object();
    public Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock) {
                while (this.print != this.maxSpeed) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("maxSpeed=" + this.maxSpeed);
                if (print == 100){
                    print = 200;
                } else {
                    print = 100;
                }
                lock.notifyAll();
            }
        }
    }
    public void info() {
        System.out.println("wheels="+this.wheels);
        System.out.println("doors="+this.doors);
        System.out.println("seats="+this.seats);
        System.out.println("maxSpeed="+this.maxSpeed);
    }

}
