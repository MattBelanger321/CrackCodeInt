/*	Progam Name
	Matthew Belanger
	2019-05-14
	This program will*/
class URL{
	public static String URL(String str){
		StringBuilder URL = new StringBuilder();
		URL.append(str);
		for(int i=0;i<URL.length();i++){
			if(URL.charAt(i) == ' '){
				URL.replace(i,i+1,"%20");
			}
		}
		return URL.toString();
	}
	public static void main(String[] args){
		String word = "sub bitch pussy ass";
		System.out.print(URL(word));
	}
}