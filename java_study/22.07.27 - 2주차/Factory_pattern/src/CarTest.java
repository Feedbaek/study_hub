public class CarTest {
	public static void main(String[] args) {
		CarStore store = new CarStore();
		Car car = null;

		car = store.orderCar("Sonata");
		System.out.println(car);

		car = store.orderCar("Genesis");
		System.out.println(car);

		car = store.orderCar("Grandeur");
		System.out.println(car);

		car = store.orderCar("What?");
		System.out.println(car);
	}
}
