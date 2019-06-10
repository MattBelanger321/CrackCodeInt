/*	Progam Name
	Matthew Belanger
	2019-05-13
	This program will*/

class palinPerm{
	public static void main(String[] args){
		 System.out.print(possiblePalindrome("tacocat"));
	}
	
	public static boolean possiblePalindrome(String str){
		int size = str.length();
		boolean saftey = false;
		StringBuilder remove = new StringBuilder();
		remove.append(str);
		for(int i = 0;i<size;i++){
			if(remove.charAt(i)!=-1){//makes sure not comparing with -1
				for(int j = i+1;j<=size;j++){
					if(j==size){
						if(size%2 == 0){
							System.out.print("hi");
							return false;
						}else if(saftey){
							System.out.print("he");
							return false;
						}else{
							saftey = true;
							break;
						}
					}
					if(remove.charAt(i)==remove.charAt(j)){
						remove.replace(i,i+1,"-1");
						break;
					}
				}
			}
		}
		return true;
	}
}