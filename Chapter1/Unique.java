/*	Progam Name
	Matthew Belanger
	2019-05-13
	This program will
*/

class Unique{
	public static void main(String args[]){
		System.out.printf("%b", isUnique("abcdefghijklmnopqrstuvwxyzq"));
	}
	
	
	public static boolean isUnique(String str){
		for(int i=0; i<str.length()-1;i++){
			for(int j = i+1; j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
}