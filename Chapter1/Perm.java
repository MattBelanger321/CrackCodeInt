/*	Perms
	THIS PROJECT IS INCOMPLETE!
	Matthew Belanger
	2019-05-14
	This program will determine of 2 strings are permuataions
	of eac other*/
	
class Perm{
	public static void main(String[] args){
		System.out.print(checkPermutaion("hello","gang"));
	}
	public static boolean checkPermutaion(String str1,String str2){
		if(str1.length() != str2.length()){return false;}//automatic fail
		str1 = sort(str1);
		str2 = sort(str2);
		if(str1.equals(str2)){
			return true;
		}else{
			return false;
		}
	}
	
	public static String sort(String str){
		int size = str.length();
		char temp;
		StringBuilder sort = new StringBuilder();
		sort.append(str);
		for(int i=0;i<size-1;i++){
			if(sort.charAt(i)>sort.charAt(i+1)){
				temp = sort.charAt(i);
				sort.setCharAt(i,sort.charAt(i+1));
				sort.setCharAt(i+1,temp);
				i = -1;
			}
		}
		return sort.toString();
	}
}
