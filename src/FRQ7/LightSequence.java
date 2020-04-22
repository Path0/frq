package FRQ7;

public class LightSequence {
	private String sequence;
	
	public LightSequence(String seq) {
		sequence = seq;
	}
	
	
	public void insertSegment(String segment, int ind) {
		String first = sequence.substring(0,ind);
		String last = sequence.substring(ind);
		changeSequence(first+segment+last);
	}
	
	public void changeSequence(String seq) {
		sequence = seq;
	}
	
	public void display() {
		System.out.println(sequence);
	}
}
