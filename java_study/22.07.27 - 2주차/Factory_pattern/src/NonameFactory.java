public class NonameFactory extends CarFactory {
	@Override
	public Car produceCar() {
		Car car = null;
		car = new Car("noname");
		return car;
	}
}
