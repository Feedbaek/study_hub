public class GrandeurFactory extends CarFactory {
	@Override
	public Car produceCar() {
		Car car = null;
		car = new Car(Car.GRANDEUR);
		return car;
	}
}
