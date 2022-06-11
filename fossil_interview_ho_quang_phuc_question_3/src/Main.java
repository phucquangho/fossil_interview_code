public class Main {
    public static void main (String args[]){
        Car bmwCar = new BmwCar();
        Car toyotaCar = new ToyotaCar();
        Thread bmwCarRunThread = new Thread(bmwCar);
        Thread toyotaCarRunThread = new Thread(toyotaCar);
        bmwCarRunThread.start();
        while(bmwCarRunThread.isAlive);
        toyotaCarRunThread.start();
    }
}
