
public class SimpleCalculator {

    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(multiplication(2,-1));

    }
    public static int add(int...SumNum){
        int sum=0;
        for(int a:SumNum){
            sum+=a;
        }return sum;
    }

    public static int multiplication(int...MultiNum){

       int multiplication =1;

       for(int a:MultiNum){

           multiplication*= a;
       }return multiplication;
    }

}
