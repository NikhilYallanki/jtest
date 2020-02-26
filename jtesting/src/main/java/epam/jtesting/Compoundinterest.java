package epam.jtesting;

public class Compoundinterest {
	public double CompoundInterestCalculator(double principle, int compoundedPerUnit, double time, double rate) {
		return (principle * Math.pow(1 + (rate / compoundedPerUnit), compoundedPerUnit * time)) - principle;
	}
}