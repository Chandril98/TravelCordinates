/*A man start at 0 0 position . First turn he move to the right for 10 units then moves to upword for 20 units.
then moves to left turn for 30 units . then moves to downword for 40 units. then moves to right for 50 units.
input = number of turns
output = corordinates (eg: 20 20)*/

/*1st turn >>pos X = 10 pos Y = 0
  2nd turn >>pos X = 10 pos Y = 20
  3rd turn >>pos X = -20 pos Y = 20
  4th turn >>pos X = -20 pos Y = -20
  5th turn >>pos X = 30 pos Y = -20
  6th turn >>pos x = 30 pos Y = 40
  7th turn >>pos X = -40 pos Y = 40
   */

  import java.util.*;
  public class Travel2
  {
      public static void main(String args[])
      {
          int posX =0,posY=0;
          Scanner sc = new Scanner (System.in);
          System.out.println("Enter the number of turn :");
          int n = sc.nextInt();
          System.out.println("For traveling backword give a negetive value");
          System.out.println();
          for (int i=0;i<n;i++)
          {
              System.out.println("For "+i+" turn Enter the x unit :");
              int X = sc.nextInt();
              System.out.println("For "+i+" turn Enter the y unit :");
              int Y = sc.nextInt();

              if (i%2==0)
              {
                  posX = posX +X;
              }

              else
              {
                  posY = posY +Y;
              }
              //System.out.println(posX+" "+posY);
          }
          System.out.println();
      System.out.println("After "+n +" turn coordinates will be:"+posX+" "+posY);
      }
  }