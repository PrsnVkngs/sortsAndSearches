package pkg;

import java.util.Scanner;

public class Codingbat {
	public static void main(String[] args) {
		int[] list = {5,6,2,6,8,9,23};
		Sortnsearch s = new Sortnsearch();
		Scanner in = new Scanner(System.in);
		boolean running = true;
		String ent = " ";
		System.out.println("Enter a number for value max");
		int x = in.nextInt();
		int[] enterList = new int[x];
		for(int i = 0; i<enterList.length; i++) {
			System.out.println("Please enter a number");
			enterList[i]=in.nextInt();
		}
		for(int i = 0; i<enterList.length; i++) {
			System.out.print(enterList[i]+",");
		}
		System.out.println("Please enter a desired value for search");
		int desired = in.nextInt();
		while(running) {
			if(ent=="search") {
				System.out.println("Please enter a desired value");
				s.binarySearch(enterList, desired);
			}
			else if(ent=="sort") {
				s.linearSort(enterList);
			}
			else if(ent=="end") {
				running=false;
			}
		}
	}
	
	public static void sleepIn(boolean weekday, boolean vacation) {
		if(vacation && weekday) {
			System.out.println("Its a weekday but you're on vacation!");
		}
		else if(vacation) {
			System.out.println("Woohoo! Vacation time!!");
		}
		else if(weekday) {
			System.out.println("Its a weekday. oof");
		}
		else {
			System.out.println("Well its a weekend, time to relax for now.");
		}
	}
	
	public static void displayTime() {
		int[] list = {1,0,4,2};
		int x = 99;
		for(int y = 0; y<list.length;y++ ) {
			if(list[y]>x) {
				x=list[y];
			}
		}
		System.out.println(x);
	}
	
	public static void quest8() {
		int inches = 27;
		int feet = 0;
		while(!(inches<12)) {
			feet+=1;
			inches-=12;
		}
		System.out.println(feet);
		System.out.println(inches);
	}


 public static void modTest() {
	 int x = 0; 
	 while(x<5) {
		 if(x%2==0) {
			 x--;
			 System.out.println(x);
		 }
		 else if(!(x%2==0)) {
			 x+=3;
			 System.out.println(x);
		 }
	 }
 }
 
 public static void test() {
	 
	 int[] y = {1,3,5,6,2,9,10,7,12,8,4};
	 int max = 0;
	 
	 for(int x = 0; x<y.length; x++) {
		 if(y[x]>max) {
			 max=y[x];
		 }
	 }
	 System.out.println(max);
	 //return max;
 }
 
 /*public static void binarySearch(int[] list, int desiredNum)
 {	
	 double divisor = 2;
	 boolean found = false;
	 double listLength = list.length/divisor;
	 int length = (int) listLength;
	 
	 while(!found) {
	 if(list[length]==desiredNum) {
		 found = true;
		 System.out.println("Found at index:	" + list.length/divisor);
	 }
	 else if(list[(int) (list.length/divisor)]>desiredNum) {
		divisor*=2;
		System.out.println("Num Too High");
	 }
	 else if(list[(int) (list.length/divisor)]<desiredNum){
		 divisor*=0.75;
		 System.out.println("Num Too Low");
		 
	 }
	 }
 }
 
 public static void removeElements(int[] arr, int remIndex)
 	{
	   for ( int i = remIndex ; i < arr.length - 1 ; i++ )
	   {
	      arr[ i ] = arr[ i + 1 ] ; 
	   }
	}
 */
 }
