import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class listsMapsSets {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>(); 

		Set<Integer> ids = new HashSet<Integer>();
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeNames.add("James");
		employeeNames.add("Linh");
		employeeNames.add("Michelle");
		employeeNames.add("Goku");
		employeeNames.add("Sarah");
		for (int i = 1; i <= employeeNames.size(); i++) {
			ids.add(i);
		}
		
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		for (Integer key : employeeMap.keySet()) {
			System.out.printf("Employee %d is %s.%n", key, employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();

		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		if (idsBuilder.charAt(idsBuilder.length() - 1) == '-') {
			idsBuilder.setLength(idsBuilder.length() - 1);			
		}

		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		System.out.println(namesBuilder.toString());
	}


}
