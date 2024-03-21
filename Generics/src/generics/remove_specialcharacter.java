package generics;

public class remove_specialcharacter {

	public static void main(String[] args) {
		
		String s="%^%^%^%#$#$%%$%abcdefAASDHHA1234***&**";
		
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
		// it will remove all the special characters

	}

}
