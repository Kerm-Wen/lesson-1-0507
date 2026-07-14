package junior;

public class Pyramid {
    public static void main(String[] args) {
        int level= 10;
        // for(int i=1; i<= level; i++){
        //     for (int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        // System.out.println("");
        // }
        

        // for(int i2=1; i2<= level; i2++){
        //     if(i2%2==1){
        //         System.out.print("第" + i2 + "層為奇數");
        //     }
        //     for(int k2=1;k2<=i2; k2++){
        //         System.out.print("*");
        //     }
        // System.out.println("");
        // }


        // for (int i3=1; i3<=level; i3++){
        //     if(i3%2==1){
        //         System.out.print("第" + i3 + "層為奇數");
        //         for (int k3=1; k3<=i3; k3++){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }

        // 
        for(int i5=1;i5<=level;i5++){
            if(i5%2==1){
                System.out.print("第" + i5 + "層為奇數");
                int space = (level-i5)/2;
                for(int s=1;s<=space;s++){
                    System.out.print("_");
                }
                for(int k5=1;k5<=i5;k5++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }





    }
}

    
    
        