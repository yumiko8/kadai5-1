import java.util.Scanner;

public class IntToEng {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	if(n==1) return"one";
	    	else if(n==2) return "twe";
	    	else if(n==3) return "three";
	    	else if(n==4) return "four";
	    	else if(n==5) return "five";
	    	else if(n==6) return "six";
	    	else if(n==7) return "seven";
	    	else if(n==8) return "eight";
	    	else if(n==9) return "nine";
	    	else if(n==10) return "ten";
	    	else if(n==11) return "eleven";
	    	else if(n==12) return "twelve";
	    	else if(n==13) return "thirteen";
	    	else if(n==15) return "fifteen";
	    	else if(n<=19) return translateEng(n-10)+"teen";
	    	else if(n==14) return "";
	    	else if(n==15) return "";
	    	else if(n==16) return "";
	    	else if(n==17) return "";
	    	return "";
	    }

}
