public class forLoops
{
    
    public void run() {
        for (int i = 0; i <= 15 ; i++) {
            System.out.println("i is " + i + " and it is less than or equal to 15");
        }
        for (int j = 10; j != 0; j = j - 2) {
            System.out.println("j is " + j + " and it is not 0");
        }
        for (int k = 10; k != 0; k = k - 3) {
            System.out.println("k is " + k + " and it is not 0");
        } //Doesn't work because 10 is not divisible by 3
    }

    public static void main(String[] args)
    {        
        forLoops fl = new forLoops();
        fl.run();
    }
}