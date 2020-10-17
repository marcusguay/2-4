import java.util.Scanner;

class D6 {

    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       boolean run = true; 
       
       while(run == true){
      
       int roll = 0;        
         int x=sc.nextInt();
         int i=0;
         int f=0;
         
         while(i < x){
        roll = (int) (Math.random()*100) + 1;
        System.out.print(roll);
        f=f+roll;
        i++;
    }
    System.out.println("");
    System.out.print(f);
    System.out.println(" 'true' to run again,'false to quit'");
    run=sc.nextBoolean();
   
    
    
}
}
}