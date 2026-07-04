import java.util.Scanner;
class N4 
{
	public static int Count(int a){
		int sum=0;

		while(a!=0){
			sum++;
			a=a/10;
		}
		return sum;
	}
	public static int Power(int e,int b){
		int power=1;
		for(int i=1;i<=e;i++){
			power=power*b;
		}
		return power;
	}
	public static boolean isArmstrong(int a,int n){
		int temp=n;
		int sum=0;

		while(n!=0){
			int rem=n%10;
			sum=sum+(Power(a,rem));
			n=n/10;
		}
		return temp==sum;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dc=Count(n);


		if(isArmstrong(dc,n)){
			System.out.println("It is Armstrong Number");
		}else{
			System.out.println("Normal.........");
		}
	}
}
//Armstrong number
