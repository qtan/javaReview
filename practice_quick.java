public int[] quickSort ( int[] array){
	if(array==null || array.length<=1) {
		return array;
	}
	quickSort (array,0,array.length-1);
	return array;
}
private void quickSort (int[] array, int left, int right){
	if (left>=right) {
		return;
	}
	int pivotPos =  partition (array, left, right);
	quickSort (array , left , pivotPos-1);
	quickSort (array,pivotPos+1, right);
}
private int partition (int[] array, left, right) {
	int pivotIndex = pivotIndex(left, right);
	int pivot = array[pivotIndex];
	swap (array, pivotIndex, right);
	int leftBound = left ;
	int rightBound = right;
	while (leftBound <= rightBound) {
		if (array[leftBound] > pivot){
			swap (array,leftBound,rightBound--)
		}else {
			leftBound++;
		}
	}
	swap(array,leftBound,right);
	return leftBound;
}
private int pivotIndex (int left, int right) {
	return left + (int)(Math.random()*(right-left +1));
}
private void swap (int[] array, int a, int b){
	int tmp = array[a];
	array[a] = array[b];
	array[b] = tmp;
}