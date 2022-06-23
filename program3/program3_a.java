
package program3;

import java.util.*;

class student{
    int usn;
    String name;
    String branch;
    int phone;

    void setdata(int usn,String name,String branch,int phone)
    {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }
    
    void display()
    {
        System.out.println("The usn is "+usn);
        System.out.println("The name of student is "+name);
        System.out.println("the brnach of student is "+branch);
        System.out.println("the phone number is "+phone);
    }
}
 public class program3_a{
    public static void main(String [] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        n = sc.nextInt();
        
            student[]  st = new student[n];
            
            for(int i=0;i<n;i++)
            {
                st[i] = new student();
            }

            for(int i=0;i<n;i++)
            {
                System.out.println("Enter usn,name ,branch,mobile ");
               
                int usn = sc.nextInt();
                String name  = sc.next();
                String branch = sc.next();
                int mobile = sc.nextInt();
                st[i].setdata(usn,name,branch,mobile);
            }
            
            
             System.out.println();
            for(int i=0;i<n;i++)
            {
                 System.out.println("The detials of Student "+i+1+"is:");
                st[i].display();
            }

    }
}