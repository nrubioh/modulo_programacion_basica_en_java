public class SR{
 public static void main(String args[]){

 int i = 1, j = 99;
 
  System.out.print("Serie for: ");
  for(i=1; i<=100; i++){
   if(i<=100){
    System.out.print(i+", ");
   }
  }
  for(i=99; i>=1; i--){
   if(i>1){
    System.out.print(i+", ");
   } else{
   System.out.print(i);
   }
  }

//nuevo modo
  System.out.println("");
  System.out.println("");
//nuevo modo

  i = 1;
 
  System.out.print("Serie for intercalada: ");
  for(i=1; i<=100; i++){
   if(i<100){
    System.out.print(i+", ");
    System.out.print(j+", ");
   } else{
    System.out.print(i+", ");
    System.out.print(j);
   }
   j--;
  }
 }
}