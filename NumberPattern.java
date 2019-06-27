
public class NumberPattern {
       public static void main(String args[]) {
    	   int k = 0 ;
    	   int n = 4;
    	   int i;
    	   int j;
    	   for(i = 1;i<=n;i++) {
    		   for(j = 1;j <= (n-i);j++) {
    			   System.out.print(" ");
    		   }
    		   while(k<i) {
    			   System.out.print(i+ " ");
    			   k++;
    		   }
    		   k=0;
    		   System.out.println();
    	   }
       }
}
