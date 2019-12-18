public class calc
{
    static int progression() {
        int sum = 0;
        for (int i = 1; i <= 8; i++)
            sum += i;
        return sum;
    }

    public static void main(String args[]){
        int sum = 0;
        for(int i=1;i<=8; i++)
            sum+=i;

        System.out.println (sum);
    }
}
