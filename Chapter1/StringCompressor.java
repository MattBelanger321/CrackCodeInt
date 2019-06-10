class StringCompressor{
	public static void main(String[] args){
		System.out.print(compressor("aaaaMMMMnnnn"));
	}
	public static String compressor(String str){
		StringBuilder comp = new StringBuilder();
		int count = 1;
		comp.append(str+' ');
		for(int i=0;i<comp.length()-1;i++){//loops through each letter
			if(comp.charAt(i)!=comp.charAt(i+1)){//sees if there is only 1 letter in sequence
				
				comp.insert(i+1,'1');
				i++;//skips the 1 that was just inserted
			}else{
				for(int j=i+1;j<comp.length();j++){// determines number of letters in sequence
					if(comp.charAt(i) == comp.charAt(j)){//if the letters are the same add 1 to count
						count++;
					}else{
						comp.replace(i+1,j,Integer.toString(count));
						i++;
						/*since we replaced the duplicate characters the next thing
						  we want to check is right after the number NOT where J is
						  because we changed the string*/
						count = 1;
						break;
					}
				}
			}
		}
		return comp.toString();
	}
}