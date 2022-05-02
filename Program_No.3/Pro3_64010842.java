import java.util.Random;
public class Pro3_64010842 {

    private static double[] selectSort(double num[]){
        int n = num.length;
        for(int i = 0; i < n-1; i++){
            int indexMin = i;
            for(int j = i+1; j < n; j++)
                if(num[j]<num[indexMin])
                    indexMin = j;
            double temp = num[indexMin];
            num[indexMin] = num[i];
            num[i] = temp;
        }
        return num;
    }

    private static void printNum(int num[]){
        int n = num.length;
        for(int i=0; i<n; ++i){
            if((i+1)%10==0 && i!=0)
            System.out.println(num[i]+" ");
            else
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");
    }

    private static void printDoubleNum(double num[]){
        int n = num.length;
        for(int i=0; i<n; i++){
            if((i+1)%10==0 && i!=0){
                System.out.println(String.format("%.2f",num[i])+" ");
            }
            else
            System.out.print(String.format("%.2f",num[i])+" ");
        }
        System.out.println(" ");
    }

    private static int[] genPalindrome(int num){
        int[] palindrome;
        palindrome = new int[num];
        int i=2;
        int j=0;

        while(j<num){
            if(checkPalindrome(i)){
                if(checkPrime(i)){
                    palindrome[j]=i;
                    i++;
                    j++;
                }
            }
            i++;
        }
        return palindrome;
    }

    private static boolean checkPalindrome(int n){
        String str = Integer.toString(n);
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        }
        return true;
    }

    private static boolean checkPrime(int n){
        int m=0;
        //f=0;
        m=n/2;
        if(n<=1){
            return false;
        }
        else{
            for(int i=2; i<=m; i++){
                if(n%i==0)
                return false;
            }
            return true;
        }
    }

    private static double[] genNum(int num){
        Random rand = new Random();
        double[] randNum;
        randNum = new double[num];
        for(int i=0; i<num; i++){
            randNum[i]=rand.nextDouble()*1000;
        }
        return randNum;
    }

    public static void main(String[] args){
        StopWatch stopWatch = new StopWatch();
        int[] num;
        double[] randNum,sortNum;
        randNum = genNum(1000);
        System.out.println("Creating a list containing 1000 elements,");
        printDoubleNum(randNum);
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        stopWatch.start();
        sortNum = selectSort(randNum);
        stopWatch.stop();
        printDoubleNum(sortNum);
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is " + stopWatch.getElapsedTime() + " milliseconds");
        System.out.println("-----------------------------------------------------------");

        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        stopWatch.start();
        num = genPalindrome(100);
        stopWatch.stop();
        printNum(num);
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+stopWatch.getElapsedTime()+" milliseconds");
    }
}
