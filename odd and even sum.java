public class Main
{
	public static void main(String[] args) {
	    String str="9834698765123";
	    int sum1=0;
	    int sum2=0;
    for(int i=0;i<str.length();i++){
        if(i%2==0){
            sum1+=str.charAt(i)-'0';
        }
        else if(i%2==1){
            sum2+=str.charAt(i)-'0';
        }
    }
    int avg=sum1-sum2;
    System.out.print(avg);
    
	}
}
