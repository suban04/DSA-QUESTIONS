public class maxProduct {
  public static void main(String[] args) {
    int  [] nums ={3 ,4,6,7,3,2};

    int max1 =0 ;
    int max2 =0;

    for(int num :nums){
      if(num>max1){
        max2 =max1;
        max1=num;
      }else if(num>max2){
        max2=num;
      }
    }
    int result =(max1-1)*(max2-1);

    System.out.println("Maximun Product is  :" +result);
  }
  
}
