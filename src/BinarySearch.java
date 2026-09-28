
public class BinarySearch {
	public static int BinaryIter(int[]array,int target) {
		int startIndx=0;
		int endIndx=array.length;
		while(startIndx<=endIndx) {
			int middle=startIndx+(endIndx-startIndx)/2;
			if (array[middle]==target) {
				return middle;
			}else if(array[middle]>target) {
				endIndx=middle-1;
			}else if(array[middle]<target) {
				startIndx=middle+1;
		}
		}return-1;
		
	}
	public static int BinaryRec(int[]array,int target) {
		return BinaryRecHelp(array, target,0,array.length);
	}
	public static int BinaryRecHelp(int[]array,int target,int startIndx,int endIndx) {
		if (startIndx>endIndx){
			return -1;	
		}
		int middle =startIndx+(endIndx-startIndx)/2;
		if (array[middle]==target) {
			return middle;}
		else if(array[middle]>target) {
			return BinaryRecHelp(array, target,startIndx,middle-1);
		}
		else {
			return BinaryRecHelp(array, target,middle+1,endIndx);
		}
	}
	
	
	
	public static void main(String[] args) {
		int []array= {1,3,5,7,9,10};
		System.out.println(BinaryRec(array,10));

	}

}
