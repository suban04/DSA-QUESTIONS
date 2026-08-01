public class Swap {
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("Inside swap method: a = " + a + ", b = " + b);

  }
  
  public static void main(String[] args) {
    int a=10;
    int b=5;
    int [] nums ={3 ,4,6,7,3,2};
      swap(a, b);
    
  }
}
