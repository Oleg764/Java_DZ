public class Zad4_5_6 {
    public static String compilerMathToStr(int num1, int num2, char sign) {
        StringBuilder x = new StringBuilder();
        x.append(num1).append(" ").append(sign).append(" ").append(num2).append(" = ");
        if ( sign == '+') {
             
                x.append(num1 + num2);
                }
            else if (sign=='-'){
                x.append(num1 - num2);
                }
            else if(sign=='*')
                x.append(num1 * num2);
                
        
        return x.toString();
    }
    public static String nextReplacEquel(String x) {
        StringBuilder task = new StringBuilder(x);
        int index = task.indexOf("=");
        return task.replace(index, index + 1, "equel").toString();
    }
    public static String replace(String x) {
        StringBuilder task = new StringBuilder(x);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }
    public static void main(String[] args) {
    System.out.println();
    System.out.println("Примеры в виде строк:");
    int a = 3, b = 56;
    System.out.println(compilerMathToStr(a, b, '+'));
    System.out.println(compilerMathToStr(a, b, '-'));
    System.out.println(compilerMathToStr(a, b, '*'));


    System.out.println();
    System.out.println("Примеры с заменой знака '=' на слово");
    System.out.println(replace(compilerMathToStr(a, b, '+')));

    System.out.println(replace(compilerMathToStr(a, b, '-')));
    
    System.out.println(replace(compilerMathToStr(a, b, '*')));
}

}
