import java.util.Scanner;

public class StringBuilderMainProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two strings");
        String a= sc.nextLine();
        String b= sc.nextLine();
      while(true) {
          System.out.println("1.append\n2.length\n3.capacity\n4.reverse\n5.charAt\n6.delete\n7.insert\n8.replace\n9.index0f\n10.subString\n11.subSequence");
          int choice = sc.nextInt();
          switch (choice) {
                case 1 -> append(a, b);
                case 2 -> length(a, b);
                case 3 -> capacity(a, b);
                case 4 -> reverse(a, b);
                case 5 -> charAt(sc, a, b);
                case 6 -> delete(sc, a, b);
                case 7 -> insert(sc, a, b);
                case 8 -> replace(a, b);
                case 9 -> indexOf(sc, a, b);
                case 10 -> subString(a, b);
                case 11 -> subSequence(a, b);
                default -> {break;
                }
            }
        }
    }
    private static void append(String a,String b)
    {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("appended string is"+stringBuilder.append(a).append(b));

    }
    private static void length(String a,String b)
    {
        System.out.println("length of first string is\t"+a.length());
        System.out.println("length of 2nd string is\t"+b.length());

    }
    private static void capacity(String a,String b)
    {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("capacity string is"+stringBuilder.append(a).append(b).capacity());

    }
    private static void reverse(String a,String b)
    {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("reverse of string is"+stringBuilder.append(a).append(b).reverse());

    }
    private static void charAt(Scanner scanner,String a,String b)
    {
        System.out.println("enter the position");
        int position = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(" string is"+stringBuilder.append(a).append(b).charAt(position));

    }
    private static void delete(Scanner scanner,String a,String b)
    {
        System.out.println("enter the position");
        int startposition = scanner.nextInt();
        int endposition = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        String x = a + b;
        String y = String.valueOf(stringBuilder.append(x).delete(startposition,endposition));
        System.out.println("deleted string is"+ y);


    }
    private static void insert(Scanner scanner,String a,String b)
    {
        System.out.println("enter the position");
        int position = scanner.nextInt();;
        String insert = scanner.nextLine();
       StringBuilder stringBuilder = new StringBuilder();
        System.out.println("string is"+stringBuilder.append(a).append(b).insert(position,insert));
    }
    private static void replace(String a,String b){
        Scanner scanner = new Scanner(System.in);
    String replaced;
        StringBuilder stringBuilder = new StringBuilder();
        String x  = String.valueOf(stringBuilder.append(a).append(b));
        System.out.println("string"+x);

        System.out.println("enter the string to replace and give another string");
        String replace = scanner.nextLine();
            replaced = scanner.nextLine();
            System.out.println("string is"+x.replace(replace,replaced));

        scanner.close();
    }
    private static void indexOf(Scanner scanner,String a,String b)
    {
        Scanner sc = new Scanner(System.in);
        String c = a + b;
        System.out.println(c);
        System.out.println("enter the string to replace and give another string");
        String index = sc.nextLine();
        System.out.println("string is"+c.indexOf(index));
    }
    private static void subString(String a,String b)
    {
        Scanner scanner = new Scanner(System.in);
        int start,end;
        StringBuilder stringBuilder = new StringBuilder();
        String x  = String.valueOf(stringBuilder.append(a).append(b));
        System.out.println("string"+x);

        System.out.println("eneter start index and end index");
         start = scanner.nextInt();
        end = scanner.nextInt();
        System.out.println("string is"+x.substring(start,end));

        scanner.close();
    }
    private static void subSequence(String a,String b)
    {
        Scanner scanner = new Scanner(System.in);
        int start,end;
        StringBuilder stringBuilder = new StringBuilder();
        String x  = String.valueOf(stringBuilder.append(a).append(b));
        System.out.println("string\t"+x);
        System.out.println("eneter start index and end index");
        start = scanner.nextInt();
        end = scanner.nextInt();
        System.out.println("string is\t"+x.subSequence(start,end));

        scanner.close();

    }
}