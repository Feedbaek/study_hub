public class CoffeTest {
	public static void main(String[] args) throws Exception {
		Coffee kenya = new KenyaAmericano();
		Coffee etiopia = new EtiopiaAmericano();

		Coffee kenyaLatte = new Milk(kenya);
		Coffee kenyaMoka = new Mocha(kenyaLatte);
		//Coffee kenyaWhippedCream = new WhippedCream(kenyaMoka);

		Coffee etiopiaLatte = new Milk(etiopia);
		Coffee etiopiaMoka = new Mocha(etiopiaLatte);
		Coffee etiopiaWhippedCream = new WhippedCream(etiopiaMoka);

		System.out.println(kenya);
		System.out.println(kenyaLatte);
		System.out.println(kenyaMoka);
		System.out.println(etiopiaWhippedCream);
	}
}
