import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Hello, World!");
     
    circle(0);
    }

       static double circle(double omkretsen)
      
    {
        double radie=33;   
        double pi= 3.14;
        double diameter=radie*2;
        double omkrets = diameter*pi;
        System.out.print(omkrets);

        return omkrets;
    }
    
    static void ritalinje(int längd)

    {
          Scanner tangentbord = new Scanner(System.in);
          int varv= 0;
        System.out.println("Skriv ett tal för att bestäma hur lång linjen är: ");
         int streck= tangentbord.nextInt();
         while (streck>varv){
        varv++;
         System.out.println("-");
         }
         
        
    }
}
