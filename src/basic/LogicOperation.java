package basic;

public class LogicOperation {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 10;
        int sum= a1+b1;
        System.out.println("數字相加"+sum);

        int a2 = 15;
        int b2 = 10;
        int sum2 = a2-b2;
        System.out.println("數字相減"+sum2);

        int a3 = 5;
        int b3 = 10;
        int sum3 = a3*b3;
        System.out.println("數字相乘"+sum3);
            
        int a4 = 15;
        int b4 = 3;
        int sum4 = a4/b4;
        System.out.println("數字相除"+sum4);

        int a5 = 15;
        int b5 = 2;
        int sum5 = a5 % b5;
        System.out.println("數字相除的餘數:" + sum5);

        int a6 = 15;
        int b6 = 15;
        boolean isEqual = (a6 == b6);
        System.out.println("a6是否等於b6:" + isEqual);

        int a7 = 15;
        int b7 = 15;
        boolean isNotEqual = (a7 != b7);
        System.out.println("a7是否不等於b7:" + isNotEqual);

        int a8 = 20;
        int b8 = 15;
        boolean greaterThan = (a8 > b8);
        System.out.println("a8是否大於b8:" + greaterThan);

        int a9 = 20;
        int b9 = 15;
        boolean lessThan = (a9< b9);
        System.out.println("a9是否小於b9:" + lessThan);

        int a10 = 20;
        int b10 = 15;
        boolean greaterThanOrEqual = (a10 >=b10);
        System.out.println("a10是否大於等於b10:" +greaterThanOrEqual);

        int a11 = 15;
        int b11 = 15;
        boolean lessThanOrEqual =(a11 <= b11);
        System.out.println("a11是否小於b11:" + lessThanOrEqual);

        int a12 = 15;
        int b12 = 13;
        int c12 = 12;
        int d12 = 14;
        boolean and1 = (b12 > c12) && (a12 > b12);
        boolean and2 = (b12 > c12) && (a12 > b12) && (c12 > d12) ;
        System.out.println("and1:" + and1);
        System.out.println("and2:" + and2);

        int a13 = 15;
        int b13 = 13;
        int c13 = 12;
        int d13 = 14;
        boolean or1 = (b13 < c13) || (a13 < b13);
        boolean or2 = (b13 > c13) || (a13 > b13) || (c13 > d13) ;
        System.out.println("or1:" + or1);
        System.out.println("or2:" + or2);

        // 反轉 !
        int a14 = 15;
        int b14 = 13;
        boolean not = !(a14 > b14);
        System.out.println("not:" +not);

        // 自增1 ++
        int a15 = 5;
        // a15 = a15 + 1;
        a15++;
        System.out.println("自增1結果:" + a15);

        // 自減1 --
        int a16 = 7;
        // a16 = a16 - 1;
        a16--;
        System.out.println("自減1結果:" + a16);

        int a17 = 8;
        a17 += 2;
        System.out.println("加法再賦值結果:" + a17);

        // 字串相加
        String test1 = "hi, ";
        // test1 = test1 + "how are you";
        test1 += "how are you";
        System.out.println("字串相加結果:" + test1);

        // 課堂練習
        int score = 50;
        int energy = 3;
        boolean hasKey = false;
        // 玩家吃掉兩顆能量球
        score += 10;
        score += 10;
        // 過關條件：分數大於等於60 且 (能量大於 5 或 有鑰匙)
        boolean canPass = (score >= 60) && (energy > 5 || hasKey);
        System.out.println(canPass);
        // 請問最後輸出的結果為何？








    }

}
