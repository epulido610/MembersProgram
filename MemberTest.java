/*
Ethan Pulido
Lab 5 Part 2
*/
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class MemberTest{
  
  static void bubbleSort(Members[] members){
  
    for (int a = 1; a < members.length; a++)
    {
        for(int b=0; b< members.length - a; b++)
        {
        if (((members[b].getMemberName()).compareTo((members[b+1].getMemberName()))) > 0)
        {  
            Members temp = members[b];
            members[b] = members[b+1];
            members[b+1] = temp;
        }
       }     
    }
  } 
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
      
      Members[] objects = new Members[3];
      
        for (int i = 0; i<3; i++)
         {
           objects[i] = new Members();
         }
       
      int userChoice = 0;
      double due;
      String names = " ";
      double totalDues = 0;
      double avgDues = 0;
      DecimalFormat df1 = new DecimalFormat( "#.##" );
      
      System.out.println("Welcome to my program");
      System.out.println("1. to start");
      System.out.println("2. to quit");
      userChoice = input.nextInt();
      
        switch(userChoice)
         {
           case 1:
            
           int x = 0;
                  
           do{
               for(int y = 0; y < 3; y++)
                {
                  System.out.println("Enter the name for person " + (y +1));
                  names = input.next();
                  objects[y].setMemberName(names); 
                  x++;
                }
              }while(x <= 0);
                  
            int a =0;
                  
            do{
                for(int i = 0; i < 3; i++)
                 {
                   System.out.println("Enter the dues for person " + (i +1));
                   do{
                       due = input.nextDouble();
                     }while(due <=0);
                     objects[i].setMemberDues(due); 
                     a++;
                 }
              }while(a <= 0);
              
              
              
              avgDues = (objects[0].getMemberDues() + objects[1].getMemberDues() + objects[2].getMemberDues())/3;
              
              
              
              bubbleSort(objects);
              
              for(int i =0; i < objects.length; i++)
                {
                  System.out.println(objects[i].getMemberName() + " " + objects[i].getMemberDues());
                }
              
              System.out.println("The average dues is " + df1.format(avgDues));
                           
             break;
            
             case 2:
                  
              System.exit(0);
               
             break;
            
             default:
            
              System.out.println("Integer input only");
                     
            }

   }

}