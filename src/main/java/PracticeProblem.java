import java.util.ArrayList;
import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> arraylist, int index1, int index2) {
		String temp = arraylist.get(index1);
		arraylist.set(index1, arraylist.get(index2));
		arraylist.set(index2, temp);
	}

	public static ArrayList<Double> createArrayList(double[] doublearray) {
		ArrayList<Double> result = new ArrayList<>();

		for (int i = 0; i < doublearray.length; i++) {
			result.add(doublearray[i]);
		}

		return result;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] namesarray, int[] agesarray) {
		HashMap<String, Integer> result = new HashMap<>();

		for (int i = 0; i < namesarray.length; i++) {
			result.put(namesarray[i], agesarray[i]);
		}

		return result;
	}

	public static void increaseAge(HashMap<String, Integer> agemap, String name) {
		int currentage = agemap.get(name);

		agemap.put(name, currentage + 1);
	}

}
