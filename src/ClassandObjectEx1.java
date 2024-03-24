

    class Car{
        String make;
        String model;
        String color;
        int price;

        boolean isLocked = false;
        // functionalities

        void drive(){
            System.out.println("ZOOM ZOOM ZOOM");
        }
        void lock(){
            isLocked = true;
            System.out.println("Car is Locked");
        }
        void unlock(){
            isLocked = false;
            System.out.println("Car is unlocked now");
        }

        public void displayInfo(){
            System.out.println("Make: "+ make);
            System.out.println("Model: "+ model);
            System.out.println("Color: "+ color);
            System.out.println("Price: "+ price);
        }

    }

    public class ClassandObjectEx1 {

        public static void main(String[] args) {
            Car myCar = new Car();
             myCar.make = "BMW";
             myCar.color = "Black";
            myCar.price = 1000;


            myCar.displayInfo();
            myCar.drive();
            myCar.lock();
            myCar.unlock();
        }
    }

