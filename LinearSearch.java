import java.util.Arrays;
class LinearSearch //LinearSearch in Arrays
{
	public static void main(String[] args) 
	{
		int arr[]={11,22,33,44,55,666,77,88,99};

		boolean m=false;
		int target=6;
		for(int n:arr){
			if(target==n){
				System.out.println(n);
				m=true;
			}
		}
		if(m){
			System.out.println("Present");
		}
		else{
			System.out.println("Not Present");
		}
	}
}
