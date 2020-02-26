package epam.jtesting.estimates;

public class HighStandardConstruct {
	private double costPerSqaureFeet = 1800;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}