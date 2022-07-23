public class WhippedCream extends CondimentDecorator {
	public WhippedCream(Coffee coffe) {
		this.coffee = coffe;
		this.description = coffe.getDescription() + " Adding WhippedCream";
	}
}
