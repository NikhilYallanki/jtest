package epam.jtesting.estimates;

public class AboveStandardConstruct {
	private double costPerSqaureFeet = 1500;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}