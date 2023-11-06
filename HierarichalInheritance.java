import java.util.*;
class Rbi {
	public void interest(int p,int n,int r){
       System.out.println((double)p*n*r/100.0);
	}
}

class Hdfc extends Rbi {
	public void hdfcInterest(String s) {
		System.out.print(s+" Interest: ");
	}
}

class Sbi extends Rbi {
	public void sbiInterest(String s) {
		System.out.print(s+" Interest: ");
	}
}

public class HierarchicalInheritence{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int principal=sc.nextInt();
	   int noofyears=sc.nextInt();
	   int rateofinterest=sc.nextInt();
     Sbi sbi=new Sbi();
     sbi.sbiInterest("SBI");
     sbi.interest(principal,noofyears,rateofinterest);
     Hdfc hdfc=new Hdfc();
     hdfc.hdfcInterest("HDFC");
     hdfc.interest(principal,noofyears,rateofinterest+1);
	}
}
