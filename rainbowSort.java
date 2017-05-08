public class Solution{
	public int[] rainbowSort (int[] array){
		int i=0, j=0,k=array.length-1;
		while(j<=k){
			if(array[j]== -1){
				swap(array,i,j);
				i++;
				j++;
			}else if (array[j]==0){
				j++;
			}else{
				swap(array,j,k);
				k--;
			}

		}
	}
	private void swap(int[] array, int a , int b){
		int tmp =array[a];
		array[a]=array[b];
		array[b]=tmp;
	}
}
