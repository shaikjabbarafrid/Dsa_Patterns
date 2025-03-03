// public class CapTriangle {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             for(int j=5; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=(i*2)-1; k++){
//                 if(k>1 && k<(i*2)-1){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
            
//             System.out.println();
//         }
//     }
    
// }
public class CapTriangle{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            for(int l=2; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}