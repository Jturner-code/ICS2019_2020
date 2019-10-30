public class StringPractice {
	public static void main(String[] args){
		String name1 = new String ("Ryan");
		String name2 = new String ("Ryan");
		System.out.printf("%s and %s\n", name1, name2);
		
		name2 = "Jack Neel Waddell";
		name1 = "Dead";
		System.out.println(name2.substring(5,9));
		System.out.println(name2.indexOf('e'));
		//for (char c: name.toCharArray()){
			//System.out.println(c);
			
	}
}

