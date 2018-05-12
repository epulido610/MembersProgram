/*
-----------------------------------------
             Class Members
-----------------------------------------
               private
-----------------------------------------
-memberName:String
-memberDue:Double
-members[]:String
-----------------------------------------
                public
-----------------------------------------
+Members()
+setMemberName(String: nam:)void
+getMemberName():String
+setMemberDue(double: due):void
+getMemberDue():double
+printMembers(String[]: memb):void
*/
import java.util.Arrays;

public class Members{

   private String memberName;
   private double memberDue;
   private String[] members = new String[3];

   public Members()
      {
         memberName = " ";
         memberDue = 0.00;
      }
   void setMemberName(String nam)
      {
         memberName = nam;
      }
   String getMemberName()
      {  
         return memberName;
      }
   void setMemberDues(double due)
      {
        memberDue = due;    
      }
   double getMemberDues()
      {
         return memberDue;
      }
   void printMember(String[] memb)
      {
        System.out.println(memb);
      }


}