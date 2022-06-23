
package program2;


public class packageExa {
    
    public String name3;
    protected String collage;
    public String branch;
    protected String s;
    protected int rollno;
    
 public    packageExa(String name4,String collage2,String branch2,String ls,int rollno2 )
    {
        this.name3=name4;
        this.collage=collage2;
        this.branch=branch2;
        this.s=ls;
        this.rollno=rollno2;
        
    }    
    public void Display2()
    {
            System.out.println("Here we are making use of import from program2 package to program4to10 package");
                System.out.println("Name of the student is "+ name3);
                    System.out.println("Name of the Collage is "+collage);
                        System.out.println("Branch is "+branch);
                            System.out.println("SEction is "+s);
                                System.out.println("USN of the Student is "+rollno); 
    }
    
    
}
