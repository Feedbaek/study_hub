public class Mocha extends CondimentDecorator {
	public Mocha(Coffee coffe) {
		this.coffee = coffe;
		this.description = coffe.getDescription() + " Adding Mocha Syrup";
	}
}
