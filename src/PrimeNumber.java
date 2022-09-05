/*Write a program to print prime numbers */
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 239;
        int count =1;
        for (int i =2;i<num/2;i++){
            if (num % i==0){
                count = 0;
            }
        }
        if (count ==1)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+"is not a prime number");
    }
}
