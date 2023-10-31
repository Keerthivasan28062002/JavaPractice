class Bank{
    String bankName;
    String location;
    String ifsc;
    Bank(){
        bankName="SBI";
        location="chennai";
        ifsc="sbi1075";
        infoOfBank();
    }
    public void infoOfBank(){
        System.out.printf(bankName+"\n"+location+"\n"+ifsc+"\n");
    }  
}
public class Main
{
	public static void main(String[] args) {
	    Bank b=new Bank();
	    b.bankName="INDIAN";
	    b.location="Coimbatore";
	    b.ifsc="abc1995";
	    b.infoOfBank();
	}
}
