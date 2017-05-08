import java.util.Random;
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Solution sol = new Solution();
		int[] a1= null;
		int [] a2 ={};
		int[] a3= {-5 };
		int[] a4= {-5,3,2 };
		int[] a5= {7,4,-8,4 };
		int[] a6= {4,4,4 };
		sol.quickSort(a1);
		sol.quickSort(a2);
		sol.quickSort(a3);
		sol.quickSort(a4);
		sol.quickSort(a5);
		sol.quickSort(a6);
	}
	private static void checkSorted(int[] array){
		if ( array ==  null || array.length ==0){
			return;
		}
		for( int i=0 ; i < array.length -1;i++){
			if (array[i]>array[i+1]){
				System.out.println("wrong! ");
				return;
			}
		}
	}

}
class Solution{
	Random rand = new Random();
	public void quickSort(int[] array){
		if (array== null || array.length <=1){
			return;
		}
		quickSort(array,0,array.length-1);
	}
	private void quickSort(int[] array, int left, int right) {
		//[left,right]
		if(left>=right) return;
		int pivot = left + rand.nextInt(right-left +1);
		swap( array , pivot, right);
		int l = left, r = right-1;
		while (l<=r){
			if (array[l]<array[right]){
				l++;
			}else{
				swap(array,l,r);
				r--;
			}
		}
		swap(array,l,right);
		quickSort(array,left,l-1);
		quickSort(array,l+1,right);
	}
	private void swap(int[] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b]=tmp;
	}
}
