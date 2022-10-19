public class genericlfind {
  public static <E extends Comparable<E>> E max(E[] list) {
    E max = list[0];
    for (E o : list) {
      if (max.compareTo(o) > 0) {
        max = o;
      }
    }  

    return max;
  }
}
