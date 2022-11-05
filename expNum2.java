import java.util.Scanner;

public class expNum2{

    public static void main(String[] args) {
        
        double i , num , num2 , expNum=1 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü hesaplanacak sayıyı giriniz:");

        num = inp.nextDouble();

        System.out.print("Üssü giriniz:");

        num2 = inp.nextDouble();

        if ( num2 > 0 ){

            for(i = 1 ; i <= num2 ; i++){

                expNum *= num;
                
        }
            System.out.println("Sonuc: "+expNum);
        }
        else if( num2 == 0){

            expNum = 1;

            System.out.println("Sonuc: "+expNum);

        }
        else {

            for(i = 1 ; i <= Math.abs(num2) ; i++){

                expNum *= num ;    
    
            }    

            expNum = 1 / expNum ;

            System.out.println("Sonuc: "+expNum);
        }
    }
}