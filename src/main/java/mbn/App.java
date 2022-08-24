package mbn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        MapImpl<String, Integer> map = new MapImpl<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.remove("two"));
    }
}
