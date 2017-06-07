
public class mergeSort {
		public int[] mergesort(int[] array){
			if (array.length<=1|| array == null){
				return array;
			}
			int[] helper = new int  [array.length];
			mergesort(array, helper, 0, array.length-1);
			return array;
		}

		private void mergesort(int[] array, int[] helper, int left, int right) {
			// TODO 自动生成的方法存根
			if (left>=right){
				return;
			}
			int mid = left+(right-left)/2;
			mergesort(array,helper,left,mid);
			mergesort(array,helper,mid+1,right);
			merge(array,helper,left,mid,right);
		}

		private void merge(int[] array, int[] helper, int left, int mid, int right) {
			// TODO 自动生成的方法存根
			for (int i=left; i<=right;i++){
				helper[i]=array[i];
			}
			int leftIndex = left;
			int rightIndex= mid+1;
			while (leftIndex <= mid && rightIndex <=right){
				if (helper[leftIndex]<=helper[rightIndex]){
					array[left++]=helper[leftIndex++];
				}else {
					array[left++] =helper[rightIndex++];
				}
			}
			while (leftIndex <= mid){
				array[left++] = helper [leftIndex++];
			}
		}
}
		

