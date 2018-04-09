package pkg;

public class CaesarCipher {
	public void cipher(int shift) {
		char origAlphabet[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char holdAlphabet[] = new char[shift];
		char newAlphabet[] = new char[26];
		int z = 0;
		//this will create a short array
		for(int x = 0; x<shift; x++)
		{	
			holdAlphabet[x]=origAlphabet[x];
		}
		for(int y = 0; y<origAlphabet.length; y++)
		{
			if(y<origAlphabet.length-shift) {
				newAlphabet[y]=origAlphabet[y+shift];
			}
			else {				
				newAlphabet[y]=holdAlphabet[z];
				z++;
			}
		}
		//this prints the original alphabet
		for(int b = 0; b<26; b++) {
			System.out.print(origAlphabet[b]);
		}
		//this prints the new, shifted alphabet
		System.out.println("\t");
		for(int b = 0; b<26; b++) {
		System.out.print(newAlphabet[b]);
		}
	}
}
