import java.util.Scanner;
class N2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(isPalindrome(n)){
			System.out.println("It is a Palindrome");
		}
		else{
			System.out.println("Normal....");
		}
	}
		public static boolean isPalindrome(int a){
			int res=a;
			int temp=0;
			while(a!=0){
				int rem=a%10;
				temp=temp*10+rem;
				a=a/10;
			}
			return temp==res;
		}
	}
//Palindrome
