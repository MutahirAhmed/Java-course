public class OperatorAndPrecedence {    
    public static void main(String[] args) {
        // Operators
        /*
            1)Arithmetic Operator---> +,-,*,/,%,++,--
            2) Assignment---> +=,-=,*=,/=,%=,=
            3)Comparison---> <,>,<=,>=,!=, ==
            4)Logical ---> &&,||,!
         */
        int value1 = 4;
        int value2 = 2;
        System.out.println("Addition is: " + (value1+value2));
        System.out.println("Sub is: " + (value1 - value2));
        System.out.println("Mul is: " + value1*value2);
        System.out.println("Div is: " + value1/value2);
        System.out.println("Mod is: " + value1%value2);
        System.out.println(++value1);
        System.out.println(--value1);
        System.out.println(value1+=value2);//--->value1 = value1 + value2
        System.out.println(value1-=value2);
        System.out.println(value1>=value2);
        System.out.println(!(value1>=value2));
        System.out.println((value1>value2)&&(value2<value1));
    }
}
/*            Associativity: 
++--->        left-->right  
 *,/,%---->
+,--->            
 */