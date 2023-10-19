public class Program {
	public static void main(String[] args) {

		int num = 479598;
		int res = 0;
		String numSTR = Integer.toString(num);
		
		int len = numSTR.length();
		if (len != 6)
		{
			System.out.println("Error");
			return ;
		}
		for (int i = 0; i < len; i++)
		{
			char digitChar = numSTR.charAt(i);
            res += Character.getNumericValue(digitChar);
		}
		System.out.println(res);
	}
  }