package java_exercises_1;

public class Ex1 {

    public static void ex1(String[] names){
        for(String name : names){
            System.out.println("Hello " + name);
        }
    }

    public static String ex2(String[] products){
        StringBuilder productStr = new StringBuilder();
        String lists = "";
        for (String product: products){
            productStr.append(product).append(", ");

            lists += product;
        }
        System.out.println(lists);
        return String.valueOf(productStr);
    }

    public static void main(String[] args){
        String[] table = {"Ela", "Janusz", "Grażyna", "Sara", "Kamil"};
        ex1(table);
        String[] products = {"Ser", "Szynka", "Pomidor", "Bułka", "Szczypior"};
        String result = ex2(products);
        System.out.println(result);
    }
}