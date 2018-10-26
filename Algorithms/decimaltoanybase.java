import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=new Scanner(System.in).nextInt();
int b=new Scanner(System.in).nextInt();
int ans=0;
int m=1;
while(n!=0) {
	int r=n%b;
	ans=ans+r*m;
	n=n/b;
	m=m*10;
}
System.out.println(ans);
	}

}
