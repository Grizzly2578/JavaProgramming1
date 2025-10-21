
public class LoopSum {
    public static void main(String[] args){
        int last = 15;
        int init = 1;
        int sum =0;
//        for (int init = 1; init <= last; init++){
//            if (init %2 !=0){
//                sum+=init;
//            }
//        }
        while (init <= last){
            if (init %2 !=0){
                sum+=init;
            }
            init++;
        }
        System.out.println(sum);
    }
}
