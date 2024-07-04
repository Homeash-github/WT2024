import java.util.*;
public class duplicate_values {

  public static ArrayList<Integer> findDuplicates(int[] arr) {
    ArrayList<Integer> duplicates = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j] && !duplicates.contains(arr[j])) {
          duplicates.add(arr[j]);
        }
      }
    }
    return duplicates;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 3, 4, 5, 2, 6}; 

    ArrayList<Integer> duplicates = findDuplicates(arr);

    if (duplicates.isEmpty()) {
      System.out.println("No duplicates found in the array.");
    } else {
      System.out.println("Duplicate values: " + duplicates);
    }
  }
}
