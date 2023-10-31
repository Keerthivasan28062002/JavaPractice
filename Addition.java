import java.util.*;
class Addition{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Main
{
	public static void main(String[] args) {
		Addition a=new Addition();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		if(n==2){
		    a.add(arr[0],arr[1]);
		}
		if(n==3){
		    a.add(arr[0],arr[1],arr[2]);
		}
	}
}
