// public class patterns {
//     public static void main(String[] args) {
//         int i,j;
//         for(i=1; i<=4; i++){
//             for(j=1;j<=i; j++){ 
//                 System.out.print("*");
//             }System.out.println();
            
//         }
        
//     }
// }


public class rightHalf{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=4; i++){
            for(int j=4; j>=i+1; j--){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}