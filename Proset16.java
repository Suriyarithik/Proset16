# Proset16
import java.util.Scanner;
public class Proset16 {
public static void Candy1(int num,int[] ratings)
{
  int sum=0;
  for(int i=0;i<num;i++){
    int p=1;
    int p1=2;
    if(ratings[i]>ratings[i-1]&&i>0)
    {
      p=p+1;
      sum+=p;
    }
    else
    {
      sum+=p1;
      p=1;
    }
    }
  System.out.println(sum);
  
}
public static void main(String[] args)
 {
  Scanner scr =new Scanner(System.in);
  int num=scr.nextInt();
  int i=0;
  int[] ratings=new int[num];
  ratings[i]=scr.nextInt();
  Candy1(num,ratings);
  }
}
