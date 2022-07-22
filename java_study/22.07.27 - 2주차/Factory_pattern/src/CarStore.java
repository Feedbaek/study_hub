public class CarStore {
	public Car orderCar(String name) {
		Car car = null;
		CarFactory factory = null;

		if(name.equalsIgnoreCase(Car.SONATA))
			factory = new SonataFactory();
		else if(name.equalsIgnoreCase(Car.GRANDEUR))
			factory = new GrandeurFactory();
		else if(name.equalsIgnoreCase(Car.GENESIS))
			factory = new GenesisFactory();
		else
			factory = new NonameFactory();

		car = factory.produceCar();
		return car;
	}
}
