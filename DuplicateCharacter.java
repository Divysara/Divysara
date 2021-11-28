package Strings;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =  "java hello";
		System.out.println(s.indexOf('p', 0));//if the particular character is not found then it returns -1.
		StringBuilder sb  = new StringBuilder();
		
		for(int i =0; i< s.length();i++) {
			char ch = s.charAt(i);
			int index = s.indexOf(ch, i+1); // indexOf is used to find the index value of the given character in a string
					if(index==-1) {			//if the particular character is not found then it returns -1.
				sb.append(ch);	
			}		
		}	
		System.out.println(sb);
		
		//Another way for finding duplicate character
		
		StringBuilder sb2  = new StringBuilder();
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			boolean repeat = true;
			for(int j=i+1; j<s.length();j++) {
				if(ch[i]==ch[j]) {
					repeat = false;
					break;
				}
			}
			if(repeat) {
				sb2.append(ch[i]);
			}
		}
		System.out.println(sb2);
		
		
	}
	
}


