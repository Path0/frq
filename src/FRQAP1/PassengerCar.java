package FRQAP1;

public class PassengerCar extends TrainCar {
	private double totalWeight;
	private int maxPassengers;
	public PassengerCar(double baseWeight, int maxPass) {
		super(baseWeight);
		totalWeight = getTotalWeight();
		maxPassengers = maxPass;
	}

	@Override
	public double getTotalWeight() {
		return getBaseWeight() + 300;
	}

}
