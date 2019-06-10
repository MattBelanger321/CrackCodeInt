//one away
class OneAway{
	public static void main(String[] args){
		System.out.printf("%b\n%b\n%b\n%b\n",oneAway("pale","ple"),oneAway("pales","pale"),oneAway("pale","bale"),oneAway("pale","bake"));
	}
	public static boolean oneAway(String str1, String str2){
		String temp;
		int counter = 0;
		if(str2.length()>str1.length()){//Makes str1 longer than str2
			temp = str2;
			str2 = str1;
			str1 = temp;
		}
		if(str2.length() != str1.length()){
			for(int i=0;i<str2.length();i++){
				if(counter == 0){
					if(str1.charAt(i) == str2.charAt(i)){
						continue;
					}else if(str1.charAt(i) != str2.charAt(i)){
						counter++;
					}
				}else if(counter == 1){
					if(str1.charAt(i+1) == str2.charAt(i)){
						continue;
					}else if(str1.charAt(i+1) != str2.charAt(i)){
						return false;
					}
				}
			}
		}else{
			for(int i=0;i<str2.length();i++){
				if(counter == 0){
					if(str1.charAt(i) == str2.charAt(i)){
						continue;
					}else if(str1.charAt(i) != str2.charAt(i)){
						counter++;
					}
				}else if(counter == 1){
					if(str1.charAt(i) == str2.charAt(i)){
						continue;
					}else if(str1.charAt(i) != str2.charAt(i)){
						return false;
					}
				}
			}
		}
		return true;
	}
}