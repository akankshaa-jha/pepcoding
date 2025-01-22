/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int nod=0;
      int temp=n;
      while(temp!=0){
        temp=temp/10;
        nod++;
      }
      int div=(int)Math.pow(10,nod-1);
      System.out.println(div);
      while(div!=0){
          int q= n/div;
          System.out.println(q);
          n=n%div;
          div=div/10;
          
      }
      
      
  }
}
