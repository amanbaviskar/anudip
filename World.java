import java.util.Scanner;




class World
{
    /**
     
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the angles of triangle");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        if(a1+a2+a3==180)
        {
            System.out.println("its a triangle");
        }

      else  if(a1<90 && a2 <90 &&a3<90)
        {
            System.out.println("its a acute angle triangle");
        }
        else if(a1==90&&a2==90&&a3==90)
       {
       
        System.out.println("its a right angle triangle ");

       }
       
       else if (a1>90&&a2>90&&a3>90) {


        System.out.println("its obtuse angle triangle");
        
       }
       else{
        System.out.println("its not a triangle");
       }



    }
}