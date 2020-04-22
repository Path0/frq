package FRQ6;

public class Payroll {
	private int[] itemsSold;
	public double[] wages;
	public Payroll(int[] items, double fixed, double per) {
		itemsSold = items;
		wages = new double[items.length];
		computeWages(fixed,per);
	}

	public double computeBonusThreshold() {
		int min = itemsSold[0];
		int max = 0;
		int sum = 0;
		int total = 0;
		for(int i : itemsSold) {
			if(i > max) max = i;
			if(i < min) min = i;
			sum += i;
			total++;
		}
		sum -= min - max;
		total -= 2;
		return (double)sum/(double)total;
	}
	
	public void computeWages(double fixedWage, double perItemWage) {
		for(int x = 0; x < itemsSold.length; x++) {
			wages[x] = 
					itemsSold[x] >= computeBonusThreshold()
					? ((perItemWage * itemsSold[x]) + fixedWage) * 1.1
					: (perItemWage * itemsSold[x]) + fixedWage;
		}
	}
}
