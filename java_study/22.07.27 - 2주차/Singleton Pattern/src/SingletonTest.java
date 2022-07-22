public class SingletonTest {
	public static void main(String[] args) {
		CarStore storeA = CarStore.getStore();
		CarStore storeB = CarStore.getStore();

		System.out.println(storeA == storeB);
	}
}
