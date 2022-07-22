public class SonataFactory extends CarFactory {
	@Override
	public Car produceCar() {
		Car car = null;
		car = new Car(Car.SONATA);
		return car;
	}
}
