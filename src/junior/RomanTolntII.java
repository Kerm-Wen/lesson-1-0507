package junior;

public class RomanTolntII {
    public static void main(String[] args) {
        // 練習作業
        // Symbol Value
        // I        1
        // V        5
        // X        10
        // L        50
        // C        100
        // D        500
        // M        1000

        // I , II , III ,  IV ,  V  ,  VI ,  VII ,  VIII , IX , X  , XI
        // 1 , 2  , 3   ,  4  ,  5  ,  6  ,  7   ,  8    , 9  , 10 , 11

        // 有有六個地方用到了減法
        // I 在 Ｖ(5) 和 X(10) 左邊就會變成 4 跟 9
        // X 在 L(50) 和 C(100) 左邊就會變成 40 跟 90
        // C 在 D(500) 和 M(1000) 左邊就會變成 400 跟 900

        // 輸入: III
        // 輸出: 3
        // 過程: 1 + 1 + 1 = 3

        // 輸入: LVIII
        // 輸出: 58
        // 過程: 50 + 5 + 1 + 1 + 1 = 58

        // 輸入: MCMXCIV
        // 輸出: 1994
        // 過程: 1000 + 100 + 1000 + 10 + 100 + 1 + 5 = 2216 (x)

        // 輸入: M CM XC IV
        // 過程: 1000 + (100 - 1000) + (10 - 100) + (1 - 5) = 1994(o)
        // 發現規律 左邊數值比右邊數值小不能+


        String input="MCMXCIV";
        int result = 0;
        int lastValue = 0;
        for (int i=input.length()-1;i>=0; i--){
            int getValue=0 ;
            switch (input.charAt(i)) {
                case 'I':
                    getValue=1;
                    break;
                case 'V':
                    getValue= 5;
                    break;
                case 'X':
                    getValue=10;
                    break;
                case 'L':
                    getValue= 50;
                    break;
                case 'C':
                    getValue=100;
                    break;
                case 'D':
                    getValue= 500;
                    break;
                default:
                    getValue=1000;
                    break;
            }
            
            if(lastValue>getValue){
                result-=getValue;
            }else{
                result+=getValue;
            }
            lastValue=getValue;

        }
        System.out.println("轉換結果:" + result);

    }

}
