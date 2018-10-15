import java.util.*;
public class SPREAD2 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int n= s.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            for(int j=0;j<n;j++){
                arr.add(s.nextInt());
            }
            int day = 0;
            int total = 1;
            int left = n-1;
            while(left>0){
                day++;
                int  sum=0;
                for(int j=0;j<total;j++){
                    sum+=arr.get(i);
                }
                total = total + sum;
                left = left - sum;
            }
            System.out.println(day);
        }
    }

}
