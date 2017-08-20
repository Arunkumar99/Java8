
public class Calculator {
	public static void main(String[] args){
		int result=1+2;
		System.out.println("1+2="+result);
		int newResult=result;
		result=newResult-1;
		System.out.println("3-1="+result);
		newResult=result;
		result=newResult*2;
		System.out.println("2*2="+result);
		String firstString="this is string concatenation";
	    String secondString="this is also";
		String thirdString=firstString+secondString;
		System.out.println(thirdString);
		int i=3;
		i++;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println("multiply="+i*i);
	}

}
