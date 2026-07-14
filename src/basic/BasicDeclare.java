package basic;

public class BasicDeclare {

  public static void main(String[] args) throws Exception {  
        int x1= 100000;
        System.out.println("整數(inr):"+ x1);

        byte x2 = 127;
        System.out.println("整數(byte):"+ x2);

        long x3 = 9223372036854775807L;
        System.out.println("整數(long):" + x3);

        float weight1 = 49.4F;
        System.out.println("浮點數(float):" + weight1);

        double weight2 = 49.49;
        System.out.println("浮點數(double):" + weight2);

        char c1 = 'Y';
        System.out.println("字元(char):" + c1);

        String name = "JJ";
        System.out.println("字串(String):" + name);

        boolean isStudent =false;
        System.out.println("布林(boolean):" + isStudent);

        String[] xx777 = {"Hello", "World", "Apple", "Banana"};
        System.out.println("陣列(String)" + xx777[0]);
        System.out.println("陣列(String)" + xx777[1]);
        System.out.println("陣列(String)" + xx777[2]);
        System.out.println("陣列(String)" + xx777[3]);

        boolean[] cc1 = {true,false,true,true,false};
        System.out.println("陣列(boolean):" + cc1[0]);
        System.out.println("陣列(boolean):" + cc1[1]);
        System.out.println("陣列(boolean):" + cc1[2]);
        System.out.println("陣列(boolean):" + cc1[3]);
        System.out.println("陣列(boolean):" + cc1[4]);

    }

}
