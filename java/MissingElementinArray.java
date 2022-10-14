import java.util.Arrays;

public class MissingElementinArray {
	

		public void main(String[] args) {

			int [] arr = {1,2,7,4,5,6,8};

			int arrayValue=arr.length+1;

			int sum = (arrayValue*(arrayValue+1)/2);

			Arrays.sort(arr);

			for (int i = 0; i < arr.length; i++) {

				sum=sum-arr[i];

			}
				System.out.println(sum);

		}

	}

