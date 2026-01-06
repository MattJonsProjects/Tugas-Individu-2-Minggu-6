class Vehicle {
    protected String brand;

    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}

class Motorbike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Motorbike is riding");
    }
}
