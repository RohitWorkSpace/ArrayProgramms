//find the prod of even number in an array

package ArrayPract;

public class ProdEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prod = 1;
		int[] arr = { 5, 12, 4, 21, 8, 2, 3, 7, 9, 11 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				prod = prod * arr[i];

		}
		System.out.println(prod);
	}

}
