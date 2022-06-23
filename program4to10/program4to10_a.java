
package program4to10;
import program2.packageExa;



//import java.util.Random;
import java.util.*;

interface test{

    public void square();

}

class arithmetic  implements test
{
    
    public void square()
    {
        System.out.println("Here we use implementation function in arthmetic class ");
    }
    

}

 class thread1 implements Runnable{
    
    Thread t;
    
    thread1()
    {
        t=new Thread(this,"Thread_1");
        System.out.println("Random variable Generation "+t);
        t.start();
    }
    public void run() 
    {
        Scanner sc = new Scanner(System.in);
            try{
        System.out.println("Enter the number of Random numbers you want to generate: ");
        int  n=sc.nextInt();
     
        
        int[] a=new int[n];
        int min=0;
        int max=10000;
        
        for(int i=0;i<n;i++)
        {
            a[i]=(int)(Math.random()*(max-min+1)+min);
            System.out.println("ramdom number "+(i+1)+": "+a[i]);
        }
            }
            catch(Exception e)
            {
            }
    }
    
}

class thread2 implements Runnable{

    Thread t1;
    int m;
    thread2()
    {
       //int  m=n;
       t1=new Thread(this,"Thread_2");
       System.out.println("Thread for Square of number "+t1);
       t1.start();
    }
    
    public void run()
    {
         System.out.println("Enter the number to get Square ");
         Scanner sc = new Scanner(System.in);
         m=sc.nextInt();
       
        System.out.println("The Square of number is: " +(m*m));
    }
    

} 

class thread3 implements Runnable{

    Thread t3;
    int j;
    
    thread3()
    {
    
        t3= new Thread(this,"THread_3");
        System.out.println("Tread for cube of number "+t3);
        t3.start();
    }
    
    public void run()
    {
    
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number to get Cube ");
        
         j=sc.nextInt();
         System.out.println("The cube of number is "+(j*j*j));
        
    }

}


class myexception extends Exception
{
    myexception(String s)
    {
        super(s);
    }
}

public class program4to10_a {
 
    public static void main(String [] args) throws myexception 
    {
  
            student sachit=new student("sachit",21,2002);       //creation of object
            student suhas =new student("suhas",44,2000);
          
         
            System.out.println("Shownig 1st student");
            sachit.Display();
            System.out.println(); 
            System.out.println("Shownig 2nd student");
            suhas.Display();
            System.out.println(); 
        
            System.out.println("Displaying with the use of Inheritance concept");
            System.out.println("Shownig 3rd student");
            teacher obj123 =new teacher("rahul",45,2001,"yogesh",8 );
            obj123.Display();
            System.out.println();
            
            teacher obj1=new teacher();
        
            obj1.name="Sanjay";
            obj1.id=54;
            obj1.yob=2001;
            obj1.sobordinate="Yogesh";
            obj1.cgpa=9;
            System.out.println("Shownig 4th student");
            
            obj1.Display();
            System.out.println(); 
            
            
            program2.packageExa ma=new program2.packageExa("Ram","NIE","ISE","Bsection",56); 
            ma.Display2();
            
            System.out.println("Showing the use of Interface");
            test obj= new arithmetic() ;                                        // use of Interface
            obj.square();
            System.out.println(); 
            
            System.out.println("Shownig use of Exceptions");                    //use of excepton
            try{
              
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the name ");
             String name=sc.next();
             
             int g=name.length();
             
             if(g%2==0)
             {
                 throw new ArithmeticException ();
             }
             else
             {
                 throw new myexception(name );
             }
             
         }
         
         catch(ArithmeticException e)
         {
             System.out.println("This is a Arithmetic Exceptioin" );
            
         }
         catch(myexception e)                                                   //use of custom Exception
         {
             System.out.println("Here we are showing customized Exception: "+e);
             System.out.println(e.getMessage());
             
         }
         finally 
         {
             System.out.println("Here we showing the use of Finally function");         //use of finally function
             System.out.println(); 
         }   
         
            System.out.println("Here we showing the use of Threads");           //use of Threads
      
            thread1 obd =new thread1();
            try{
            obd.t.join();
            }
           catch(InterruptedException e){
                System.out.println("join function didnot worked here");
           }
            
            new thread2();
            new thread3();
            
            
         
    }
}
         
          
class student 
{
    String name;
    int id;
    int yob;                                                
                                                                                          


 student(String name1,int a ,int b)                              //constructor is used to initiallize when object is created(parameterized condtructor)
 {                                                              //overloading method
  this.name =name1;
  this.id=a; 
   this.yob=b;
   
}
    void Display()
    {
     System.out.println("Name of Student is "+this.name );
     System.out.println("ID is " +this.id);
       System.out.println("Date Of Birth is  "+this.yob);
         
    }

 
 student()                                                          //default constructor;
 {
   name =null;
   id=0;
   yob=0;
   
   
 }
}

class teacher extends student
{
    // String name;
   // int id;
    //int yob;                                                
           
    String sobordinate;
    float cgpa;
    
    teacher()                                                       //Deafult constructor
    {
        this.sobordinate=null;                                     //use of "this" keyword
        this.cgpa=0;
        this.id=0;
        this.name=null;
        this.yob=0;
    }
    teacher(String name2,int id2,int yob2,String sobordinate2,int grade2)           //Parametorised constructor
    {
        super.name=name2;           //use of super keyword
        super.id=id2;
        super.yob=yob2;
        
        this.sobordinate=sobordinate2;
        this.cgpa=grade2;
    }
    
    @Override
    void Display()                                                            //overridding method in display function
    {
        
        super.Display();
        System.out.println("Sobordinate of "+super.name +"is "+this.sobordinate );
        System.out.println("CGPA of "+super.name +" is "+this.cgpa );
         System.out.println();
        
    }
 }
