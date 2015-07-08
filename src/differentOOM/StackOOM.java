package differentOOM;

public class StackOOM {

	private static void fun(){
		fun();
	}
	
	/**
	 * VM arg  -Xss128K
	 * @param args
	 */
	public static void main(String[] args) {
		fun();
	}

}
