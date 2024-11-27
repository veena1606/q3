public class Prime 
{
    public static void main(String[] args) {
        int limit = 50; // Change this to any number to set the upper limit
        System.out.println("Prime numbers up to " + limit + ":");
        
        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;
            
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        
    }
}