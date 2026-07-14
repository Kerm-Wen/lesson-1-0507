package basic;

public class Condition {
    public static void main(String[] args) {
        int score = 98;

        if(score>=90){
            System.out.println("超棒");
        } else if ((score<90)&&(score>=80)) {
            System.out.println("很好");
        } else if(score >= 60 && score < 80) {
            System.out.println("好");
        } else {
            System.out.println("請加油");
        }



        for(int index=1; index<=100; index++){
            System.out.println(index);
        }

        for(int i=1; i<=9; i++){
            for(int k=1; k<=9; k++){
                int result = i * k;
                System.out.print(i + "X" + k + "=" +result + "\t");
            }
            System.out.println("");
        }





    }        
}
    
        

