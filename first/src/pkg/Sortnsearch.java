package pkg;

public class Sortnsearch {
	public void binarySearch(int[] list, int desiredNum) {
		double divisor = 2;
		boolean found = false;
		boolean inArray = false;
		int listLengthInt = list.length;
		double listLength = (double)listLengthInt;
		for(int x = 0; x<list.length-1;x++) {
			if(list[x]==desiredNum) {
				inArray=true;
			}
		}
		if(inArray) {
			while(!found) {
				int length = (int) (listLength/divisor);
				
				if(list[length]==desiredNum) {
					System.out.println("Number Found at index:  " + length);
					found = true;
				}
				else if(list[length]>desiredNum) {
					//System.out.println("Num too high" + "\t" + divisor);
					divisor*=2;
				}
				else if(list[length]<desiredNum) {
					//System.out.println("Num too low" + "\t" + divisor);
					divisor*=0.75;
				}
			}
		}
		else {
			System.out.println("Your number is not in the provided array.");
		}
	}
	public void linearSort(int[] list) {
		int holdVal = 0;
		while(!isSorted(list)) {
			for(int x = 0; x<list.length-1;x++) {
				holdVal=list[x+1];
				if(list[x]>=list[x+1]) {
					list[x+1]=list[x];
					list[x]=holdVal;
				}
			}
		}
		for(int y = 0; y<list.length; y++) {
			System.out.println(list[y]);
		} 
	}
	public boolean isSorted(int[] list) {
		boolean sorted = true;
		int x = 0;
		while(list.length-1>x&&sorted==true){
			if(list[x]<=list[x+1]) {
				x++;
			}
			else {
				sorted=false;
			}
		}
		return sorted;
	}
}
