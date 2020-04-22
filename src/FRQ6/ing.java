package FRQ6;

public class ing {

	
	public static void findIngs(String[] s) {
		for (String st : s) {
			if(st.substring(st.length()-3).equals("ing")) {
				System.out.println(st);
			}
		}
	}
}
