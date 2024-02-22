import java.util.ArrayList;
import java.util.List;

public class MakeTwoArrays {
    public static boolean canBeEqual(int[] target, int[] arr){
        List<Integer> temp = new ArrayList<>();
        for (int i=0; i<target.length; i++){
            temp.add(target[i]);
        }
        for (int i=0; i< arr.length; i++){
            if (temp.contains(arr[i])){
                temp.remove(temp.indexOf(arr[i]));
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] target = {3,7,9};
        int[] arr = {3,7,11};

        System.out.println(canBeEqual(target, arr));
    }
}
