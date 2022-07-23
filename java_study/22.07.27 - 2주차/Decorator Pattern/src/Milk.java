public class Milk extends CondimentDecorator {
	public Milk(Coffee coffe) {
		this.coffee = coffe;
		this.description = coffe.getDescription() + " Adding Milk";
	}
}
