package FRQAP1;
import java.util.ArrayList;
public class Train {
	private Engine engine;
	private ArrayList<TrainCar> trainCars;
	
	public Train(Engine e, ArrayList<TrainCar> tc) {
		engine = e;
		trainCars = tc;
	}
	
	public ArrayList<TrainCar> removeExcessTrainCars() {
		ArrayList<TrainCar> cars = trainCars;
		while(engine.getMaxWeight() >= getTrainWeight(cars)) {
			cars.remove(cars.size()-1);
		}
		return cars;
	}
	
	public double getTrainWeight(ArrayList<TrainCar> tc) {
		double weight = 0.0;
		for(TrainCar t : tc) {
			weight += t.getTotalWeight();
		}
		weight += engine.getWeight();
		return weight;
	}

}
