public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("xecutcit'","100");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("xecutcit2'","2200");
        System.out.println(Car.numberOfCars);

        Car car3 = new Car("xecutcit3'","400");
        System.out.println(Car.numberOfCars);



    }
}
