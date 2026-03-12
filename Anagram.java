package Incresol;

public class Anagram {
public static void main(String[] args) {
	String s="silent".toLowerCase();
	String s1="listen".toLowerCase();
	
	char a1 []=s.toCharArray();
	char a2 []=s1.toCharArray();
	
	if (a1.length!=a2.length) {
		System.out.println("Not a anagram");
//		return false;
	}
	
	char alphabetcount []=new char [26];
	for(char a:a1) {
		alphabetcount[a-'a']++;
	}
	for(char a:a2) {
		alphabetcount[a-'a']--;
	}
	
	for(int count :alphabetcount) {
		if(count!=0) {
			System.out.println("not a anagram");
			return;
		}
		else {
			System.out.println("is anagram");
			return;
		}
			
	}
	
	
}
}
