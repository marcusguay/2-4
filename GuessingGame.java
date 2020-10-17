import java.util.Scanner;

class GuessingGame {

    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       boolean run = true; 
       int f = (int)(Math.random()*100);
       int x = sc.nextInt();
        int i=0;
         while(x != f ){
        
            if(x > f){
               System.out.println("too big");  
            }
            else {
             System.out.println("too small");   
                
                
            }
             
        
         x=sc.nextInt();
        i++;
    }
    System.out.println("it took" + ""+ i + "" + "tries to get it right");
   
 
   
    
    
}
}
