package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.List;

public class Main1copy {
    static int abc;
    private static String str;

    public static void main(String[] args) {  // public static void main  можно назвать функцией
        Variant v1 = new Variant("x", 1234567, "AT", "TTG");
        if (!v1.getChr().equalsIgnoreCase("x"))    {  //работает с булевыми выражениями
            System.out.println(v1.getVariantAsStringHG38());
        } else if(v1.getRef().contains("T")) {System.out.println(v1.getRef());
        }

        else {System.out.println(v1.getVariantAsString());   //если только предыдущие оба условия не были выполнены
        }
        if (v1.getPos() >= 1000000) {
              System.out.println(v1.getVariantAsString());

        if (v1.getRef().contains("C") && v1.getAlt().contains("C") ) {

        }

        }

        List<Integer> integerList = List.of(0,1,2,3,4,5);
        for (int i: integerList) {
            System.out.println(i);
        }

            List<String> strings = List.of("A","B","C","D","E");
            for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
            }

            System.out.println(strings.get(0));
            for (String s: strings) {
                System.out.println(s);
            }

        List<String> infinite = List.of("A","B","C","D","E");
        while (infinite.size()< 1000000) {
            System.out.println("s");
        }
            do {
                System.out.println("s");
            } while (true);

            }


        }



        /*for (
                int i = 0;
                i < 50; i++)*/
        /* for (
                int i = 49;
                i >= 0; i--)    */

        //цикл  - итерируемся через целочисленное значение, начинающееся с "0"
        /*{
            System.out.println(i);
        }*/
    /*
        List<Integer> integerList = List.of(0,1,2,3,4,5);  // [0] [1] [2] [3] [4] [5]
        for (Integer iii: integerList) {
            System.out.println(iii);
        List<String> strings = List.of("A", "B", "C", "D","E");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        System.out.println(strings.get(0));
        for (String s: strings
        {System.out.println(s);

        }

           /* for (String s: strings) {
                System.out.println(s);
        }
    }
}





        NewClass newClass = new NewClass();
        System.out.println(newClass.getSum(0,1));
        int ad = 0;
        String st = "ava";
        getNothing(st);
        str = "10";
        String st1 = st + "aaa";
        getNothing(st1);


        Variant v1 = new Variant("x",1234567,"AT","TTG" );

         System.out.println(v1.getVariantAsString());
        v1.setAlt("TTAA");
         System.out.println(v1.getVariantAsString());

        if (v1.getChr() != "x")   {                                //== это эквивалентно, идентично
            System.out.println(v1.getVariantAsStringHG38());


        if (v1.getChr().equalsIgnoreCase("x"))    {     //equalsIgnoreCase - для строковых принято в JAVA
           System.out.println(v1.getVariantAsStringHG38());




      if (!v1.getChr().equalsIgnoreCase("x"))    {  //работает с булевыми выражениями
                System.out.println(v1.getVariantAsStringHG38());
        } else if(v1.getRef().contains("T")) {System.out.println(v1.getRef());
            }

           else {System.out.println(v1.getVariantAsString());   //если только предыдущие оба условия не были выполнены
           }

           switch (v1.getRef())  {             //работает с объектами (такими как строка)

               case "A": {
                   System.out.println("A");
                   break;
               }
               case "T": {
                   System.out.println("T");
                   break;
               }
           }



        //if (v1.getPos() >= 1000000) {
        //    System.out.println(v1.getVariantAsString());
       // }

        /*int a = 0;//==0
        boolean b = false;//== false;
        double d = 0.0;//0.0;

        String[] st;     //класс массива для строк
        ArrayList<String> ar = new ArrayList();
        System.out.println("Barev Dzes");    // System.out.println можно назвать функцией
        String sta = "10";
        //sta.length();
        //getNothing(String.valueOf(a)); // упоминаем метод, который нам необходимо использовать в рамках метода main,
                      // можем передать туда значение, которое хотим, чтобы в последствии было напечатано
        getNothing(String.valueOf(b));
         System.out.println("SUM OF 1 & 2" + " " + sum(1,2));


    }

    private static <text> void getNothing(String text) {
                          //  void - тип возвращаемого значения; getNothing - его название
                          // () - передаваемые параметры (или никаких параметров)
                          // (String txt)   передаваемые параметры - строковый текст
                          // фигурные скобки - можно вызвать функцию (печати)

        //System.out.println("Print Nothing");
        System.out.println(text);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    public static Integer sumI(int a, int b)  {
        return a + b;
    }


    protected static void getSt() {
            System.out.println(str);
        }

    public static int getAbc() {
        return abc;
    }

        public static void setAbc ( int abc){
            Main1.abc = abc;
        }
    }
*/
