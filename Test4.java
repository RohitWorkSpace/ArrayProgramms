//print 2 digits number from an array

package ArrayPract;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 12, 4, 21, 8, 2, 3, 7, 9, 11 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 9 && arr[i] < 100) {

				System.out.println(arr[i]);
			}
		}
	}

}
