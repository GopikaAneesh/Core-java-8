package reverse;

import java.util.Scanner;

class Reverse{
	int num,rev,t;
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		t=num;
	}
	void reverseNumber() {
	  	int d;
	  	rev=0;
	  	while(num>0) {    //1)  123>0      2)   12>0        3)1>0     4)0>0
	  		d=num%10;    //d=123%10=3          d=12%10=2      d=1%10=1
	  		rev=rev*10+d;  //rev=0*10+3=0+3=3   rev=3*10+2=32   rev=32*10+d=320+1=321
	  		num=num/10;   //num=123/10=12       12/10=1      num=1/10=0
	  		
	  	}
	  	System.out.println("Reversed num is="+rev);
	}

	//Check for paliandrome
	void checkPaliandrome() {
		if(t==rev) {
			System.out.println(t+ " is paliandrome");
		}else {
			System.out.println(t+" is not a paliandrome");
		}
	}
   
}

public class ReverseNum {

	public static void main(String[] args) {
			
		Reverse ob=new Reverse();
		ob.inputNum();
		ob.reverseNumber();
		ob.checkPaliandrome();

                       
	}

}
