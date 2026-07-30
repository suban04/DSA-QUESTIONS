import java.util.HashSet;

public class DuplicateElement {
  public static void main(String[] args) {
     int  nums []={5, 3, 8, 5, 2, 8};
     HashSet<Integer> set = new HashSet<>();
     for(int i = 0 ;i < nums.length ;i++){
      if(set.contains(nums[i])){
        System.out.println( nums [i] + "is duplicate");
      }else{
        set.add(nums[i]);
      }
     }
  }
  
}
