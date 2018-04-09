package pkg;

//import java.util.Random;

public class CoinFlip {
	public static void main(String[] args) {
		
		cs1(15);
		
		/* int totalHeads = 0;
		int totalTails = 0;
		
		Random rand = new Random();1
		
		
		for(int x = 1;x<=100;x++) {
			int n = rand.nextInt(2);
			if(n==1){totalHeads+=1;}
			else if(n==0) {totalTails+=1;}
			
		}
		System.out.println("Total Heads" + "\t" + totalHeads);
		System.out.println("Total Tails" + "\t" + totalTails);
		
		*/
		
	}
	
	public static void cs1(int y) {
		int currentNum = 10;
		int[] array = new int[y];
		for(int x=0;x<=array.length - 1;x++) {
			array[x] = (currentNum * 2 + 1) % 13;
			currentNum=array[x];
		}
		for(int x = 0;x<=array.length - 1;x++) {
			System.out.println(array[x]);
		}
	}
	
	public static void cs2() {
		int sum = 0;
		for(int x = 1;x<=20;x++) {
			if(x%2==0) {
				sum+=x;
			}
		}
		System.out.println(sum);
	}
	
}
