import java.util.Scanner;
class N3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(isRising(n)){
			System.out.println("It is Rising");
		}
		else{
			System.out.println("It is Normal");
		}
	}
	public static boolean isRising(int a){
		int max=9;
		while(a!=0){
			int rem=a%10;
			if(max>rem){
				max=rem;
			}
			else{
				return false;
			}
			a=a/10;
		}
		return true;
	}
}
//Rising number
