package corejava;

public class strrev {
	public static void main(String[] args)
	{
		String input="hi hello!!";
		StringBuilder input1=new StringBuilder();
		input1.append(input);
		input1=input1.reverse();
		System.out.println(input1);
	}

}
