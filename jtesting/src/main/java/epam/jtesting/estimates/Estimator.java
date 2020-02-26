package epam.jtesting.estimates;


public class Estimator {
	public double estimatedCostForConstruction(int typeOfConstruction, double AreaOfHouse, boolean Automation) {
		switch(typeOfConstruction){
		case 1:{
			if(!Automation) {
				return (new StandardConstruct().estimator(AreaOfHouse));
			}
			else {
				return -1;
			}
		}
		case 2:{
			if(!Automation) {
				return (new AboveStandardConstruct().estimator(AreaOfHouse));
			}
			else {
				return -1;
			}
		}
		case 3:{
			if(!Automation) {
				return (new HighStandardConstruct().estimator(AreaOfHouse));
			}
			else {
				return (new AutomatedHighStandardConstruct().estimator(AreaOfHouse));
			}
		}
		}
	return -1;
	}
}
