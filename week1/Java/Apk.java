
public class Apk {

	public static void main(String[] args) {
		
		Apk myApk=new Apk();
		
		myApk.superMethod();
		myApk.hyperMethod();
		String result=Apk.ultraMethod("");
		System.out.println(result);
			}
			public void superMethod() {
				System.out.println("This is super method");
				
				}
			public void hyperMethod() {
				System.out.println("This is hyper method");
			}
			public static String ultraMethod(String result) {
			System.out.println("This is ultra method");
			return  result;
			}

}
