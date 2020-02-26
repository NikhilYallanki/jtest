package epam.jtesting.estimates;

public class StandardConstruct {
	private double costPerSqaureFeet = 1200;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}