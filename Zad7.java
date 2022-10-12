   
  // 7. **Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
 
   
   public class Zad7 {
    public static void main(String[] args) {
        
        String strTime = new String();
        for (int i = 0; i<10000; i++)
        {strTime = strTime + "=";}
        StringBuilder Time = new StringBuilder();
        for (int i = 0; i<10000; i++)
        {Time.append("=");}
        long start, finish;
        start = System.currentTimeMillis();
        for (int i = 0; i <strTime.length(); i++){
            strTime = strTime.replace("=", "равно");}
        finish = System.currentTimeMillis();
        System.out.println("String:");
        System.out.println(finish-start +" мс");

        start = System.currentTimeMillis();
        for (int i = Time.indexOf("="); i <Time.lastIndexOf("="); i++){
            Time = Time.replace(Time.indexOf("="), Time.indexOf("=")+1, "равно");}
        finish = System.currentTimeMillis();
        System.out.println("StringBuilder:");
        System.out.println(finish-start +" мс");
        }}