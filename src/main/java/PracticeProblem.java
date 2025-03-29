public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int [] arr, int num){
		 try{
			int x = arr[num];
				return true;
			}
		 catch (ArrayIndexOutOfBoundsException e){
			return false;
		 }
	}
	public static int divide(int num1, int num2){
		try {
			int x = num1/num2;
			return x;
		}
		catch (ArithmeticException e){
			return 0;
		}
	}
	public static int safeConvertStringtoInt(String num){
		try {
			int number = Integer.parseInt(num);
			return number;
		}
		catch (NumberFormatException e){
			return 0;
		}
	}

}
