
public class pro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numArray = {34,54,64,42,34,56,44,65,87,23,57,74}; 

int biggestNumber= biggestNumber (numArray);
int smallestNumber = smallestNumber(numArray);
 
	}
	public static int biggestNumber(int[] numArray) {
		int biggest=Integer.MIN_VALUE;
		int i=0;
		while(i<numArray.length) {
			if(biggest<numArray[i]) {
				biggest=numArray[i];
			}
			i++;
		}
		System.out.println("Biggest Number is :" + biggest);
		return i;
	}
   

public static int smallestNumber(int[] numArray) {
	int smallest=Integer.MAX_VALUE;
	int i=0;
	while(i<numArray.length) {
		if(smallest>numArray[i]) {
			smallest=numArray[i];
		}
		i++;
	}
	System.out.println("Smallest Number is :" + smallest);
	return i;
}
} 

