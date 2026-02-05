package practice;

interface Parser {
	String parse(String str);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3)
			s.toUpperCase();
		else
			s.toLowerCase();
		return s;
	}
}
class MyPrinter{
	public void print(String str, Parser P) {
		str = P.parse(str);
;		System.out.println(str);
	}
}

public class MethodReferance {

	public static void main(String[] args) {

		StringParser sp=new StringParser();
		String str="Pro";
		
		MyPrinter mp=new MyPrinter();
		mp.print(str, (StringParser::convert));
	}

}
