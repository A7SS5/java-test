import java.util.ArrayList;

public class removeSameOject {
    public static<E> ArrayList <E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> list1=new ArrayList<>();
        for (E e:list) {
            if (!list1.contains(e))
            {
                list1.add(e);
            }
        }
        return list1;
    }

public static void main(String[] args)
{
    ArrayList<String> list1=new ArrayList<>();
    list1.add("Tom");
    list1.add("Tom");
    list1.add("Sam");
    list1.add("Alice");
    list1.add("Sam");
    System.out.printf(removeDuplicates(list1).toString());
}
}
