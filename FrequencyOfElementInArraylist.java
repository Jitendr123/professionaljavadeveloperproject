package Jitendra;
public class CountingFrequencyOfElement {
	public static void main(String[] args) {
		int arr[]= {1,8,9,2,1,2,8,9};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			int j=i;
			int count=0;
			while(j<n) {
				if(arr[i]==arr[j]) {
					count++;
				}
				j++;
			}
				System.out.println(arr[i]+" "+count);
				sum=sum+count;
				if(sum>=n) {
					break;
				}
		}

	}
}
