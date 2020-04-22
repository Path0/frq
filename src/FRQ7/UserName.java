package FRQ7;
import java.util.ArrayList;
public class UserName {
	private ArrayList<String> possibleNames;
	
	
	public UserName(String firstName, String lastName) {
		possibleNames = new ArrayList<String>();
		String add = "";
		for(char c : firstName.toCharArray()) {
			add+=c;
			possibleNames.add(lastName + add);
		}
	}
	
	public boolean isUsed(String name, String[] arr) {
		boolean isUsed = false;
		for(String s : arr) {
			if(name.equals(s)) {
				isUsed = true;
			}
		}
		return isUsed;
	}
	
	public void setAvailableUserNames(String[] usedNames) {
		for(String s : usedNames) {
			for(int x = 0; x < possibleNames.size(); x++) {
				if(s.equals(possibleNames.get(x))) {
					possibleNames.remove(x);
				}
			}
		}
	}
	
	public ArrayList<String> getPossibleNames() {
		return possibleNames;
	}
	
}
