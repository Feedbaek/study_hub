public class GenesisFactory extends CarFactory{
	@Override
	public Car produceCar() {
		Car car = null;
		car = new Car(Car.GENESIS);
		return car;
	}
}
